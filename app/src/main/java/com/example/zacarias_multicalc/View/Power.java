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

public class Power extends AppCompatActivity implements View.OnClickListener {
    TextView work,time,result;
    Button calculate,next;
    EditText workText,timeText;

    Methods methods=new Methods();
    Variables variables=new Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power);
        getSupportActionBar().hide();

        //id
        work=findViewById(R.id.WorkTXT);
        time=findViewById(R.id.TimeTXT);
        calculate=findViewById(R.id.calculatesolve);
        next=findViewById(R.id.nextTxt);
        workText=findViewById(R.id.workDecimal);
        timeText=findViewById(R.id.timeDecimal);
        result=findViewById(R.id.resultText);

        //listeners
        calculate.setOnClickListener(this);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.calculatesolve:
                variables.setWork(Double.parseDouble(workText.getText().toString()));
                variables.setTime1(Double.parseDouble(timeText.getText().toString()));
                double answer =methods.power(variables.getWork(), variables.getTime1());
                result.setText(""+answer);
                break;
            case R.id.nextTxt:
                Intent intent =new Intent(Power.this,pressure.class);
                startActivity(intent);
                break;
        }
    }
}