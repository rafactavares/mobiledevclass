FULL NAME: RAFAEL CUNHA SOARES TAVARES
STUDENT-ID: 22266

TASK LIST:
1. Movie recycler view:
1.1. Create a Movie class with the structure specified in movie.json [done]
1.2. Obtain and fill data (minimum of 4 movies) [done]
1.2.1. Obtain relevant movie data from Vue (https://www.myvue.com/cinema/dublin/whats-on) or your favourite provider and add data credits at the bottom of the app [done]
1.2.2. Generate a random number between 0 and 15 for each movie and assign to seats_remaining [done]
1.2.3. Start with an initial default seats_selected value of 0 for all movies [done] 
1.2.4. You shall fill random URLs for images from pixabay or other free image providers to begin with [done]
1.3. Build a Recycler View using the specified template, refer to recycler_view_template_*.jpg [done]
1.4. If any seats are selected, show how many seats are selected and hide remaining seats [done]
2. Seat selection feature:
2.1. Clicking any item (anywhere on the item) on the movie recycler view should open a new MovieActivity, refer to movie_activity_*.jpg [done]
2.2. Add plus and minus icons, show seats_selected in the middle [done]
2.3. On click plus/minus, update both seats_selected and seats_remaining for that movie [done] 
2.4. Add validation, when 0 seats selected minus is disabled, when 0 seats remaining plus is disabled [done]
2.5. When back is pressed, the selected seats are retained and reflected in the recycler view. (Hint: If you don’t see any updates, call adapter notifyItemChanged as soon as you return to the recycler view activity) [done]
3. Bonus:
3.1. Add "filling fast" badge if less than 3 seats remaining [done]
3.2. Use "Roboto Condensed" font to replicate same style [done]
3.3. Use original movie images from myvue.com or your favourite provider (Hint: check get_movie_image_url.gif) [done]



REPORT: 
The Android Studio learning curve is challenging at first! The application offers a lot of features and functionalities that could distract you while you're attempting to master it, so it's important to set aside enough time to become familiar with the key elements of Android Studio, like project creation, layout development, and error debugging. 

My biggest challenge was setting the correct syntax for the Kotlin language; despite being a user-friendly programming language and being very similar to javascript, it may take some time to master the skills and get used to the syntax. People with prior knowledge of other languages such as java(script) and python should find it easier to understand and learn Kotlin.

Furthermore, it's crucial to have a solid understanding of the main Android APIs. Numerous APIs are available in the Android operating system and are used to implement capabilities including the camera, sensors, geolocation, and others. Understanding how to use these APIs is therefore essential to ensuring that the application functions as planned.

Another problem that could develop is compatibility with different devices. Numerous devices with various screen sizes, resolutions, and hardware requirements can run the Android operating system. To ensure that the program runs well on all devices, it is crucial to test it on a variety of them.
I've had some big issues trying to modify the "amount of seats left", and the only way to solve this, was trying to get a similar code to the internet and change the valueables and trying to adjust to my code.

For newbies, publishing an application on Github can be challenging (it was a nightmare for me). Some YouTube videos that I had to watch over and over again were very helpful, but they were still unclear to me.

In conclusion, using Kotlin to create an application for the first time in Android Studio may be difficult. However, these challenges may be surmounted with perseverance and training. it is essential to learn the key features of Android Studio, master the Kotlin syntax, comprehend the Android APIs, optimize application performance, test the program on multiple devices, and make sure it conforms with all requirements.
