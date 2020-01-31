package jp.techacademy.akihiko.satou.kotlinlog

import android.util.Log

open class Dog {
    // プロパティ
    var name: String
    var age: Int

    // コンストラクタ
    constructor(name: String, age:Int) {
        this.name = name
        this.age = age
    }

    // メソッド
    open fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
}