package com.kotlin.usercenter.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kotlin.usercenter.R
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast
import java.awt.font.TextAttribute

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mRegisterBtn.setOnClickListener {
            //startActivity(intentFor<TestActivity>("id" to 5))
            startActivity(intentFor<TestActivity>("id" to 5))
            toast("注册")
        }
    }
}