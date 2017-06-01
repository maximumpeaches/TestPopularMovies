package com.example.gz0rvh.testpopularmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Picasso.with(this).load("http://i.imgur.com/DvpvklR.png").into((ImageView) findViewById(R.id.beiber));
    }
}
