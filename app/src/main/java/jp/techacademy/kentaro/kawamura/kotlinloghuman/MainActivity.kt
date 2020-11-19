package jp.techacademy.kentaro.kawamura.kotlinloghuman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val h=Human("タロウ",3)

        h.say()
        h.think("夢")
    }
}