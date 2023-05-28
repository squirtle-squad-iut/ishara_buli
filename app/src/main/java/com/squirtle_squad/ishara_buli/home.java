package com.squirtle_squad.ishara_buli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final ConstraintLayout cl_learn = findViewById(R.id.constraintLayoutBtn1);
        cl_learn.setOnClickListener(v-> {
//            Intent intent = new Intent(home.this, learn.class);
//            startActivity(intent);
        });

        final ConstraintLayout cl_test = findViewById(R.id.constraintLayoutBtn2);
        cl_test.setOnClickListener(v-> {
//            Intent intent = new Intent(home.this, learn.class);
//            startActivity(intent);
        });

        final ImageView iv_profile = findViewById(R.id.profile_btn);
        iv_profile.setOnClickListener(v-> {
            Intent intent = new Intent(home.this, Profile.class);
            startActivity(intent);
        });

        final ImageView iv_about = findViewById(R.id.toBack);
        iv_about.setOnClickListener(v-> {
            Intent intent = new Intent(home.this, about.class);
            startActivity(intent);
        });
    }
}