package com.squirtle_squad.ishara_buli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.ImageView;

public class home extends AppCompatActivity {
    private static final String[] CAMERA_PERMISSION = new String[]{android.Manifest.permission.CAMERA};
    private static final int CAMERA_REQUEST_CODE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final ConstraintLayout cl_learn = findViewById(R.id.constraintLayoutBtn1);
        cl_learn.setOnClickListener(v-> {
            Intent intent = new Intent(home.this, learning.class);
            startActivity(intent);
        });

        final ConstraintLayout cl_test = findViewById(R.id.constraintLayoutBtn2);
        cl_test.setOnClickListener(v-> {
            if (hasCameraPermission()) {
                Intent intent = new Intent(home.this, test_instructions.class);
                startActivity(intent);
            } else {
                requestPermission();
            }
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
    private boolean hasCameraPermission() {
        return ContextCompat.checkSelfPermission(
                this,
                android.Manifest.permission.CAMERA
        ) == PackageManager.PERMISSION_GRANTED;
    }
    private void requestPermission() {
        ActivityCompat.requestPermissions(
                this,
                CAMERA_PERMISSION,
                CAMERA_REQUEST_CODE
        );
    }
}