package com.example.zacarias_multicalc.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.zacarias_multicalc.Controller.Methods;
import com.example.zacarias_multicalc.R;

public class AreaActivity extends AppCompatActivity implements View.OnClickListener{
    Button next1,calculate2;
    EditText basetxt,heightxt;
    TextView result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        getSupportActionBar().hide();
        next1=findViewById(R.id.Nextone);
        calculate2=findViewById(R.id.solve);
        basetxt=findViewById(R.id.base);
        heightxt=findViewById(R.id.areaheight);
        calculate2.setOnClickListener(this);
        result2=findViewById(R.id.equals);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(AreaActivity.this,Kinetic.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.solve:
        }
    }
}