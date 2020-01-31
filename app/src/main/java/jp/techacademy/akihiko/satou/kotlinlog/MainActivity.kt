package jp.techacademy.akihiko.satou.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.util.Log
import java.lang.Exception
import android.app.Activity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("佐藤", 26, "旅行")      // 名前を佐藤、年齢26歳で、Humanのインスタンスを作る

        human.say()
        human.think()

        val human2 = Human("田中", 40, "写真")    // 名前を彰彦、年齢40歳で、Humanインスタンスを作る
        human2.say()
        human2.think()
    }

}
