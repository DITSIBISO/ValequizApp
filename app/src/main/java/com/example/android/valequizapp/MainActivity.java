package com.example.android.valequizapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * The number of correct answers
     */
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that shows the numbers category
        TextView movies = (TextView)findViewById(R.id.Movies);

        //Set a clicklistener on that View
        movies.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link MoviesActivity}
                Intent moviesIntent = new Intent(MainActivity.this,
                        MoviesActivity.class);

                //Start the new activity
                startActivity(moviesIntent);

            }
        });


        //Find the View that shows the numbers category
        TextView sports = (TextView)findViewById(R.id.Sports);

        //Set a clicklistener on that View
        sports.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link MoviesActivity}
                Intent sportsIntent = new Intent(MainActivity.this,
                        SportsActivity.class);

                //Start the new activity
                startActivity(sportsIntent);

            }
        });




        //Find the View that shows the numbers category
        TextView celebrities = (TextView)findViewById(R.id.Celebrities);

        //Set a clicklistener on that View
        celebrities.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link MoviesActivity}
                Intent celebritiesIntent = new Intent(MainActivity.this,
                        CelebritiesActivity.class);

                //Start the new activity
                startActivity(celebritiesIntent);

            }
        });


        //Find the View that shows the numbers category
        TextView polotics = (TextView)findViewById(R.id.Polotics);

        //Set a clicklistener on that View
        polotics.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link MoviesActivity}
                Intent poloticsIntent = new Intent(MainActivity.this,
                        PoloticsActivity.class);

                //Start the new activity
                startActivity(poloticsIntent);

            }
        });
    }


}
