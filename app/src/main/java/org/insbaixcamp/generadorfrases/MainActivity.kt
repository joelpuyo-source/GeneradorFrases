package org.insbaixcamp.generadorfrases

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val frases = listOf(
        "\"Okay.\" - Rammus 🦔",
        "\"¡Demacia!\" - Garen ⚔️",
        "\"Un verdadero maestro es un estudiante eterno.\" - Master Yi 🗡️",
        "\"¡Mundo va donde quiere!\" - Dr. Mundo 💉",
        "\"El viento me guía.\" - Yasuo 🌪️",
        "\"Atrápame si puedes.\" - Jinx 🚀",
        "\"Cree en la luz.\" - Lux 🪄",
        "\"El tamaño no lo es todo.\" - Teemo 🍄",
        "\"¡Siente el poder de las sombras!\" - Zed 🥷",
        "\"¿Te asusta la oscuridad?\" - Nocturne 🌙",
        "\"La violencia lo arregla todo.\" - Katarina 🗡️",
        "\"¡Por la gloria de Noxus!\" - Darius 🪓",
        "\"El tiempo vuela cuando te diviertes.\" - Ekko ⏳",
        "\"¡BOOM!\" - Ziggs 💣",
        "\"El mundo es un río y yo soy su rey.\" - Tahm Kench 🐸"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val card = findViewById<View>(R.id.cardFrase)
        val tvFrase = findViewById<TextView>(R.id.tvFrase)
        val btn = findViewById<Button>(R.id.btnNuevaFrase)

        btn.setOnClickListener {
            card.visibility = View.VISIBLE
            tvFrase.text = frases.random()
        }
    }
}