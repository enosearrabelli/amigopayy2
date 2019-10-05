package com.example.amigopayy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }
    public void Cancel(View view) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void Next(View view) {
        Intent i = new Intent(this,next.class);
        startActivity(i);
    }
}