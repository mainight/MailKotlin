package com.kotlin.usercenter.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin.usercenter.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mRegisterBtn.setOnClickListener {
            Toast.makeText(this, "注册", Toast.LENGTH_SHORT).show()
        }
    }
}