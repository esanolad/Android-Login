package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {
    TextView email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        email = findViewById(R.id.lbl_welcome_email);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Bundle b = getIntent().getExtras();
        email.setText(b.getString("email"));
        //Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}