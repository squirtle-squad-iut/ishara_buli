package com.squirtle_squad.ishara_buli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class landing extends AppCompatActivity {
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        mAuth = FirebaseAuth.getInstance();

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
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent intent = new Intent(landing.this, home.class);
            startActivity(intent);
        }
    }

}