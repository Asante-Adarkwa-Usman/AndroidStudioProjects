package com.example.aiti_kaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
    Button login;
    EditText userEmail, userPassword;
    TextView userRegister, userAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button)findViewById(R.id.btnGetStarted);
        userEmail = (EditText)findViewById(R.id.txtEmail);
        userPassword = (EditText)findViewById(R.id.txtPassword);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailInput, passwordInput;
                emailInput = userEmail.getText().toString().trim();
                passwordInput = userPassword.getText().toString().trim();

                if (emailInput.length() == 0){
                    Toast.makeText(login.this, "Email field cannot be empty", Toast.LENGTH_SHORT).show();
                }else if(passwordInput.length() == 0){
                    Toast.makeText(login.this, "Password field cannot be empty", Toast.LENGTH_SHORT).show();
                }else{
                    Intent goHome = new Intent(login.this, MainActivity.class);
                    startActivity(goHome);
                }

            }
        });
       userRegister = (TextView)findViewById(R.id.txtRegister);
       userAdmin = (TextView)findViewById(R.id.txtAdmin);
userRegister.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent signupPage = new Intent(login.this, signup.class);
        startActivity(signupPage);
    }
});
userAdmin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent adminPage = new Intent(login.this, admin.class);
        startActivity(adminPage);
    }
});








    }
}
