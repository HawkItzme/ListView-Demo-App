package com.example.understandlistviewapp


//This is a Model Class. A model class is typically used to model the data in your application, so it's a template.
class ActorModel {
    var movieName: String = ""
    var actor : String = ""
    var movie_img : Int = 0

    constructor(movieName: String, actor: String, movie_img: Int) {
        this.movieName = movieName
        this.actor = actor
        this.movie_img = movie_img
    }
}