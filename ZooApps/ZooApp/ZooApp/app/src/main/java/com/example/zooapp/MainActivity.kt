package com.example.zooapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var listOfAnimal = ArrayList<Animal>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Load Animals
        listOfAnimal.add(Animal("Babon", "Él es Rafiki", R.drawable.baboon))

    }
}
