package com.example.relativelayout

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //declaration starts here
    var tvNumber: TextView? = null
    var btnPlus: Button? = null
    var btnMinus: Button? = null
    var btnMul: Button? = null
    var btnDiv: Button? = null
    var btnClear : Button?= null
    var btnSubmit : Button?= null
    var number = 0
    var inputNumber = 0
    var intValue = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Initialization Starts here
        tvNumber = findViewById(R.id.tvNumber)
        btnPlus = findViewById(R.id.btnPlus)
        btnDiv = findViewById(R.id.btnDiv)
        btnMinus = findViewById(R.id.btnMinus)
        btnMul = findViewById(R.id.btnMul)
        val etInputNum = findViewById<EditText>(R.id.etInputNum)
        btnClear = findViewById(R.id.btnClear)
        btnSubmit = findViewById(R.id.btnSubmit)

        //Code

        btnSubmit?.setOnClickListener {
            val text = etInputNum.text.toString()
            val intValue = text.toInt()

            tvNumber?.text = intValue.toString()


            btnPlus?.setOnClickListener {
                number += intValue
                tvNumber?.text = number.toString()

            }

            btnMinus?.setOnClickListener {
                number -= intValue
                tvNumber?.text = number.toString()
            }

            btnMul?.setOnClickListener {
                number *= intValue
                tvNumber?.text = number.toString()
                println(number)
            }

            btnDiv?.setOnClickListener {
                number /= intValue
                tvNumber?.text = number.toString()
            }
        }
        //    }

        btnClear?.setOnClickListener {
            tvNumber?.text = "0"
            etInputNum?.text = Editable.Factory.getInstance().newEditable("")
            //var intent = Intent(this, MainActivity::class.java)
            //startActivity(intent)
            //finish()
        }
    }
}

