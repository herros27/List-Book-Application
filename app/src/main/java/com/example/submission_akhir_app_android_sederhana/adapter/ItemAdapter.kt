package com.example.submission_akhir_app_android_sederhana.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.submission_akhir_app_android_sederhana.data.DataBuku

import com.example.submission_akhir_app_android_sederhana.R

class ItemAdapter(val listItem: ArrayList<DataBuku>) : RecyclerView.Adapter<ItemAdapter.ListViewHolder>() {

    private var onItemClickCallback: OnItemClickCallback? = null

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(dataBuku: DataBuku)
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivPhoto: ImageView = itemView.findViewById(R.id.ivContent)
        val tvName: TextView = itemView.findViewById(R.id.tvJudul)
        val tvDescription: TextView = itemView.findViewById(R.id.tvOverView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listItem.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val item = listItem[position]
        holder.apply {
            tvName.text = item.judul
            tvDescription.text = item.penulis
            itemView.setOnClickListener {
                onItemClickCallback?.onItemClicked(item)
            }

        }
        Glide.with(holder.itemView.context)
            .load(item.phtoUrl)
            .placeholder(R.drawable.blank_profile)
            .into(holder.ivPhoto)


    }

}