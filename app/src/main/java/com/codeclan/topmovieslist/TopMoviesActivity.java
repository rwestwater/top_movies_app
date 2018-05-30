package com.codeclan.topmovieslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopMoviesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_movies);

        TopMovies topMovies = new TopMovies();
        ArrayList<Movie> list = topMovies.getList();

        TopMoviesAdapter moviesAdapter = new TopMoviesAdapter(this, list);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(moviesAdapter);
    }

    public void onListItemClick(View listItem) {
        Movie movie = (Movie)listItem.getTag();
        Log.d("Movie Title: ", movie.getTitle());

        Intent intent = new Intent(this, MovieActivity.class);
        intent.putExtra("movie", movie);
        startActivity(intent);
    }
}
