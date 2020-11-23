package jp.techacademy.kentaro.kawamura.kotlinloghuman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val taro=Human("タロウ",3,"お絵描き")

        taro.say()
        taro.think()

        val hanako=Human("ハナコ",4,"ピアノ")
        hanako.say()
        hanako.think()

    }
}