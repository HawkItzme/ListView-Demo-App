package com.example.understandlistviewapp

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MyAdapter(private var activity: Activity, private var items: ArrayList<ActorModel>): BaseAdapter() {
    override fun getCount(): Int {
        return  items.size
    }

    override fun getItem(p0: Int): Any {
        return items[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view: View?
        val viewHolder: ViewHolder

        if (p1 == null){
            val inflater = activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

            view = inflater.inflate(R.layout.list_view_item, null)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        }else{
            view = p1
            viewHolder = view.tag as ViewHolder
        }

        var movies = items[p0]
        viewHolder.txtName?.text = movies.movieName
        viewHolder.txtActor?.text  = movies.actor
        viewHolder.movieImg?.setImageResource(movies.movie_img)

        view?.setOnClickListener(){
            Toast.makeText(activity,
                "You Choose: ${movies.movieName}",
                Toast.LENGTH_SHORT
            ).show()
        }

        return view as View
    }

    private class ViewHolder(row: View?){
        var txtName: TextView? = null
        var txtActor: TextView? = null
        var movieImg: ImageView? = null

        init {
            this.txtName = row?.findViewById(R.id.movieName)
            this.txtActor = row?.findViewById(R.id.actor)
            this.movieImg = row?.findViewById(R.id.imageView)
        }
    }
}