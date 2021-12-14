package io.github.aerhakim.androidfundamental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class DataBukuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_buku)
        val recyclerview = findViewById<RecyclerView>(R.id.rv_buku)
        recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.pcs_b1, "The Art of War", "Rp. 150000"))
        data.add(BukuModel(R.drawable.pcs_b2, "Tirai Menurun", "Rp. 150000"))
        data.add(BukuModel(R.drawable.pcs_b3, "Level Up", "Rp. 150000"))
        data.add(BukuModel(R.drawable.pcs_b4, "Keberangkatan", "Rp. 150000"))

        val adapter = BukuAdapter(data)
        recyclerview.adapter = adapter

    }
}

