package com.example.beginnerelayoutkt2

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login = findViewById<EditText>(R.id.login)
        val parol = findViewById<EditText>(R.id.pw)
        val res = findViewById<TextView>(R.id.res)
        val signin = findViewById<Button>(R.id.signin)

        signin.setOnClickListener { view: View? ->
            res.text = "Login: ${login.text}\nParol: ${parol.text}"
        }
    }
}