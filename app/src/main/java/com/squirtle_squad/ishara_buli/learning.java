package com.squirtle_squad.ishara_buli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageView;

public class learning extends AppCompatActivity {

 Button b1;
 ImageView btn_profile, btn_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);

        btn_home = findViewById(R.id.toHome);
        btn_home.setOnClickListener(v->{
            Intent intent = new Intent(learning.this, home.class);
            startActivity(intent);
        });

        btn_profile = findViewById(R.id.profile_btn);
        btn_profile.setOnClickListener(v -> {
            Intent intent = new Intent(learning.this, edit_profile.class);
            startActivity(intent);
        });
        b1=findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b1";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        Button b2=findViewById(R.id.button2);
        Button b3=findViewById(R.id.button3);
        Button b4=findViewById(R.id.button4);
        Button b5=findViewById(R.id.button5);
        Button b6=findViewById(R.id.button6);
        Button b7=findViewById(R.id.button7);
        Button b8=findViewById(R.id.button8);
        Button b9=findViewById(R.id.button9);
        Button b10=findViewById(R.id.button10);

        Button b11=findViewById(R.id.button11);
        Button b12=findViewById(R.id.button12);
        Button b13=findViewById(R.id.button13);
        Button b14=findViewById(R.id.button14);
        Button b15=findViewById(R.id.button15);
        Button b16=findViewById(R.id.button16);
        Button b17=findViewById(R.id.button17);
        Button b18=findViewById(R.id.button18);
        Button b19=findViewById(R.id.button19);
        Button b20=findViewById(R.id.button20);

        Button b21=findViewById(R.id.button21);
        Button b22=findViewById(R.id.button22);
        Button b23=findViewById(R.id.button23);
        Button b24=findViewById(R.id.button24);
        Button b25=findViewById(R.id.button25);
        Button b26=findViewById(R.id.button26);
        Button b27=findViewById(R.id.button27);
        Button b28=findViewById(R.id.button28);
        Button b29=findViewById(R.id.button29);
        Button b30=findViewById(R.id.button30);

        Button b31=findViewById(R.id.button31);
        Button b32=findViewById(R.id.button32);
        Button b33=findViewById(R.id.button33);
        Button b34=findViewById(R.id.button34);
        Button b35=findViewById(R.id.button35);
        Button b36=findViewById(R.id.button36);
        Button b37=findViewById(R.id.button37);
        Button b38=findViewById(R.id.button38);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b2";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b3";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b4";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b5";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b6";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b7";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b8";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b9";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b10";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });


        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b11";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b12";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b13";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b14";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b15";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b16";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b17";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b18";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b19";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b20";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });


        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b21";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b22";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b23";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b24";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b25";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b26";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b27";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b28";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b29";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b30";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });

        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b31";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b32";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b33";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b34";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b35";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b36";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });

        b37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b37";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });
        b38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learning_page2=new Intent(getApplicationContext(),show_sign.class);
                String username="b38";
                learning_page2.putExtra("package com.example.myapplication;\n",username);
                startActivity(learning_page2);

            }
        });



    }
}