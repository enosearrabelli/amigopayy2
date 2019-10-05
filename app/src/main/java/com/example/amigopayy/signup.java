package com.example.amigopayy;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.NF)
        {
            Intent intent = new Intent(signup.this,NewsFeed.class);
            startActivity(intent);
            return true;
        }
        if(id==R.id.forum)
        {
            Intent intent = new Intent(signup.this,forum.class);
            startActivity(intent);
            return true;
        }
        if(id==R.id.Cu)
        {
            Intent intent = new Intent(signup.this,ContactUs.class);
            startActivity(intent);
            return true;
        }

        return true;
    }

    public void NF(View view) {
        Intent intent = new Intent(signup.this,NewsFeed.class);
        startActivity(intent);
    }

    public void forum(View view) {
        Intent intent = new Intent(signup.this,forum.class);
        startActivity(intent);
    }

    public void cu(View view) {
        Intent intent = new Intent(signup.this,ContactUs.class);
        startActivity(intent);
    }
}
