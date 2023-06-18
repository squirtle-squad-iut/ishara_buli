package com.squirtle_squad.ishara_buli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.io.IOException;

public class Profile extends AppCompatActivity {
    private TextView btn_signOut, tv_displayName, tv_email, btn_progress;
    private ImageView btn_back, btn_editProfile, iv_photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        iv_photo = findViewById(R.id.profileimage);
        tv_displayName = findViewById(R.id.username_tv);
        tv_email = findViewById(R.id.email_tv);

        btn_progress = findViewById(R.id.progress_btn);
        btn_progress.setOnClickListener(v -> {
            Intent intent = new Intent(Profile.this, progress.class);
            startActivity(intent);
        });

        btn_editProfile = findViewById(R.id.editProfile_btn);
        btn_editProfile.setOnClickListener(v -> {
            // Code here executes on main thread after user presses button
            Intent intent = new Intent(Profile.this, edit_profile.class);
            startActivity(intent);
        });

        btn_back = findViewById(R.id.toProfile_btn);
        btn_back.setOnClickListener(v -> {
            // Code here executes on main thread after user presses button
            Intent intent = new Intent(Profile.this, home.class);
            startActivity(intent);
        });

        btn_signOut = findViewById(R.id.signout_btn);
        btn_signOut.setOnClickListener(v -> {
            FirebaseAuth.getInstance().signOut();
            // Code here executes on main thread after user presses button
            Intent intent = new Intent(Profile.this, landing.class);
            startActivity(intent);
        });

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            // Name, email address, and profile photo Url
            String name = user.getDisplayName();
            String email = user.getEmail();
            Uri photoUrl = user.getPhotoUrl();

            // Check if user's email is verified
            boolean emailVerified = user.isEmailVerified();

            // The user's ID, unique to the Firebase project. Do NOT use this value to
            // authenticate with your backend server, if you have one. Use
            // FirebaseUser.getIdToken() instead.
            String uid = user.getUid();
            tv_email.setText(email);
            tv_displayName.setText(name);
//            Bitmap image = null;
//            try {
//                image = MediaStore.Images.Media.getBitmap(this.getContentResolver(), photoUrl);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            iv_photo.setImageBitmap(image);
        } else {
            Toast.makeText(Profile.this, "NO user found", Toast.LENGTH_SHORT).show();
        }
    }


}