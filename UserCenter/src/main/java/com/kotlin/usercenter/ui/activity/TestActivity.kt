package com.kotlin.usercenter.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kotlin.usercenter.R
import org.jetbrains.anko.toast

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
         toast("${intent.getIntExtra("id",-1)}")

    }
}