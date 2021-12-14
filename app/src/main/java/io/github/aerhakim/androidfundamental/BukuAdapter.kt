package io.github.aerhakim.androidfundamental

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BukuAdapter(private val mList: List<BukuModel>) : RecyclerView.Adapter<BukuAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_buku, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]
        holder.gambar.setImageResource(ItemsViewModel.gambar)
        holder.judul.text = ItemsViewModel.judul
        holder.harga.text = ItemsViewModel.harga
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val gambar: ImageView = itemView.findViewById(R.id.iv_gambar)
        val judul: TextView = itemView.findViewById(R.id.tv_title)
        val harga: TextView = itemView.findViewById(R.id.tv_harga)
    }
}
