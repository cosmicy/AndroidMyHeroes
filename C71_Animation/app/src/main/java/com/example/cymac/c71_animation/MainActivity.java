package com.example.cymac.c71_animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    Button btn1 = (Button) findViewById(R.id.button1);
    Button btn2 = (Button) findViewById(R.id.button2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
