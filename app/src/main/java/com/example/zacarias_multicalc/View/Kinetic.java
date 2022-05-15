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

public class Kinetic extends AppCompatActivity implements View.OnClickListener {
    EditText speed,velocity;
    Button calculate,nextwo;
    TextView result3,problem,problemtwo;

    Methods numbers=new Methods();
    Variables var2=new Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinetic);
        getSupportActionBar().hide();
        //resources id
        nextwo = findViewById(R.id.nextactivity);
        speed=findViewById(R.id.problem);
        velocity=findViewById(R.id.problemtwo);
        calculate=findViewById(R.id.solve1);
        result3=findViewById(R.id.answerkey);
        problem=findViewById(R.id.one);
        problemtwo=findViewById(R.id.two);

        //listeners
        calculate.setOnClickListener(this);
        nextwo.setOnClickListener(this);
            {
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.solve1:
                var2.setSpeed(Double.parseDouble(speed.getText().toString()));
                var2.setVelocity1(Double.parseDouble(velocity.getText().toString()));
                double solve=numbers.kinetic(var2.getSpeed(), var2.getVelocity1());
                result3.setText(""+solve);
                break;
            case R.id.nextactivity:
                Intent intent=new Intent(Kinetic.this,Acceleration.class);
                startActivity(intent);
        }
    }
}