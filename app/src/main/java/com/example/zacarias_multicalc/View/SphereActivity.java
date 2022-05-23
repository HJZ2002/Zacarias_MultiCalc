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

public class SphereActivity extends AppCompatActivity implements View.OnClickListener {
    TextView result;
    EditText sphere;
    Button solve,next;
    Variables var8=new Variables();
    Methods methods=new Methods();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);
        getSupportActionBar().hide();

        //id
        result=findViewById(R.id.ResultText);
        sphere=findViewById(R.id.sphereTxT);
        solve=findViewById(R.id.solvekey);
        next=findViewById(R.id.nextKey);

        solve.setOnClickListener(this);
        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.solvekey:
                var8.setR(Double.parseDouble(sphere.getText().toString()));
                double solve=methods.volumeSphere(var8.getR(), var8.getAnswer1());
                result.setText(""+solve);
                break;
            case R.id.nextKey:
                Intent intent=new Intent(SphereActivity.this,Kinetic.class);
                startActivity(intent);
                break;
        }
    }
}