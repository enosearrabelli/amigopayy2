package com.example.amigopayy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }

    public void Login(View view) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void Back(View view) {
        Intent i = new Intent(this,signin.class);
        startActivity(i);
    }
}