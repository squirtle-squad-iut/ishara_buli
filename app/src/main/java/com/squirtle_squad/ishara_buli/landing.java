package com.squirtle_squad.ishara_buli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class landing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);


        final Button btn_login = findViewById(R.id.login_btn);
        btn_login.setOnClickListener(v -> {
            Intent intent = new Intent(landing.this, login.class);
            startActivity(intent);
        });

        final Button btn_signup = findViewById(R.id.signup_btn);
        btn_signup.setOnClickListener(v -> {
            Intent intent = new Intent(landing.this, signup.class);
            startActivity(intent);
        });
    }
}