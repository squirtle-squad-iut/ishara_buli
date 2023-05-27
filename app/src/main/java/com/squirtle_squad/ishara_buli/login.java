package com.squirtle_squad.ishara_buli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button btn_login = findViewById(R.id.register_btn);
        btn_login.setOnClickListener(v-> {
            Intent intent = new Intent(login.this, home.class);
            startActivity(intent);
        });
    }
}