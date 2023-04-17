package com.example.movie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MovieAdapter(val movieList: ArrayList<Movie>) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    var onItemClick : ((Movie) -> Unit)? = null

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val movieImage: ImageView = itemView.findViewById(R.id.movieImage)
        val movieName: TextView = itemView.findViewById(R.id.name)
        val starring: TextView = itemView.findViewById(R.id.starringNames)
        val runningTime: TextView = itemView.findViewById(R.id.runningTime)
        val seatRemaining: TextView = itemView.findViewById(R.id.seatRemaining)
        val fillFast: TextView = itemView.findViewById(R.id.fillFast)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_list, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movie = movieList[position]
        holder.movieName.text = movie.name
        holder.starring.text = movie.starring.joinToString(separator = ", ")

        val time = movie.running_time_mins
        val hours = time / 60
        val minutes = time % 60
        val runningTimeValue = "$hours h $minutes m"
        holder.runningTime.text = runningTimeValue

        holder.seatRemaining.text = movie.seats_remaining.toString()

        if (holder.seatRemaining.text.toString().toInt() < 3) {
            holder.fillFast.visibility = View.VISIBLE
        }
        else  {
            holder.fillFast.visibility = View.INVISIBLE
        }

        val url = movie.image
        Glide.with(holder.itemView.context)
            .load(url)
            .into(holder.movieImage)

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(movie)
        }
    }
}

