package com.example.zacarias_multicalc.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.zacarias_multicalc.R;

public class Acceleration extends AppCompatActivity implements View.OnClickListener {
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceleration);
        getSupportActionBar().hide();
        btn1 = findViewById(R.id.Continue);{
            btn1.setOnClickListener(this);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent =new Intent(Acceleration.this,MassActivity.class);
                    startActivity(intent);
                }
            });
        }
    }

    @Override
    public void onClick(View view) {

    }
}