package com.zen4r17.tugas20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegister: MaterialButton = findViewById(R.id.btn_register)
        val edtUsername: EditText = findViewById(R.id.edt_username)
        val edtEmail: EditText = findViewById(R.id.edt_email)
        val edtPassword: EditText = findViewById(R.id.edt_password)
        val edtConfirmPass: EditText = findViewById(R.id.edt_confirm_password)
        btnRegister.setOnClickListener {

            if (edtUsername.text.toString().trim().isNotEmpty() ||
                edtPassword.text.toString().isNotEmpty() || edtEmail.text.toString().isNotEmpty()
                || edtConfirmPass.text.toString().isNotEmpty()

            ) {
                Toast.makeText(this, "Register Success", Toast.LENGTH_LONG).show()
                val intentDashboard = Intent(this, DashboardActivity::class.java)
                startActivity(intentDashboard)
            } else {
                Toast.makeText(this, "Please Provided All", Toast.LENGTH_LONG).show()

            }


        }
//
//        val tvLogin: TextView = findViewById(R.id.tv_login)

    }
}

