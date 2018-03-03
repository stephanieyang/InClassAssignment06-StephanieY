package com.example.android.inclassassignment06_stephaniey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent createdIntent = getIntent();

        Movie movie = (Movie) createdIntent.getSerializableExtra(Keys.MOVIE_KEY);

        String title = movie.getTitle();
        int year = movie.getReleaseYear();
        String genre = movie.getGenre();
        boolean availableInEnglish = movie.isAvailableInEnglish();

        String displayText = "Title: " + title + "\nYear: " + year + "\nGenre: " + genre + "\nAvailable in English: " + (availableInEnglish ? "Yes" : "No");
        TextView infoTextView = (TextView) findViewById(R.id.info_text);
        infoTextView.setText(displayText);
    }
}
