package com.example.submission_akhir_app_android_sederhana.activity

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import com.bumptech.glide.Glide
import com.example.submission_akhir_app_android_sederhana.R
import com.example.submission_akhir_app_android_sederhana.data.DataBuku
import com.example.submission_akhir_app_android_sederhana.databinding.ActivityDetailBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.io.File
import java.io.FileOutputStream

class DetailActivity : AppCompatActivity() {

    private var dataBuku: DataBuku? = null
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dataBuku = intent.getParcelableExtra("EXTRA_DATA_BUKU")

        if (dataBuku == null) {
            finish()
            return
        }

        setupListeners()
        showData()
    }

    private fun setupListeners() {
        binding.icBack.setOnClickListener {
            finish()
        }

        binding
        binding.actionShare.setOnClickListener {
            dataBuku?.let { buku ->
                downloadAndShareImage(buku.phtoUrl ?: "-")
            }
        }
    }

    private fun showData() {
        dataBuku?.let { buku ->
            binding.apply {
                bookTitle.text = buku.judul ?: "-"
                bookAuthor.text = buku.penulis ?: "-"
                penerbit.text = buku.penerbit ?: "-"
                Glide.with(this@DetailActivity)
                    .load(buku.phtoUrl)
                    .placeholder(R.drawable.blank_profile)
                    .into(bookCover)
               tvDesc.text = buku.deskripsi ?: "-"
                tvJumlahHal.text = buku.jumHal?.toString() ?: "-"
                tvBahasa.text = buku.bahasa ?: "-"
                tvDimensi.text = buku.dimensi ?: "-"
                tvBerat.text = buku.berat?.toString() ?: "-"
                tvTanggalTerbit.text = buku.tanggalTerbit ?: "-"
                tvISBN.text = buku.isbn ?: "-"
            }
        }
    }

    private fun downloadAndShareImage(image: String)= runBlocking {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val file = File(externalCacheDir, "${dataBuku?.judul}.jpg")

                val bitmapDeferred = async {
                    Glide.with(this@DetailActivity)
                        .asBitmap()
                        .load(image)
                        .submit()
                        .get()
                }

                val bitmap = bitmapDeferred.await()

                FileOutputStream(file).use { outputStream ->
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream)
                }

                shareImage(file)
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    Toast.makeText(this@DetailActivity,"gagal mendownload gambar", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private suspend fun shareImage(file: File) {
        withContext(Dispatchers.Main) {
            val bookImageUri: Uri = FileProvider.getUriForFile(
                this@DetailActivity,
                "${packageName}.fileprovider",
                file
            )

            val shareText = shareText()

            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, shareText)
                putExtra(Intent.EXTRA_STREAM, bookImageUri)
                type = "image/jpeg"
                addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            }

            val popUp = Intent.createChooser(shareIntent, "Bagikan buku ini dengan...")
            startActivity(popUp)
        }
    }

    private fun shareText(): String {
        return buildString {
            //share this at WhatsApp for the '*' can be working
            append("*Judul Buku:* ${dataBuku?.judul ?: "-"}\n")
            append("*Penulis:* ${dataBuku?.penulis ?: "-"}\n")
            append("*Penerbit:* ${dataBuku?.penerbit ?: "-"}\n")
            append("*Deskripsi:* \n${dataBuku?.deskripsi ?: "-"}\n")
            append("*Jumlah Halaman:* ${dataBuku?.jumHal ?: "-"}\n")
            append("*Bahasa:* ${dataBuku?.bahasa ?: "-"}\n")
            append("*Dimensi:* ${dataBuku?.dimensi ?: "-"} cm\n")
            append("*Berat:* ${dataBuku?.berat ?: "-"}\n")
            append("*Tanggal Terbit:* ${dataBuku?.tanggalTerbit ?: "-"}\n")
            append("*ISBN:* ${dataBuku?.isbn ?: "-"}")
        }
    }
}