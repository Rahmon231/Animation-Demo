package com.lemzeeyyy.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView t1,t2;
    private Button btn;
    private Animation animateBtn, animateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);
        btn = findViewById(R.id.button);
        animateText = AnimationUtils.loadAnimation(this,R.anim.animate_texts);
        animateBtn = AnimationUtils.loadAnimation(this,R.anim.animate_btn);
        t1.setAnimation(animateText);
        t2.setAnimation(animateText);
        btn.setAnimation(animateBtn);
    }
}