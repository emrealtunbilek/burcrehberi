package com.emrealtunbilek.burcrehberiapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

    }

    override fun onResume() {

        var logoDondurAnimasyon=AnimationUtils.loadAnimation(this,R.anim.logodondur)

        imgLogo.animation=logoDondurAnimasyon

        object : CountDownTimer(6000, 1000){

            override fun onFinish() {
                var intent=Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
            }

            override fun onTick(millisUntilFinished: Long) {

            }


        }.start()
        super.onResume()
    }
}
