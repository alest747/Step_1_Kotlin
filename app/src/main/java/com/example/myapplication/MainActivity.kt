package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var tvText: TextView? = null   //переменная для вывода результата на экран смартфона




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a:Double = 20.3   //длина параллелепипеда
        val b:Double = 15.5   //ширина параллелепипеда

        val h:Double = 12.7   //высота
        val Volume = a * b * h  //формула расчета Обьема
        println("Объем прямоугольного параллелепипеда равен произведению длинны a($a), ширины b($b) и высоты h($h) = $Volume")   //проверка
        val displayT = "Объем прямоугольного параллелепипеда равен произведению длинны a($a), ширины b($b) и высоты h($h) = $Volume"  //переменная для вывода информации на экран смартфона





        tvText = findViewById(R.id.TvTv)
        tvText?.setText(displayT.toString())   // вывод информации на экран смартфона

    }


}