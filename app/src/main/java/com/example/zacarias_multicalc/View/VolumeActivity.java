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

public class VolumeActivity extends AppCompatActivity implements View.OnClickListener {
    Button next,calculate;
    EditText length,width,height;
    TextView lenghtxt,widthxt,heighttxt,resultxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_volume);
        getSupportActionBar().hide();
        //setting id
        next =findViewById(R.id.Next);
        length=findViewById(R.id.lengthtxt);
        width=findViewById(R.id.widthtxt1);
        height=findViewById(R.id.Heightxt);
        calculate=findViewById(R.id.calculate);
        lenghtxt=findViewById(R.id.length);
        widthxt=findViewById(R.id.widthtxt1);
        heighttxt=findViewById(R.id.Heightxt);
        resultxt =findViewById(R.id.resultkey);{
        }
        calculate.setOnClickListener(this);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(VolumeActivity.this,AreaActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.calculate:
                Methods solve =new Methods();
                resultxt.setText(solve.volumeA(Double.parseDouble(lenghtxt.getText().toString()),Double.parseDouble(width.getText().toString()),Double.parseDouble(heighttxt.getText().toString()))
        }
    }
}