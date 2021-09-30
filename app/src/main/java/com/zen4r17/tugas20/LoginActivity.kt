package com.zen4r17.tugas20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etUsername: TextView = findViewById(R.id.et_username)
        val etPassword: TextView = findViewById(R.id.et_password)

        val btnLogin: Button = findViewById(R.id.btn_login)


        btnLogin.setOnClickListener {

            if (etUsername.text.trim().isNotEmpty() || etPassword.text.isNotEmpty()) {

                Toast.makeText(this, "Login Success", Toast.LENGTH_LONG)
                    .show()
                val intentDashboard = Intent(this, DashboardActivity::class.java)
                startActivity(intentDashboard)

            } else if (etUsername.text.trim().isEmpty() || etPassword.text.isEmpty()) {
                Toast.makeText(this, "Please provided Password nor Username ", Toast.LENGTH_LONG)
                    .show()

            }

        }
        val tvRegister: TextView = findViewById(R.id.tv_register)

        tvRegister.setOnClickListener {

            val intentRegister = Intent(this, RegisterActivity::class.java)
            startActivity(intentRegister)

//            val intentDashboard = Intent(this, DashboardActivity::class.java)
//            startActivity(intentDashboard)

        }
    }


}