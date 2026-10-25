package com.example.korolev

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.korolev.data.PolynomialResultFormatter
import com.example.korolev.domain.PolynomialMath

class MainActivity : AppCompatActivity() {

    private lateinit var etPolynomials: EditText
    private lateinit var tvResult: TextView
    private lateinit var btnSum: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etPolynomials = findViewById(R.id.etPolynomials)
        tvResult = findViewById(R.id.tvResult)
        btnSum = findViewById(R.id.btnSum)

        etPolynomials.setText(PolynomialResultFormatter.formatInput(PolynomialMath.generateRandomPolynomials()))

        btnSum.setOnClickListener {
            tvResult.text = PolynomialMath.sumFromText(etPolynomials.text.toString())
                ?: getString(R.string.invalid_input_message)
        }
    }
}
