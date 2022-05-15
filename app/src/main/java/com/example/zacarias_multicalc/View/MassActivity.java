package com.example.zacarias_multicalc.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.zacarias_multicalc.Controller.Methods;
import com.example.zacarias_multicalc.Model.Variables;
import com.example.zacarias_multicalc.R;

public class MassActivity extends AppCompatActivity implements View.OnClickListener {
    EditText force,Density;
    Button solution;
    TextView forcetxt,densitytxt,resultkey;
    double solutionkey;

    Methods methods=new Methods();
    Variables var4=new Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);
        getSupportActionBar().hide();

        //id resources
        force=findViewById(R.id.forcetxt);
        Density=findViewById(R.id.accelerationtxt);
        solution=findViewById(R.id.press);
        forcetxt=findViewById(R.id.Force);
        densitytxt=findViewById(R.id.Acceleration);
        resultkey=findViewById(R.id.finalanswer);

        solution.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.press:
                var4.setVolume1(Double.parseDouble(force.getText().toString()));
                var4.setDensity(Double.parseDouble(Density.getText().toString()));
                solutionkey=methods.mass(var4.getVolume1(),var4.getDensity());
                resultkey.setText(""+solutionkey);
                break;
        }
    }
}