package com.example.hospital_ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.hospital_ui.R;

public class Splash extends AppCompatActivity {

    ImageView mvie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mvie = findViewById(R.id.ive);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        },3000);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.zoomin);
        mvie.startAnimation(animation);
    }

}
