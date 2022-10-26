package com.shrl.jobsheet19s

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nilai = findViewById<EditText>(R.id.input_nilai)
        val cekbtn = findViewById<Button>(R.id.cekbtn)

        cekbtn.setOnClickListener {
            cekhasilnilai(nilai.text.toString().toInt())
        }

    }

    fun cekhasilnilai(nilai: Int) {
        if (nilai >= 86 && nilai <= 100) {
            Toast.makeText(this, "A", Toast.LENGTH_SHORT).show()
        }
        else if (nilai >= 76 && nilai <= 85) {
            Toast.makeText(this, "B", Toast.LENGTH_SHORT).show()
        }
        else if (nilai >= 66 && nilai <= 75) {
            Toast.makeText(this, "C", Toast.LENGTH_SHORT).show()
        }
        else if (nilai >= 51 && nilai <= 65) {
            Toast.makeText(this, "D", Toast.LENGTH_SHORT).show()
        }
        else if (nilai >= 0 && nilai <= 50) {
            Toast.makeText(this, "E", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(this, "Tidak ada", Toast.LENGTH_SHORT)
        }


    }
}

