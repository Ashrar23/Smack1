package com.example.drawerlayout

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_main)
    }

    fun signupbtn (view: View){
        val createuser = Intent(this,Create_User_Activity::class.java)
        startActivity(createuser)
    }
}