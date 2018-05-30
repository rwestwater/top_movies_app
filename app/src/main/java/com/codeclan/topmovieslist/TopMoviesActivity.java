package com.codeclan.topmovieslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
}
