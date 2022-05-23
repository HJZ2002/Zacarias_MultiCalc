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

public class SquareActivity extends AppCompatActivity implements View.OnClickListener {
    TextView square,result;
    EditText squaretxt;
    Button calculate,next;

    Methods methods2=new Methods();
    Variables var8=new Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        getSupportActionBar().hide();

        //id resources
        square=findViewById(R.id.squaretxt);
        result=findViewById(R.id.resultkey2);
        squaretxt=findViewById(R.id.editTextNumberDecimal5);
        calculate=findViewById(R.id.button5);
        next=findViewById(R.id.button6);

        calculate.setOnClickListener(this);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button5:
                var8.setSquare1(Double.parseDouble(squaretxt.getText().toString()));
                double answer=methods2.square(var8.getSquare1(),var8.getAnswer());
                result.setText(""+answer);
                break;

            case R.id.button6:
                Intent i =new Intent(SquareActivity.this,SphereActivity.class);
                startActivity(i);
                break;
        }
    }
}