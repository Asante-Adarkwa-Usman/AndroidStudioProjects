package com.example.aiti_kaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String iden, passcode;
                iden = staffId.getText().toString().trim();
                passcode = staffPassword.getText().toString().trim();
                if(iden.length() == 0){
                    Toast.makeText(admin.this, "Staff id field cannot be empty", Toast.LENGTH_SHORT).show();
                }else  if(passcode.length() == 0) {
                    Toast.makeText(admin.this, "Password field cannot be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
