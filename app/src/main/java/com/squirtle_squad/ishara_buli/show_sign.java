package com.squirtle_squad.ishara_buli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class show_sign extends AppCompatActivity {

    ImageView iv;
    Button b;
    TextView t;
    com.example.myapplication.Progress_Track pt3=new com.example.myapplication.Progress_Track();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_sign);
        iv=findViewById(R.id.imageLearn);
        b=findViewById(R.id.gototestpage);
        String text=getIntent().getExtras().getString("package com.example.myapplication;\n");
        iv.setImageResource(R.drawable.demo_image);
        //t=findViewById(R.id.textView9);
        //t.setText(text);
        if (text.equals("b1")) {
            iv.setImageResource(R.drawable.zero);
            int a = pt3.learn(0);
        }

        if (text.equals("b2")) {
            iv.setImageResource(R.drawable.one);
            int a = pt3.learn(1);
        }

// Number 2
        if (text.equals("b3")) {
            iv.setImageResource(R.drawable.two);
            int a = pt3.learn(2);
        }

// Number 3
        if (text.equals("b4")) {
            iv.setImageResource(R.drawable.three);
            int a = pt3.learn(3);
        }

// Number 4
        if (text.equals("b5")) {
            iv.setImageResource(R.drawable.four);
            int a = pt3.learn(4);
        }

// Number 5
        if (text.equals("b6")) {
            iv.setImageResource(R.drawable.five);
            int a = pt3.learn(5);
        }

// Number 6
        if (text.equals("b7")) {
            iv.setImageResource(R.drawable.six);
            int a = pt3.learn(6);
        }

// Number 7
        if (text.equals("b8")) {
            iv.setImageResource(R.drawable.seven);
            int a = pt3.learn(7);
        }

// Number 8
        if (text.equals("b9")) {
            iv.setImageResource(R.drawable.eight);
            int a = pt3.learn(8);
        }

// Number 9
        if (text.equals("b10")) {
            iv.setImageResource(R.drawable.nine);
            int a = pt3.learn(9);
        }

// Number 10
        if (text.equals("b11")) {
            iv.setImageResource(R.drawable.ten);
            int a = pt3.learn(10);
        }

// Number 11
        if (text.equals("b12")) {
            iv.setImageResource(R.drawable.eleven);
            int a = pt3.learn(11);
        }

// Number 12
        if (text.equals("b13")) {
            iv.setImageResource(R.drawable.twelve);
            int a = pt3.learn(12);
        }

// Number 13
        if (text.equals("b14")) {
            iv.setImageResource(R.drawable.thirteen);
            int a = pt3.learn(13);
        }

// Number 14
        if (text.equals("b15")) {
            iv.setImageResource(R.drawable.fourteen);
            int a = pt3.learn(14);
        }

// Number 15
        if (text.equals("b16")) {
            iv.setImageResource(R.drawable.fifteen);
            int a = pt3.learn(15);
        }

// Number 16
        if (text.equals("b17")) {
            iv.setImageResource(R.drawable.sixteen);
            int a = pt3.learn(16);
        }

// Number 17
        if (text.equals("b18")) {
            iv.setImageResource(R.drawable.seventeen);
            int a = pt3.learn(17);
        }

// Number 18
        if (text.equals("b19")) {
            iv.setImageResource(R.drawable.eighteen);
            int a = pt3.learn(18);
        }

// Number 19
        if (text.equals("b20")) {
            iv.setImageResource(R.drawable.nineteen);
            int a = pt3.learn(19);
        }

// Number 20
        if (text.equals("b21")) {
            iv.setImageResource(R.drawable.twenty);
            int a = pt3.learn(20);
        }

// Number 21
        if (text.equals("b22")) {
            iv.setImageResource(R.drawable.twentyone);
            int a = pt3.learn(21);
        }

// Number 22
        if (text.equals("b23")) {
            iv.setImageResource(R.drawable.twentytwo);
            int a = pt3.learn(22);
        }

// Number 23
        if (text.equals("b24")) {
            iv.setImageResource(R.drawable.twentythree);
            int a = pt3.learn(23);
        }

// Number 24
        if (text.equals("b25")) {
            iv.setImageResource(R.drawable.twentyfour);
            int a = pt3.learn(24);
        }

// Number 25
        if (text.equals("b26")) {
            iv.setImageResource(R.drawable.twentyfive);
            int a = pt3.learn(25);
        }

// Number 26
        if (text.equals("b27")) {
            iv.setImageResource(R.drawable.twentysix);
            int a = pt3.learn(26);
        }

// Number 27
        if (text.equals("b28")) {
            iv.setImageResource(R.drawable.twentyseven);
            int a = pt3.learn(27);
        }

// Number 28
        if (text.equals("b29")) {
            iv.setImageResource(R.drawable.twentyeight);
            int a = pt3.learn(28);
        }

// Number 29
        if (text.equals("b30")) {
            iv.setImageResource(R.drawable.twentynine);
            int a = pt3.learn(29);
        }

// Number 30
        if (text.equals("b31")) {
            iv.setImageResource(R.drawable.thirty);
            int a = pt3.learn(30);
        }

// Number 31
        if (text.equals("b32")) {
            iv.setImageResource(R.drawable.thirtyone);
            int a = pt3.learn(31);
        }

// Number 32
        if (text.equals("b33")) {
            iv.setImageResource(R.drawable.thirtytwo);
            int a = pt3.learn(32);
        }

// Number 33
        if (text.equals("b34")) {
            iv.setImageResource(R.drawable.thirtythree);
            int a = pt3.learn(33);
        }

// Number 34
        if (text.equals("b35")) {
            iv.setImageResource(R.drawable.thirtyfour);
            int a = pt3.learn(34);
        }

// Number 35
        if (text.equals("b36")) {
            iv.setImageResource(R.drawable.thirtyfive);
            int a = pt3.learn(35);
        }

// Number 36
        if (text.equals("b37")) {
            iv.setImageResource(R.drawable.thirtysix);
            int a = pt3.learn(36);
        }

// Number 37
        if (text.equals("b38")) {
            iv.setImageResource(R.drawable.thirtyseven);
            int a = pt3.learn(37);
        }
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test=new Intent(getApplicationContext(),testing.class);
                startActivity(test);
            }
        });

    }
}