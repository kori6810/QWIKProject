package com.example.mpproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class SetProfileScreen extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    TextView progressText;
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

        TextView maleBtn=findViewById(R.id.male);
        TextView femaleBtn=findViewById(R.id.female);

        maleBtn.setOnClickListener(View->{
            maleBtn.setBackgroundResource(R.drawable.profile_male_bc);
            maleBtn.setTextColor(Color.WHITE);
            femaleBtn.setTextColor(Color.BLACK);
            femaleBtn.setBackgroundResource(R.drawable.profile_text_bc2);
        });
        femaleBtn.setOnClickListener(View->{
            maleBtn.setBackgroundResource(R.drawable.profile_text_bc);
            maleBtn.setTextColor(Color.BLACK);
            femaleBtn.setTextColor(Color.WHITE);
            femaleBtn.setBackgroundResource(R.drawable.profile_female_bc);
        });

        SeekBar seekBar = findViewById(R.id.seekbar);
         progressText = findViewById(R.id.gender);

        seekBar.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        // Progress o'zgandikda matn o'zgartiriladi

        progressText.setText(String.valueOf(progress));
    }
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // SeekBar ga tegilib turganda
    }
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        // SeekBar dan chiqib turganda
    }
    }
