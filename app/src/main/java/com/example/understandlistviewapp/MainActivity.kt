package com.example.understandlistviewapp

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1- Adapter View : Listview
        var listview: ListView = findViewById(R.id.listview)

        // 2- Adapter
        var adapter = MyAdapter(this, generateData())

        listview.adapter = adapter
        adapter?.notifyDataSetChanged()
    }

    // 3- Data Source
    fun generateData(): ArrayList<ActorModel> {
        var movieList = ArrayList<ActorModel>()

        var movie1: ActorModel = ActorModel(
            "Hangover",
            "Zach",
            R.drawable.hangover
        )
        var movie2: ActorModel = ActorModel(
            "MNIK",
            "SRK",
            R.drawable.mnik
        )

        var movie3: ActorModel = ActorModel(
            "oso",
            "SRK",
            R.drawable.oso
        )

        var movie4: ActorModel = ActorModel(
            "fan",
            "SRK",
            R.drawable.fan
        )
        var movie5: ActorModel = ActorModel(
            "Swades",
            "SRK",
            R.drawable.swades
        )
        var movie6: ActorModel = ActorModel(
            "fan",
            "SRK",
            R.drawable.fan
        )

        var movie7: ActorModel = ActorModel(
            "fan",
            "SRK",
            R.drawable.fan
        )

        var movie8: ActorModel = ActorModel(
            "fan",
            "SRK",
            R.drawable.fan
        )
        movieList.add(movie1)
        movieList.add(movie2)
        movieList.add(movie3)
        movieList.add(movie4)
        movieList.add(movie5)
        movieList.add(movie6)
        movieList.add(movie7)
        movieList.add(movie8)

        return movieList

    }
}