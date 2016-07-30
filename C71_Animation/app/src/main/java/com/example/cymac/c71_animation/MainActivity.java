package com.example.cymac.c71_animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlphaAnimation aa = new AlphaAnimation(1,100);
                aa.setDuration(2000);

                TranslateAnimation ta = new TranslateAnimation(0,200,0,300);
                ta.setDuration(1000);

                btn2.startAnimation(ta);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AnimationSet animSet = new AnimationSet(true);
                animSet.setDuration(1000);

                ScaleAnimation sa = new ScaleAnimation(0,2,0,2);
                //sa.setDuration(1000);
                animSet.addAnimation(sa);


                RotateAnimation ra = new RotateAnimation(0,360);
                //ra.setDuration(1000);
                animSet.addAnimation(ra);

                //animSet.addAnimation(ra);

                btn1.startAnimation(animSet);

            }
        });


    }
}
