package com.squirtle_squad.ishara_buli;

import androidx.appcompat.app.AppCompatActivity;

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
        if(text.equals("b1"))
        {
            //iv.setImageDrawable(null);
//            iv.setImageResource(R.drawable.zero);
            int a=pt3.learn(0);

        }
        if(text=="b2")
        {
            iv.setImageResource(R.drawable.demo_image);
            int a=pt3.learn(1);
        }
        if(text=="b3")
        {
            iv.setImageResource(R.drawable.demo_image);
            int a=pt3.learn(2);
        }
        if(text=="b4")
        {
            iv.setImageResource(R.drawable.demo_image);
            int a=pt3.learn(3);
        }
        if(text=="b5")
        {
            iv.setImageResource(R.drawable.demo_image);
            int a=pt3.learn(4);
        }
        if(text=="b6")
        {
            iv.setImageResource(R.drawable.demo_image);
            int a=pt3.learn(5);
        }
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent test=new Intent(getApplicationContext(),MainActivity2.class);
//                startActivity(test);
            }
        });

    }
}