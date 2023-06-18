package com.squirtle_squad.ishara_buli;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import static android.content.ContentValues.TAG;

public class login extends AppCompatActivity {
    private FirebaseAuth mAuth;
    TextView tv_email, tv_password, tv_gotoSignup;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();
        tv_email = findViewById(R.id.email_tv);
        tv_password = findViewById(R.id.pass1_tp);
        btn_login = findViewById(R.id.signin_btn);
        tv_gotoSignup = findViewById(R.id.gotosignup);

        tv_gotoSignup.setOnClickListener(v-> {
            Intent intent = new Intent(login.this, signup.class);
            startActivity(intent);
        });

        btn_login.setOnClickListener(v-> {
            String email = tv_email.getText().toString().trim();
            String password = tv_password.getText().toString().trim();

            if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
                Toast.makeText(login.this, "Please fill in all the fields", Toast.LENGTH_SHORT).show();
            } else {
                tryLogin(email, password);
            }
        });
    }

    private void tryLogin(String email, String password) {
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            Toast.makeText(login.this, "Login Successful",
                                    Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(login.this, home.class);
                            startActivity(intent);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(login.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

}