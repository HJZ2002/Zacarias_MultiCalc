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

public class pressure extends AppCompatActivity implements View.OnClickListener {
    EditText forcetxt,areatxt;
    Button calculate;
    TextView force,area,result;
    Methods methodology=new Methods();
    Variables var6=new Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);
        getSupportActionBar().hide();

        //id
        forcetxt=findViewById(R.id.editTextNumberDecimal);
        areatxt=findViewById(R.id.editTextNumberDecimal2);
        calculate=findViewById(R.id.button);
        force=findViewById(R.id.forcetext);
        area=findViewById(R.id.areatext);
        result=findViewById(R.id.resultanswerkey);

        //listeners
        calculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                var6.setForce(Double.parseDouble(forcetxt.getText().toString()));
                var6.setArea1(Double.parseDouble(areatxt.getText().toString()));
                double answer = methodology.pressure(var6.getForce(), var6.getArea1());
                result.setText(""+answer);
                break;
        }
    }
}