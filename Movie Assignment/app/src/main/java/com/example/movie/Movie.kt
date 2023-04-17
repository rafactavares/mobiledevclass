package com.example.movie


import android.os.Parcel
import android.os.Parcelable
import java.util.*

data class Movie(
    var name: String,
    var image: String,
    var certification: String,
    var description: String,
    var starring: Array<String>,
    var running_time_mins: Int,
    var seats_remaining: Int,
    var seats_selected: Int
) : Parcelable
{

    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.createStringArray()!!,
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun toString(): String {
        return ("Movie [name=" + name + ", image=" + image + ", certification=" + certification + ", description="
                + description + ", starring=" + Arrays.toString(starring) + ", running_time_mins=" + running_time_mins
                + ", seats_remaining=" + seats_remaining + ", seats_selected=" + seats_selected + "]")
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(image)
        parcel.writeString(certification)
        parcel.writeString(description)
        parcel.writeStringArray(starring)
        parcel.writeInt(running_time_mins)
        parcel.writeInt(seats_remaining)
        parcel.writeInt(seats_selected)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Movie> {
        override fun createFromParcel(parcel: Parcel): Movie {
            return Movie(parcel)
        }

        override fun newArray(size: Int): Array<Movie?> {
            return arrayOfNulls(size)
        }
    }
}