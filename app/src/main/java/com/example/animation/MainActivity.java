package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show_other_anamtion(View view) {
        Intent intentimage=new Intent(MainActivity.this,Image_activity.class);
        startActivity(intentimage);
    }

    public void Show_Color_animation(View view) {
        Intent intentcolor=new Intent(MainActivity.this,Color_Activity.class);
        startActivity(intentcolor);

    }

    public void show_image_anamtion(View view) {
        Intent intentphoto=new Intent(MainActivity.this,Photo_Activity.class);
        startActivity(intentphoto);
    }
}
