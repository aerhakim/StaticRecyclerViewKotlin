package io.github.aerhakim.androidfundamental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class KalkulatorActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)
        val angka1 = findViewById<EditText>(R.id.angka1)
        val angka2 = findViewById<EditText>(R.id.angka2)
        val kali = findViewById<Button>(R.id.kali)
        val bagi = findViewById<Button>(R.id.bagi)
        val kurang = findViewById<Button>(R.id.kurang)
        val tambah = findViewById<Button>(R.id.tambah)
        val hasil = findViewById<TextView>(R.id.hasil)
        val hapus = findViewById<Button>(R.id.hapus)
        val jawaban = findViewById<TextView>(R.id.jawaban)

        kali.setOnClickListener {
            val angka1 = angka1.text.toString().trim().toFloat()
            val angka2 = angka2.text.toString().trim().toFloat()
            val hitung = angka1 * angka2
            jawaban.visibility = View.VISIBLE
            hasil.visibility = View.VISIBLE
            hasil.text = hitung.toString()
        }

        bagi.setOnClickListener {
            val angka1 = angka1.text.toString().trim().toFloat()
            val angka2 = angka2.text.toString().trim().toFloat()
            val hitung = angka1 / angka2
            jawaban.visibility = View.VISIBLE
            hasil.visibility = View.VISIBLE
            hasil.text = hitung.toString()
        }

        kurang.setOnClickListener {
            val angka1 = angka1.text.toString().trim().toFloat()
            val angka2 = angka2.text.toString().trim().toFloat()
            val hitung = angka1 - angka2
            jawaban.visibility = View.VISIBLE
            hasil.visibility = View.VISIBLE
            hasil.text = hitung.toString()
        }

        tambah.setOnClickListener {
            val angka1 = angka1.text.toString().trim().toFloat()
            val angka2 = angka2.text.toString().trim().toFloat()
            val hitung = angka1 + angka2
            jawaban.visibility = View.VISIBLE
            hasil.visibility = View.VISIBLE
            hasil.text = hitung.toString()
        }

        hapus.setOnClickListener {
            angka1.getText().clear();
            angka2.getText().clear();
        }


    }
}