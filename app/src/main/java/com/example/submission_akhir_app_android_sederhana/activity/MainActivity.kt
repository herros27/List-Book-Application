package com.example.submission_akhir_app_android_sederhana.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.submission_akhir_app_android_sederhana.adapter.ItemAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.submission_akhir_app_android_sederhana.R
import com.example.submission_akhir_app_android_sederhana.data.DataBuku
import com.example.submission_akhir_app_android_sederhana.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var rvItem: RecyclerView
    private lateinit var itemAdapter: ItemAdapter

    private val listBuku: List<DataBuku> = DataBuku.getListBuku()


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.aboutPage.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }

        setupRecyclerView()
        displayData()
    }

    private fun setupRecyclerView() {
        itemAdapter = ItemAdapter(ArrayList())
        rvItem = findViewById(R.id.rvCard)
        rvItem .apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = itemAdapter
        }

        itemAdapter.setOnItemClickCallback(object : ItemAdapter.OnItemClickCallback {
            override fun onItemClicked(dataBuku: DataBuku) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("EXTRA_DATA_BUKU", dataBuku)
                startActivity(intent)

            }
        })
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun displayData() {

        itemAdapter.listItem.apply {
            clear()
            addAll(listBuku)
        }
        itemAdapter.notifyDataSetChanged()

    }
}