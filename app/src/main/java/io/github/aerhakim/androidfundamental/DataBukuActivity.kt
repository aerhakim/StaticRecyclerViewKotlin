package io.github.aerhakim.androidfundamental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class DataBukuActivity : AppCompatActivity() {

    private val list = ArrayList<BukuModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_buku)

        val rvBuku:RecyclerView = findViewById(R.id.rv_buku)

        rvBuku.setHasFixedSize(true)
        rvBuku.layoutManager = LinearLayoutManager(this)

        Config.instances.getBuku().enqueue(object : Callback<ArrayList<BukuModel>>{

        })

    }
}

