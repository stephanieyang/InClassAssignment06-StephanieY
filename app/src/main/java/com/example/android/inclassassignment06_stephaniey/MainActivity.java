package com.example.android.inclassassignment06_stephaniey;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = (Spinner) findViewById(R.id.genre_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.genre_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        /* from: https://stackoverflow.com/questions/10331854/how-to-get-spinner-selected-item-value-to-string/38407969 */
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent,
                                       View view, int pos, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
    }

    public void launchInfoActivity(View view) {

        Intent intent = new Intent(this, InfoActivity.class);
        Movie currentMovie = getMovieInfo();
        intent.putExtra(Keys.MOVIE_KEY, currentMovie);
        startActivity(intent);
    }

    public void handleSpinner(View view) {

    }

    public Movie getMovieInfo() {
        EditText movieTitle = (EditText) findViewById(R.id.movie_title);
        EditText movieYear = (EditText) findViewById(R.id.movie_year);
        CheckBox inEng = (CheckBox) findViewById(R.id.movie_eng);
        Spinner movieGenre = (Spinner) findViewById(R.id.genre_spinner);
        Movie movie = new Movie(movieTitle.getText().toString(), Integer.parseInt(movieYear.getText().toString()), movieGenre.getSelectedItem().toString(), inEng.isChecked());
        return movie;
    }
}
