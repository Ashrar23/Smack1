package com.example.drawerlayout

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.create_user_activity.*
import kotlin.random.Random

class Create_User_Activity : AppCompatActivity() {
    var useravatar ="profiledefualt"
    var avatarcolor = "[0.5,0.5,0.5,1]"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_user_activity)
    }

    fun  generateUserAvatar(view: View) {
        val random = java.util.Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt(28)
        if (color == 0) {
            useravatar = "light$avatar"
        } else {
            useravatar = "dark$avatar"
        }
        val resourseid = resources.getIdentifier(useravatar, "drawable", packageName)
        createavatarimageview.setImageResource(resourseid)
    }

    fun generateBGcolor (view: View){
        val random = java.util.Random()
        val  r = random.nextInt(255)
        val g = random.nextInt(255)
        val b = random.nextInt(255)

        createavatarimageview.setBackgroundColor(Color.rgb(r,g,b))

    }

    fun oncreateuser (view: View){

    }
}