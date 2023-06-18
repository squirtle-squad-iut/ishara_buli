package com.squirtle_squad.ishara_buli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.example.*;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import android.widget.ProgressBar;
import android.os.Handler;
import android.widget.TextView;

import static android.content.ContentValues.TAG;

public class progress extends AppCompatActivity {

    ProgressBar pb;
    com.example.myapplication.Progress_Track pt2=new com.example.myapplication.Progress_Track();
    Handler handler = new Handler();
    Runnable progressRunnable;
    int c=pt2.progress;

    private TextView tv_currentScore;
    private ImageView btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        pb=findViewById(R.id.progressBar);
        pb.setMax(38);
        getScore();

        tv_currentScore = findViewById(R.id.letters_learned_tv);
        btn_back = findViewById(R.id.toHome);

        btn_back.setOnClickListener(v -> {
            Intent intent = new Intent(progress.this, home.class);
            startActivity(intent);
        });
    }
    private void getScore() {
        FirebaseFirestore db = FirebaseFirestore.getInstance();

// Get the current user ID
        String userId = FirebaseAuth.getInstance().getCurrentUser().getUid();
// Retrieve the user document from Firestore
        db.collection("users").document(userId)
                .get()
                .addOnSuccessListener(documentSnapshot -> {
                    if (documentSnapshot.exists()) {
                        // Get the current score from the document
                        int currentScore = documentSnapshot.getLong("score").intValue();
                        pb.setProgress(currentScore);
                        tv_currentScore.setText(String.valueOf(currentScore));
                        // Update the score by adding 1
                    } else {
                        // Document does not exist, handle the case accordingly
                        Log.d(TAG, "User document does not exist for user: " + userId);
                    }
                })
                .addOnFailureListener(e -> {
                    // Error occurred while retrieving the user document
                    Log.w(TAG, "Error retrieving user document", e);
                });

    }

}