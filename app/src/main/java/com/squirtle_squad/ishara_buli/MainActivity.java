package com.squirtle_squad.ishara_buli;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, landing.class));
                finish();
            }
        }, 2000);
    }

    //    iv_logo.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            // Handle the image click event here
//            // This code will be executed when the image is clicked
//        }
//    });

}