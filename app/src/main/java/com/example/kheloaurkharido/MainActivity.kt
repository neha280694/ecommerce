package com.example.kheloaurkharido

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var edtUserName = findViewById(R.id.edtUserName) as EditText
        var edtpassword = findViewById(R.id.edtpassword) as EditText
        var btnsubmit = findViewById(R.id.btnsubmit) as Button
        btnsubmit.setOnClickListener {
            val edtUserName = edtUserName.text;
            val edtpassword = edtpassword.text;
            val intent = Intent(this,Dashboard::class.java)
            startActivity(intent)

        }
    }
}