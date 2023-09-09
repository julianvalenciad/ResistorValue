package com.julianvalencia.resistorvalue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView

    fun obtenerValorColor(color: String): Double {
        return when (color) {
            "Negro" -> 0.0
            "Marrón" -> 1.0
            "Rojo" -> 2.0
            "Naranja" -> 3.0
            "Amarillo" -> 4.0
            "Verde" -> 5.0
            "Azul" -> 6.0
            "Purpura" -> 7.0
            "Gris" -> 8.0
            "Blanco" -> 9.0

            else -> 0.0
        }
    }

    fun obtenerValorTolerancia(color: String): String {
        return when (color) {
            "Marrón" -> "Tolerancia 1%"
            "Rojo" -> "Tolerancia 2%"
            "Dorado" -> "Tolerancia 5%"
            "Plateado" -> "Tolerancia 10%"

            else -> ""
        }
    }


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


            val resistencia = (obtenerValorColor(texto_uno)*10 + obtenerValorColor(texto_dos)*Math.pow(10.0,obtenerValorColor(texto_tres))).toInt()
            val tolerancia = obtenerValorTolerancia(texto_tol)
            val info = "Su resistencia es de " + resistencia.toString()+"Ω"+ "\n" + "Con un valor de tolerancia de "+ tolerancia

            textView.text = info

        }


    }

}