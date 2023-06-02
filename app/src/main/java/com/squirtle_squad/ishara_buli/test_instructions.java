package com.squirtle_squad.ishara_buli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.content.Intent;
public class test_instructions extends AppCompatActivity {

    Button b;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        b=findViewById(R.id.YesToInstruction);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent_fortesting=new Intent(getApplicationContext(),testing.class);
                startActivity(startintent_fortesting);

            }
        });

    }
}