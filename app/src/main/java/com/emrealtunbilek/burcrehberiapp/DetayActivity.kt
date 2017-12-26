package com.emrealtunbilek.burcrehberiapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class DetayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay)

        var position=intent.extras.get("tiklanilanOgePosition")
        Toast.makeText(this,"Tıklanılan oge pos : " + position, Toast.LENGTH_SHORT).show()

    }
}
