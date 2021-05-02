package ru.myitacademy.samsung.threereceivers

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val filter = IntentFilter("ru.myitacademy.samsung.advertising.POST")
        registerReceiver(MyReceiver1(),filter.apply { priority = 17 })
        registerReceiver(MyReceiver2(),filter.apply { priority = -7 })
        registerReceiver(MyReceiver1(),filter.apply { priority = 0 })
        registerReceiver(MyReceiver3(),filter.apply { priority = 7 })
    }
}