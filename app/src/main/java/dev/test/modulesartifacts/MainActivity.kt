package dev.test.modulesartifacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.test.modulesartifacts.feature1.Feature1
import dev.test.modulesartifacts.feature2.Feature2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Hello world!")
        println("5*5 = ${Feature1().execute(5)}")
        println("!false = ${Feature2().execute(false)}")
    }
}