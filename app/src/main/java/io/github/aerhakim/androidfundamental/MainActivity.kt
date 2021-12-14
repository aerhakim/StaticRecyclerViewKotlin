package io.github.aerhakim.androidfundamental

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kalkulator = findViewById<Button>(R.id.kalkulator)
        kalkulator.setOnClickListener{
            val intent = Intent(this, KalkulatorActivity::class.java)
            startActivity(intent)
        }
        val databuku = findViewById<Button>(R.id.databuku)
        databuku.setOnClickListener{
            val intent = Intent(this, DataBukuActivity::class.java)
            startActivity(intent)
        }
    }
}