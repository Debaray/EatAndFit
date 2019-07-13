package com.example.debar.eatandfit;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Track extends AppCompatActivity implements SensorEventListener {

    private SensorManager sensorManager;
    private TextView count;
    boolean activityRunning;
    Button startBT,cancelBT,resumeBT,pauseBT;
    int check = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);
        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        startBT = (Button) findViewById(R.id.start_Bt);
        cancelBT = (Button) findViewById(R.id.Cancel_Bt);
        resumeBT = (Button) findViewById(R.id.Resume_Bt);
        pauseBT = (Button) findViewById(R.id.Pause_Bt);

        count=(TextView)findViewById(R.id.stepCountText);

        startBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startBT.setVisibility(View.INVISIBLE);
                activityRunning=true;
            }
        });
        cancelBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cancel = new Intent(Track.this,Menu.class);
                startActivity(cancel);
            }
        });
        resumeBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resumeBT.setVisibility(View.INVISIBLE);
                pauseBT.setVisibility(View.VISIBLE);
                activityRunning=true;
            }
        });
        pauseBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pauseBT.setVisibility(View.INVISIBLE);
                resumeBT.setVisibility(View.VISIBLE);
                activityRunning=false;
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();



        Sensor countSensor=sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        if(countSensor!=null)
        {
            sensorManager.registerListener(this,countSensor,SensorManager.SENSOR_DELAY_UI);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Count sensor not available", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        activityRunning=false;
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if(activityRunning)
        {
            count.setText(String.valueOf(sensorEvent.values[0]));
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}

