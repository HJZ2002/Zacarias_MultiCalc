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

import java.lang.reflect.Method;

public class Acceleration extends AppCompatActivity implements View.OnClickListener {
    EditText velocity,time;
    Button btn1,procced;
    TextView timekey,velocitykey,resultanswer;

    //Class
    Methods solvekey=new Methods();
    Variables var3=new Variables();
    double solve2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceleration);
        getSupportActionBar().hide();

        //id resources
        btn1 = findViewById(R.id.Continue);
        procced=findViewById(R.id.resultgetters);
        velocity=findViewById(R.id.velocityproblem);
        time=findViewById(R.id.timeproblem);
        timekey=findViewById(R.id.time);
        velocitykey=findViewById(R.id.velocity2);
        resultanswer=findViewById(R.id.equalskey);{

            //buttons listeners
            btn1.setOnClickListener(this);
            procced.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.resultgetters:
                var3.setVelocity(Double.parseDouble(velocity.getText().toString()));
                var3.setTime(Double.parseDouble(time.getText().toString()));
                solve2=solvekey.acceleration(var3.getVelocity(),var3.getTime());
                resultanswer.setText(""+solve2);
                break;

            case R.id.Continue:
                Intent intent=new Intent(Acceleration.this,MassActivity.class);
                startActivity(intent);
        }
    }
}