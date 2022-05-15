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

public class VolumeActivity extends AppCompatActivity implements View.OnClickListener {

    Button next,calculate;
    EditText length,width,height;
    TextView resultxt;
    double answer;


    Methods solve = new Methods();
    Variables variables = new Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_volume);
        getSupportActionBar().hide();


        next = findViewById(R.id.proceed);
        length = findViewById(R.id.lengthtxt);
        width = findViewById(R.id.widthtxt1);
        height = findViewById(R.id.Heightxt);
        calculate = findViewById(R.id.calculate);
        resultxt = findViewById(R.id.resultkey);

        calculate.setOnClickListener(this);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.calculate:
                variables.setLength(Double.parseDouble(length.getText().toString()));
                variables.setWidth(Double.parseDouble(width.getText().toString()));
                variables.setHeight(Double.parseDouble(height.getText().toString()));
                answer = solve.volumeA(variables.getLength(),variables.getWidth(),variables.getHeight());

                resultxt.setText("result: " + answer);
                break;
            case R.id.proceed:
                Intent intent = new Intent(VolumeActivity.this,AreaActivity.class);
                startActivity(intent);
                break;
        }
    }
}