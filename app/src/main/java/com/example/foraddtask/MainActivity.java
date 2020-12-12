package com.example.foraddtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    CheckBox chBox, chBox2, chBox3, chBox4;
    TextView textView, textView2;
    RadioButton rB, rB2, rB3, rB4;
    Button button2, button3;
    RadioGroup radioGroup;
    int a, a2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chBox=findViewById(R.id.chBox);
        chBox2=findViewById(R.id.chBox2);
        chBox3=findViewById(R.id.chBox3);
        chBox4=findViewById(R.id.chBox4);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        rB=findViewById(R.id.rB);
        rB2=findViewById(R.id.rB2);
        rB3=findViewById(R.id.rB3);
        rB4=findViewById(R.id.rB4);
        button2=findViewById(R.id.btn2);
        button3=findViewById(R.id.btn3);
        radioGroup=findViewById(R.id.rG);

        chBox.setOnCheckedChangeListener(this);
        chBox2.setOnCheckedChangeListener(this);
        chBox3.setOnCheckedChangeListener(this);
        chBox4.setOnCheckedChangeListener(this);
        rB.setOnCheckedChangeListener(this) ;
        rB2.setOnCheckedChangeListener(this);
        rB3.setOnCheckedChangeListener(this);
        rB4.setOnCheckedChangeListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);


    }


    //public int a=0;
    //public int a2=0;
    /*public String mainA="No, 0";
    public String mainA2="No, 0";
    public String mainA3="No, 0";
    public String mainA4="No, 0";*/

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()){
            case R.id.chBox2:
                a++;
                //mainA="Yes, 1";
                break;
            case R.id.chBox3:
                a++;
                //mainA2="Yes, 1";
                break;
            case R.id.chBox4:
                a++;
                //mainA3="Yes, 1";
                break;
            case R.id.rB3:
                a2=5;
                //mainA4="Yes, 3";
                break;
        }

    }
    //public int setting=a+a2;
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn2:
                radioGroup.clearCheck();
                break;
            case R.id.btn3:
                Intent intent=new Intent();
                intent.putExtra("a", a);
                intent.putExtra("a2", a2);
                //intent.putExtra("setting", setting);
                /*Bundle b =new Bundle();
                b.putInt("a", a);
                b.putInt("a2", a2);
                b.putInt("setting", setting);
                Intent intent=new Intent();
                intent.putExtras(b);
                intent.putExtras(b);
                intent.putExtras(b);*/
                intent.setClass(MainActivity.this, Page_2.class);
                startActivity(intent);
                break;
            // case для передачи mainA1-4
        }
    }
}