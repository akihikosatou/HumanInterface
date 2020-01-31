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

        /*var t = total(50,100)

        Log.d("kotlintest",t.toString())

        val messageView: TextView = findViewById(R.id.message_view)
        messageView.text = t.toString() */

        val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.say()  // ポチが吠えます（ログ出力）
        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")

        val bigdog = BigDog("ハチ", 10)    // 名前をハチ、年齢10歳で、Dogインスタンスを作る
        bigdog.say()  // ハチが吠えます（ログ出力）
        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")

        val messageView: TextView = findViewById(R.id.message_view)
        messageView.text = "犬の名前は" + dog.name + "です。"
    }

    private fun total(first:Int,last:Int): Int {
        var sum = 0
        for (i in first .. last){
            sum += i
        }


        return sum
    }
}
