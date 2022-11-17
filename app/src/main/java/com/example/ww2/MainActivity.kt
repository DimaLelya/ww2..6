package com.example.ww2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun OnClickGoMain(view: View) {
        val intent = Intent(this, AndryxaevActitvity::class.java)
        startActivity(intent)
    }

    fun OnClickMain(view: View) {
        val intent = Intent(this, GizatulinActivity::class.java)
        startActivity(intent)
    }

    fun ClickMain(view: View) {
        val intent = Intent(this, GurevActivity::class.java)
        startActivity(intent)
    }

    fun Click(view: View) {
        val intent = Intent(this, ZuzinActivity::class.java)
        startActivity(intent)
    }

    fun Go(view: View) {
        val intent = Intent(this, ZyikovActivity::class.java)
        startActivity(intent)
    }

    fun Rar(view: View) {
        val intent = Intent(this, GredinActivity::class.java)
        startActivity(intent)
    }

    fun Donskix(view: View) {
        val intent = Intent(this, DonskixActivity::class.java)
        startActivity(intent)
    }
}