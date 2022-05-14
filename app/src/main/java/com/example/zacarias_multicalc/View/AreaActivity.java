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
import com.example.zacarias_multicalc.Model.Variables;
import com.example.zacarias_multicalc.R;

public class AreaActivity extends AppCompatActivity implements View.OnClickListener{
    Button next1,calculate2;
    EditText basetxt,heightxt;
    TextView result2;
    Methods methods=new Methods();
    Variables var1 =new Variables();
    double solve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_volume);
        getSupportActionBar().hide();

        //setting id
        next1 = findViewById(R.id.nextwo);
        basetxt = findViewById(R.id.base);
        heightxt = findViewById(R.id.areaheight);
        calculate2 = findViewById(R.id.solve);

        calculate2.setOnClickListener(this);
        next1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.calculate:
                var1.setBase(Double.parseDouble(basetxt.getText().toString()));
                var1.setHeight1(Double.parseDouble(heightxt.getText().toString()));
                solve= methods.triangleArea(var1.getBase(),var1.getHeight());
                result2.setText("result: " + solve);
                break;
            case R.id.nextwo:
                Intent intent = new Intent(AreaActivity.this,Kinetic.class);
                startActivity(intent);
                break;
        }
    }
}