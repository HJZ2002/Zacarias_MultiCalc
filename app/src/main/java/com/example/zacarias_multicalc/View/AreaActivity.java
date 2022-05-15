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

public class AreaActivity extends AppCompatActivity implements View.OnClickListener {

    Button next2, solve;
    EditText basetxt,heightxt;
    TextView result2;


    Methods methods=new Methods();
    Variables var1 =new Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_area);
        getSupportActionBar().hide();

        //id resources
        next2 = findViewById(R.id.nextwo);
        basetxt = findViewById(R.id.base);
        heightxt = findViewById(R.id.areaheight);
        solve = findViewById(R.id.solve);
        result2 = findViewById(R.id.equals);
        //button listeners
        solve.setOnClickListener(this);
        next2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.solve:
                var1.setBase(Double.parseDouble(basetxt.getText().toString()));
                var1.setHeight(Double.parseDouble(heightxt.getText().toString()));
                double solve = methods.triangleArea(var1.getBase(), var1.getHeight());
                result2.setText("" + solve);
                break;
            case R.id.nextwo:
                Intent i2 = new Intent(AreaActivity.this, Kinetic.class);
                startActivity(i2);
                break;
        }
    }
}