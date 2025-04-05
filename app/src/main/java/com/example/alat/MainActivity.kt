package com.example.alat

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        var btn = findViewById<MaterialButton>(R.id.btn_login)

        btn.setOnClickListener {
            Toast.makeText(this, "Welcome To Slice It Up!", Toast.LENGTH_SHORT).show()

            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)


            var btn = findViewById<MaterialButton>(R.id.btn_login)



            }


        }
    }


