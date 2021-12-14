package io.github.aerhakim.androidfundamental

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView


class BukuAdapter (private val list : ArrayList<BukuModel>):RecyclerView.Adapter<BukuAdapter.BukuViewHolder>() {
    inner class BukuViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){

        val textData:TextView
        init {
            textData = itemView.findViewById(R.id.textData)
        }

        fun bind(bukuModel: BukuModel){
            val data:String = "nama : ${bukuModel.nama}\n" +
                    "gambar : ${bukuModel.gambar}\n" +
                    "harga:  ${bukuModel.harga}"

            textData.text = data
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BukuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_buku, parent, false)
        return BukuViewHolder(view)
    }

    override fun onBindViewHolder(holder: BukuViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

}