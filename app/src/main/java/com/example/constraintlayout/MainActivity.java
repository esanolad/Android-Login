package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txt_email, txt_password, txt_otp;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_email=findViewById(R.id.editTextTextEmailAddress);
        txt_password= findViewById(R.id.editTextTextPassword);
        login = findViewById(R.id.btn_main_login);
        txt_otp = findViewById(R.id.txt_main_otp);

    }

    @Override
    protected void onResume() {
        super.onResume();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailVal = txt_email.getText().toString();
                String pwd = txt_password.getText().toString();
                String sr = "hemanth@gmail.com";
                String ps = "changeMe";
                if (emailVal.equals(sr)  && pwd.equals(ps)) {
                    String otp = txt_otp.getText().toString();
                    if (otp.equals("1234")) {
                        Intent i = new Intent(MainActivity.this, Welcome.class);
                        Bundle b = new Bundle();
                        b.putString("email", sr);
                        i.putExtras(b);
                        startActivity(i);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Incorrect OTP", Toast.LENGTH_SHORT).show();
                    }

                }
                else {
                    Toast.makeText(MainActivity.this, "Incorrect login", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}