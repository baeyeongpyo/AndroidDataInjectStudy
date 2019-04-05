package com.yoengpyo.daggerstudy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var cat : Cat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerCatComponent
            .builder()
            .catModule(CatModule)
            .build()
            .Inject(this)

        Log.i("print Dagger", "dagger Data : ${cat.name}")

    }
}
