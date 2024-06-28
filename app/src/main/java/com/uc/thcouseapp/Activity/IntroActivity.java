package com.uc.thcouseapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.uc.thcouseapp.R;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intro);

        ImageView startBtn=findViewById(R.id.startbtn);
        startBtn.setOnClickListener(view -> startActivity(new Intent( IntroActivity.this, LoginActivity.class)));


    }
}