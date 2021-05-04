package ru.myitacademy.samsung.threereceivers

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val r1 = MyReceiver1()
    val r2 = MyReceiver2()
    val r3 = MyReceiver1()
    val r4 = MyReceiver3()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val filter = IntentFilter("ru.myitacademy.samsung.advertising.POST")
        registerReceiver(r1, filter.apply { priority = 17 })
        registerReceiver(r2, filter.apply { priority = -7 })
        registerReceiver(r3, filter.apply { priority = 0 })
        registerReceiver(r4, filter.apply { priority = 7 })
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(r1)
        unregisterReceiver(r2)
        unregisterReceiver(r3)
        unregisterReceiver(r4)
    }
}