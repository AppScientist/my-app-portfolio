package com.krypto.myapplicationportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotify=(Button) findViewById(R.id.spotify);
        Button scores=(Button) findViewById(R.id.scores);
        Button lib=(Button) findViewById(R.id.lib);
        Button bigger=(Button) findViewById(R.id.bigger);
        Button xyz=(Button) findViewById(R.id.xyz);
        Button capstone=(Button) findViewById(R.id.capstone);

        spotify.setOnClickListener(this);
        scores.setOnClickListener(this);
        lib.setOnClickListener(this);
        bigger.setOnClickListener(this);
        xyz.setOnClickListener(this);
        capstone.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        if(getResources().getResourceEntryName(v.getId()).equals("spotify")){

            Toast.makeText(this,"This button will launch my Spotify Streamer app",Toast.LENGTH_SHORT).show();

        }else if(getResources().getResourceEntryName(v.getId()).equals("scores")){

            Toast.makeText(this,"This button will launch my Scores app",Toast.LENGTH_SHORT).show();

        }else if(getResources().getResourceEntryName(v.getId()).equals("lib")){

            Toast.makeText(this,"This button will launch my Library app",Toast.LENGTH_SHORT).show();

        }else if(getResources().getResourceEntryName(v.getId()).equals("bigger")){

            Toast.makeText(this,"This button will launch my Build It Bigger app",Toast.LENGTH_SHORT).show();

        }else if(getResources().getResourceEntryName(v.getId()).equals("xyz")){

            Toast.makeText(this,"This button will launch my XYZ Reader app",Toast.LENGTH_SHORT).show();

        }else if(getResources().getResourceEntryName(v.getId()).equals("capstone")){

            Toast.makeText(this,"This button will launch my Capstone app",Toast.LENGTH_SHORT).show();

        }
    }
}
