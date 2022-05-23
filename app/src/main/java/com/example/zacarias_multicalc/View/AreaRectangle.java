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

public class AreaRectangle extends AppCompatActivity implements View.OnClickListener {
    Button Proceed, solvekey;
    EditText lengthtxt,widthtxt;
    TextView result3;


    Methods methods4=new Methods();
    Variables var6 =new Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_area_rectangle);
        getSupportActionBar().hide();
        //id resources
        Proceed=findViewById(R.id.NextButton);
        solvekey=findViewById(R.id.Calculatebutton);
        lengthtxt=findViewById(R.id.LengthTxT);
        widthtxt=findViewById(R.id.widthtxt);
        result3=findViewById(R.id.resultextkey);

        solvekey.setOnClickListener(this);
        Proceed.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Calculatebutton:
                var6.setLength1(Double.parseDouble(lengthtxt.getText().toString()));
                var6.setWidth1(Double.parseDouble(widthtxt.getText().toString()));
                double key=methods4.areaRectangle(var6.getLength1(), var6.getWidth1(),var6.getRectangle());
                result3.setText(""+key);
                break;
            case R.id.NextButton:
                Intent intent =new Intent(AreaRectangle.this,SquareActivity.class);
                startActivity(intent);
        }
    }
}