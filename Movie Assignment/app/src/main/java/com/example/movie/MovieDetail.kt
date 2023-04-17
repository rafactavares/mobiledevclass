package com.example.movie

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


class MovieDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_detail)
        supportActionBar?.setTitle("Rafael Cunha Soares Tavares")

        val movie = intent.getParcelableExtra<Movie>("movie")
        if (movie != null) {
            val movieImage : ImageView = findViewById(R.id.movieImage)
            val movieName : TextView = findViewById(R.id.name)
            val movieStarring : TextView = findViewById(R.id.starringNames)
            val movieRunningTime : TextView = findViewById(R.id.runningTime)
            val movieDescription : TextView = findViewById(R.id.description)
            val movieSeatCount : TextView = findViewById(R.id.seatCount)
            val movieSeatRemaining : TextView = findViewById(R.id.seatRemaining)

            movieName.text = movie.name
            movieStarring.text = movie.starring.joinToString(separator = ", ")

            val time = movie.running_time_mins
            val hours = time / 60
            val minutes = time % 60
            val runningTimeValue = "$hours h $minutes m"
            movieRunningTime.text = runningTimeValue


            movieDescription.text = movie.description
            movieSeatCount.text = movie.seats_selected.toString()
            movieSeatRemaining.text = movie.seats_remaining.toString()


            val url = movie.image
            Glide.with(this)
                .load(url)
                .into(movieImage)

            val plus : ImageView = findViewById(R.id.plus)
            val minus : ImageView = findViewById(R.id.minus)


            plus.setOnClickListener { view ->
                if (movieSeatRemaining.text.toString().toInt() > 0) {
                    var seatCountValue = movieSeatCount.text.toString().toInt()
                    movieSeatCount.text = (++seatCountValue).toString()
                    MainActivity.movieObject?.seats_selected = seatCountValue

                    var seatRemainingValue = movieSeatRemaining.text.toString().toInt()
                    movieSeatRemaining.text = (--seatRemainingValue).toString()
                    MainActivity.movieObject?.seats_remaining = seatRemainingValue

                    if (seatRemainingValue == 0) {
                        plus.visibility = View.INVISIBLE
                    } else {
                        plus.visibility = View.VISIBLE
                    }
                    if (seatCountValue == 0) {
                        minus.visibility = View.INVISIBLE
                    } else {
                        minus.visibility = View.VISIBLE
                    }
                }
            }

            minus.setOnClickListener { view ->
                var seatCountValue = movieSeatCount.text.toString().toInt()
                if (seatCountValue > 0) {
                    movieSeatCount.text = (--seatCountValue).toString()
                    MainActivity.movieObject?.seats_selected = seatCountValue

                    var seatRemainingValue = movieSeatRemaining.text.toString().toInt()
                    movieSeatRemaining.text = (++seatRemainingValue).toString()
                    MainActivity.movieObject?.seats_remaining = seatRemainingValue

                    if (seatRemainingValue == 0) {
                        plus.visibility = View.INVISIBLE
                    } else {
                        plus.visibility = View.VISIBLE
                    }
                    if (seatCountValue == 0) {
                        minus.visibility = View.INVISIBLE
                    } else {
                        minus.visibility = View.VISIBLE
                    }
                }

            }

        }
    }
}