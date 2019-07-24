package com.example.aiti_kaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class admin extends AppCompatActivity {
    Button signup;
    EditText staffId, staffPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        signup = (Button)findViewById(R.id.adminGetStarted);
        staffId = (EditText) findViewById(R.id.adminStaffId);
        staffPassword = (EditText) findViewById(R.id.adminPassword);
    }
}
