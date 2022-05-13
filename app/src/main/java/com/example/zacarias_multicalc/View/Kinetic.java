package com.example.zacarias_multicalc.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.zacarias_multicalc.R;

public class Kinetic extends AppCompatActivity {
    Button nextwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinetic);
        getSupportActionBar().hide();
        nextwo=findViewById(R.id.nextactivity);
        nextwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Kinetic.this,Acceleration.class);
                startActivity(intent);
            }
        });

    }
}