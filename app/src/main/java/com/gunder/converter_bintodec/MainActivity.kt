package com.gunder.converter_bintodec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
//  inisialisasi atribut
    private var input: EditText? = null
    private var output: EditText? = null
    private var submit: Button? = null
    private var reset: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        inisialisasi variabel
        input = findViewById(R.id.input)
        output = findViewById(R.id.output)
        submit = findViewById(R.id.submit)
//        jika tombol submit ditekan
        submit!!.setOnClickListener {
            val string =input!!.text.toString()
//            ada radix = 2 karena kita akan konversi dari bin ke dec
            val i =string.toInt(radix = 2)
            val decimal = i.toString()
            output!!.setText(decimal)
        }
//        inisialisasi tombol reset
        reset = findViewById(R.id.reset)
        reset!!.setOnClickListener {
            input!!.setText("")
            output!!.setText("")
        }
    }
}