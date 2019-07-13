package com.example.debar.eatandfit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button trackBT,fitBT,dietBT,healthBT,profileBT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        trackBT = (Button) findViewById(R.id.TrackID);
        fitBT = (Button) findViewById(R.id.FtCkID);
        dietBT = (Button) findViewById(R.id.DeitID);
        healthBT = (Button) findViewById(R.id.HealthTipsID);
        profileBT = (Button) findViewById(R.id.ProfileID);
        trackBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent track = new Intent(Menu.this,Track.class);
                startActivity(track);
            }
        });
        fitBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fit = new Intent(Menu.this,FitnessCheck.class);
                startActivity(fit);
            }
        });
        dietBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent diet = new Intent(Menu.this,DietChart.class);
                startActivity(diet);
            }
        });
        healthBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent htips = new Intent(Menu.this,HealthTips.class);
                startActivity(htips);
            }
        });
        profileBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pro = new Intent(Menu.this,Profile.class);
                startActivity(pro);
            }
        });
    }
}
