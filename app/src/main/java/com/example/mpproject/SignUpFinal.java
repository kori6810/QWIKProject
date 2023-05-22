package com.example.mpproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SignUpFinal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_final);

        Button nextBtn=findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(view->{
            startActivity(new Intent(this,HomeActivity.class));
        });
    }
}