package com.example.foraddtask;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Other extends AppCompatActivity implements View.OnClickListener {
    Button button;
    TextView textView, textView2, textView3, textView4, textView5, textView6, textView8;
    int a, a2, a3, a4, a5;
    //int setting3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);
        textView=findViewById(R.id.tVg);
        textView2=findViewById(R.id.tVg2);
        textView3=findViewById(R.id.tVg3);
        textView4=findViewById(R.id.tVg4);
        textView5=findViewById(R.id.tVg5);
        textView6=findViewById(R.id.tVg6);
        textView8=findViewById(R.id.tVg8);
        a=getIntent().getIntExtra("a", 0);
        a2=getIntent().getIntExtra("a2", 0);
        a3=getIntent().getIntExtra("a3", 0);
        a4=getIntent().getIntExtra("a4", 0);
        a5=getIntent().getIntExtra("a5", 0);
        //setting3=getIntent().getIntExtra("setting3", 0);
        button=findViewById(R.id.btn);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:
                textView.setText(String.valueOf(a));
                textView2.setText(String.valueOf(a2));
                textView3.setText(String.valueOf(a3));
                textView4.setText(String.valueOf(a4));
                textView5.setText(String.valueOf(a5));

                int setting=a+a2+a3+a4+a5;
                String other=String.valueOf(setting);
                String point2=other+" баллов";
                int p=setting*100;
                int percent0=(p/25);
                String percent=String.valueOf(percent0);
                String point=percent+"%";
                textView6.setText(point2);
                textView8.setText(point);
                break;
        }
    }
}
