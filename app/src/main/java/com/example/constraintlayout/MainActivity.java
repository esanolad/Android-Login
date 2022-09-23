package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email, password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.editTextTextEmailAddress);
        password= findViewById(R.id.editTextTextPassword);
        login = findViewById(R.id.btn_main_login);
    }

    @Override
    protected void onResume() {
        super.onResume();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailVal = email.getText().toString();
                String pwd = password.getText().toString();
                String sr = "hemanth@gmail.com";
                String ps = "changeMe";
                if (emailVal.equals(sr)  && pwd.equals(ps)) {
                    Intent i = new Intent(MainActivity.this, Welcome.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(MainActivity.this, "Incorrect login", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}