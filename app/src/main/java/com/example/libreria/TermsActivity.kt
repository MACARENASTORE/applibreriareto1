package com.example.libreria

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class TermsActivity : AppCompatActivity() {

    private lateinit var termsTextView: TextView
    private lateinit var acceptCheckBox: CheckBox
    private lateinit var acceptButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_terms)

        // Enlazamos los elementos del layout con el código
        termsTextView = findViewById(R.id.termsText)
        acceptCheckBox = findViewById(R.id.acceptCheckBox)
        acceptButton = findViewById(R.id.acceptButton)

        // Cargamos los términos y condiciones desde strings.xml
        termsTextView.text = getString(R.string.terms_and_conditions)

        // Habilitamos el botón solo si el usuario acepta los términos y condiciones
        acceptCheckBox.setOnCheckedChangeListener { _, isChecked ->
            acceptButton.isEnabled = isChecked
        }

        // Configuramos el listener para el botón de aceptar
        acceptButton.setOnClickListener {
            if (acceptCheckBox.isChecked) {
                // Aquí puedes añadir la lógica para continuar con el proceso de registro
                // Por ejemplo, cerrar esta actividad si se aceptan los términos
                finish()
            }
        }
    }
}
