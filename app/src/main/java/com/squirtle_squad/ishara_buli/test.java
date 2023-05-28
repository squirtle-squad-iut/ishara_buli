package com.squirtle_squad.ishara_buli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.view.PreviewView;
import androidx.camera.lifecycle.ProcessCameraProvider;
import com.google.common.util.concurrent.ListenableFuture;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        final TextView tv_prediction = findViewById(R.id.textView2);

        final ImageView iv_back = findViewById(R.id.toBack);
        iv_back.setOnClickListener(v -> {
            // Code here executes on main thread after user presses button
            Intent intent = new Intent(test.this, landing.class);
            startActivity(intent);
        });

        final ImageView iv_pofile = findViewById(R.id.profile_btn);
        iv_pofile.setOnClickListener(v -> {
            // Code here executes on main thread after user presses button
            Intent intent = new Intent(test.this, Profile.class);
            startActivity(intent);
        });

        final PreviewView pv_camera = findViewById(R.id.view_finder);

//        ProcessCameraProvider cameraProviderFuture
//        cameraProviderFuture.addListener(() -> {
//            try {
//                ProcessCameraProvider cameraProvider = cameraProviderFuture.get();
//                bindPreview(cameraProvider);
//            } catch (ExecutionException | InterruptedException e) {
//                // No errors need to be handled for this Future.
//                // This should never be reached.
//            }
//        }, ContextCompat.getMainExecutor(this));
    }
}