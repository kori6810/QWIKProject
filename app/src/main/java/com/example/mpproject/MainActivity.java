package com.example.mpproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.mpproject.databinding.ActivityMainBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private BottomSheetDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        dialog=new BottomSheetDialog(this,R.style.BottomSheetStyle);
        showBottomSheet();

        binding.registerBtn.setOnClickListener(view->{
            dialog.show();
        });

        binding.loginBtn.setOnClickListener(view->{
            startActivity(new Intent(this,LoginActivity.class));
        });



        dialog.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
    }

    private  void showBottomSheet(){
        View dialogView=getLayoutInflater().inflate(R.layout.bottom_sheet,null,false);
        TextView loginBtn=dialogView.findViewById(R.id.login_btn);
        String text="<font color=#000000>Already have an account? </font><font color=#3254CB>LOG IN</font>";
        loginBtn.setText(Html.fromHtml(text));
        loginBtn.setOnClickListener(view->{
            startActivity(new Intent(this,LoginActivity.class));
        });
        dialog.setContentView(dialogView);
    }
}