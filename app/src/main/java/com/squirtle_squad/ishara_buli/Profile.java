package com.squirtle_squad.ishara_buli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        final Button btn_back = findViewById(R.id.back_btn);
        btn_back.setOnClickListener(v -> {
            // Code here executes on main thread after user presses button
            Intent intent = new Intent(Profile.this, MainActivity.class);
            startActivity(intent);
        });

        final Button btn_signout = findViewById(R.id.signout_btn);
        btn_signout.setOnClickListener(v -> {
            // Code here executes on main thread after user presses button
            Intent intent = new Intent(Profile.this, landing.class);
            startActivity(intent);
        });
    }
}