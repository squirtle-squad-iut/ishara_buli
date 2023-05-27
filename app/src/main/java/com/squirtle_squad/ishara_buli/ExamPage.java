package com.squirtle_squad.ishara_buli;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ExamPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_page);

        Resources res = getResources();
        final Button btn_back = findViewById(R.id.back_btn);
        final Button btn_profile = findViewById(R.id.profile_btn);
        final ImageView iv_question = findViewById(R.id.question_iv);
        final TextView tv_question = findViewById(R.id.question_tv);
        final Button btn_opt1 = findViewById(R.id.op1_btn);
        final Button btn_opt2 = findViewById(R.id.op2_btn);
        final Button btn_opt3 = findViewById(R.id.op3_btn);
        final Button btn_opt4 = findViewById(R.id.op4_btn);


//        iv_question.setImageDrawable(ResourcesCompat.getDrawable(res, R.drawable.sign_6, null));
        tv_question.setText("উপরের চিত্রটি কোন চিহ্নটি নির্দেশ করে?");


        btn_back.setOnClickListener(v -> {
            // Code here executes on main thread after user presses button
            Intent intent = new Intent(ExamPage.this, MainActivity.class);
            startActivity(intent);
        });

        btn_profile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent intent = new Intent(ExamPage.this, Profile.class);
                startActivity(intent);
            }
        });
    }
}