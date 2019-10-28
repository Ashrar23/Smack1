package com.example.drawerlayout

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar.*
import kotlinx.android.synthetic.main.drawer_header.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        init()


    }

    fun loginbtn (view:View){
        val loginpage = Intent(this,LoginActivity::class.java)
        startActivity(loginpage)
    }




    fun init() {
        val toogle = ActionBarDrawerToggle(Activity(),drawer_layout,toolbar,R.string.nav_open,R.string.nav_close)
        drawer_layout.addDrawerListener(toogle)
        toogle.syncState()

    }
}
