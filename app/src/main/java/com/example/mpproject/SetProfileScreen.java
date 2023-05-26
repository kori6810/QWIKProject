package com.example.mpproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SetProfileScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_set_profile);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button registerBtn=findViewById(R.id.register_btn2);
        registerBtn.setOnClickListener(view->{
            startActivity(new Intent(this, SignUpFinal.class));
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
        });

    }
}