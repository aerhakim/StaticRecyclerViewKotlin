package io.github.aerhakim.androidfundamental

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class KalkulatorActivity : AppCompatActivity() {

    lateinit var angka1: EditText
    lateinit var angka2: EditText
    lateinit var kali: Button
    lateinit var bagi: Button
    lateinit var kurang: Button
    lateinit var tambah: Button
    lateinit var hapus: Button
    lateinit var hasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)
        angka1 = findViewById(R.id.angka1)
        angka2 = findViewById(R.id.angka2)
        kali = findViewById(R.id.kali)
        bagi = findViewById(R.id.bagi)
        kurang = findViewById(R.id.kurang)
        tambah = findViewById(R.id.tambah)
        hasil = findViewById(R.id.hasil)
        hapus = findViewById(R.id.hapus)

                kali.setOnClickListener {
                        val angka1 = angka1.text.toString().trim().toFloat()
                        val angka2 = angka2.text.toString().trim().toFloat()
                        val hitung = angka1 * angka2
                        hasil.text = hitung.toString()
                }

                bagi.setOnClickListener {
                val angka1 = angka1.text.toString().trim().toFloat()
                val angka2 = angka2.text.toString().trim().toFloat()
                val hitung = angka1 / angka2
                hasil.text = hitung.toString()
                }

                kurang.setOnClickListener {
                val angka1 = angka1.text.toString().trim().toFloat()
                val angka2 = angka2.text.toString().trim().toFloat()
                val hitung = angka1 - angka2
                hasil.text = hitung.toString()
                }

                tambah.setOnClickListener {
                val angka1 = angka1.text.toString().trim().toFloat()
                val angka2 = angka2.text.toString().trim().toFloat()
                val hitung = angka1 + angka2
                hasil.text = hitung.toString()
                }

                hapus.setOnClickListener {
                    angka1.getText().clear();
                    angka2.getText().clear();
                }


    }
}