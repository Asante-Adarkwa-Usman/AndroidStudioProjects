package com.example.aiti_kaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText staffInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = (Button)findViewById(R.id.btnSubmit);
        staffInput = (EditText)findViewById(R.id.idInput);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input;
                input = staffInput.getText().toString().trim();
                if (input.length() == 0 ){
                    Toast.makeText(MainActivity.this, "Staff id field cannot be empty", Toast.LENGTH_SHORT).show();
                }else {
                    Intent goCheckin = new Intent(MainActivity.this, checkin.class);
                    startActivity(goCheckin);
                }
            }
        });
    }
}
