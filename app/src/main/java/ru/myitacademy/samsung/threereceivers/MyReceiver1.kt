package ru.myitacademy.samsung.threereceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.Gravity
import android.widget.Toast

class MyReceiver1 : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
      var resCode = resultCode
      var res = getResultExtras(true)
      var str = res.getString("strEx")
      str += " \nПолезная информация"
       Toast.makeText(context,"Первый прочёл!",Toast.LENGTH_SHORT).apply{
            setGravity(Gravity.TOP,0,0)
            show()
        }
        Log.d("Control_toast", str)
        res.putString("strEx",str)
        setResult(++resCode,resultData,res)

    }
}

class MyReceiver2 : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        var resCode = resultCode
        var res = getResultExtras(true)
        var str = res.getString("strEx")
        str += " \nСпасибо, учтём!"
        Toast.makeText(context,"Второй прочёл!",Toast.LENGTH_SHORT).apply{
            setGravity(Gravity.CENTER,0,0)
            show()
        }
        Log.d("Control_toast", str)
        res.putString("strEx",str)
        setResult(++resCode,resultData,res)
    }
}

class MyReceiver3 : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        var resCode = resultCode
        var res = getResultExtras(true)
        var str = res.getString("strEx")
        str += " \nУдачи всем!"
        Toast.makeText(context,"Третий прочёл",Toast.LENGTH_SHORT).apply{
            setGravity(Gravity.BOTTOM,0,0)
            show()
        }
        Log.d("Control_toast", str)
        res.putString("strEx",str)
        setResult(++resCode,resultData,res)
        //abortBroadcast()
    }
}