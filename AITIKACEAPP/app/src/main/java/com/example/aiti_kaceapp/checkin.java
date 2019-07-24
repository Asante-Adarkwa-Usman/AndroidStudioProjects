package com.example.aiti_kaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class checkin extends AppCompatActivity {
    Button saveTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkin);
        saveTime = (Button)findViewById(R.id.btnCheckIn);
        saveTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack = new Intent(checkin.this, MainActivity.class);
                startActivity(goBack);
            }
        });

    }
}
