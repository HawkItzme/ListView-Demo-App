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
        var listview : ListView = findViewById(R.id.listview)

        //2- Data Source : Array (of Integer, Strings...)
        val movieArray = arrayOf(
            "Hangover", "MNIK", "OSO", "Fan", "Swades"
        )

        //3- Adapter
        val arrayAdapter : ArrayAdapter<*>

        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            movieArray
        )

        listview.adapter = arrayAdapter
    }
}