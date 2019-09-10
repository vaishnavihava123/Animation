package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Image_activity extends AppCompatActivity {
ImageView imageView;
Button button,button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_activity);
        imageView=findViewById(R.id.imageView);
        button=findViewById(R.id.button);
        button1=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation=AnimationUtils.loadAnimation(Image_activity.this,R.anim.scal);
                imageView.startAnimation(animation);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation=AnimationUtils.loadAnimation(Image_activity.this,R.anim.flud);
                imageView.startAnimation(animation);

            }
        });
    }
}
