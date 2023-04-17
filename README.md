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
