package com.julianvalencia.resistorvalue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.result)

        val calcular = findViewById<Button>(R.id.calculator_valor)
        val color_uno = findViewById<Spinner>(R.id.franja_uno)
        val color_dos = findViewById<Spinner>(R.id.franja_2)
        val color_tres = findViewById<Spinner>(R.id.franja_3)
        val color_tol = findViewById<Spinner>(R.id.franja_tol)

        calcular.setOnClickListener {
            val texto_uno = color_uno.selectedItem.toString()
            val texto_dos = color_dos.selectedItem.toString()
            val texto_tres = color_tres.selectedItem.toString()
            val texto_tol = color_tol.selectedItem.toString()

            val info = texto_uno + "\n" + texto_dos + "\n" + texto_tres + "\n" + texto_tol

            textView.text = info

        }


    }

}