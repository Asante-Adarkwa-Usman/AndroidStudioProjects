package com.example.aiti_kaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    EditText sId, sFullName, sEmail, sPassword, sConPassword;
    Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        sId = (EditText)findViewById(R.id.signupStaffId);
        sFullName= (EditText)findViewById(R.id.signupName);
        sEmail= (EditText)findViewById(R.id.signupMail);
        sPassword= (EditText)findViewById(R.id.signupPassword);
        sConPassword= (EditText)findViewById(R.id.signupConPassword);
        reg = (Button)findViewById(R.id.btnRegister);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String iD, name, mail, password, confPassword;
                iD = sId.getText().toString().trim();
                name = sFullName.getText().toString().trim();
                mail = sEmail.getText().toString().trim();
                password = sPassword.getText().toString().trim();
                confPassword =  sConPassword.getText().toString().trim();

                if(iD.length() == 0){
                    Toast.makeText(signup.this, "Staff id field cannot be empty", Toast.LENGTH_SHORT).show();
                }else if(name.length() == 0){
                    Toast.makeText(signup.this, "Name field cannot be empty", Toast.LENGTH_SHORT).show();
                }else if(mail.length() == 0){
                    Toast.makeText(signup.this, "Email field cannot be empty", Toast.LENGTH_SHORT).show();
                }else if(password.length() == 0){
                    Toast.makeText(signup.this, "Password field cannot be empty", Toast.LENGTH_SHORT).show();
                }else if(confPassword.length() == 0){
                    Toast.makeText(signup.this, "Confirm Password field cannot be empty", Toast.LENGTH_SHORT).show();
                }else {

                    Intent rView = new Intent(signup.this, login.class);
                    startActivity(rView);
                }
            }
        });








    }
}
