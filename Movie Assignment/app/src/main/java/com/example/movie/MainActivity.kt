package com.example.movie

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var movieList : ArrayList<Movie>
    private lateinit var adapter: MovieAdapter

    companion object {
        var movieObject: Movie? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setTitle("Rafael Cunha Soares Tavares")

        movieList = ArrayList()

        movieList = loadMoviesList(this)

        for (movie in movieList) {
            val random = Random()
            var number = random.nextInt(16)
            if (number == 0) number = 1
            movie.seats_remaining = number
        }

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = MovieAdapter(movieList)
        recyclerView.adapter = adapter

        adapter.onItemClick = {
            val intent = Intent(this, MovieDetail::class.java)
            movieObject = it
            intent.putExtra("movie", it)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        // Refresh the RecyclerView with updated data (in my case, remaining seats on the homepage will be updated)
        adapter?.notifyDataSetChanged()
    }

    private fun loadMoviesList(context: Context): ArrayList<Movie> {
        val gson = Gson()
        val inputStream = context.assets.open("Movie.json")
        val bufferedReader = BufferedReader(InputStreamReader(inputStream))
        val movieListType = object : TypeToken<ArrayList<Movie>>() {}.type
        movieList = gson.fromJson(bufferedReader, movieListType)
        return movieList
    }
}