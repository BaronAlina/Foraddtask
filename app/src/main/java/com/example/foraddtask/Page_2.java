package com.example.foraddtask;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Page_2 extends AppCompatActivity implements View.OnClickListener {

    TextView textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9;
    Button button, button2, button3, button4, button5, button6, button7, button8, button9;
    EditText editText;
    int a=0;
    int a2 = 0;
    //int setting=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_2);
        textView=findViewById(R.id.tV);
        textView2=findViewById(R.id.tV2);
        textView3=findViewById(R.id.tV3);
        textView4=findViewById(R.id.tV4);
        textView5=findViewById(R.id.tV5);
        textView6=findViewById(R.id.tV6);
        textView7=findViewById(R.id.tV7);
        textView8=findViewById(R.id.tV8);
        textView9=findViewById(R.id.tV9);
        button=findViewById(R.id.btn);
        button2=findViewById(R.id.btn2);
        button3=findViewById(R.id.btn3);
        button4=findViewById(R.id.btn4);
        button5=findViewById(R.id.btn5);
        button6=findViewById(R.id.btn6);
        button7=findViewById(R.id.btn7);
        button8=findViewById(R.id.btn8);
        button9=findViewById(R.id.btn9);
        editText=findViewById(R.id.eT);

        a=getIntent().getIntExtra("a", 0);
        a2=getIntent().getIntExtra("a2", 0);
        //setting=getIntent().getIntExtra("setting", 0);

        button.setOnClickListener(Page_2.this);
        button2.setOnClickListener(Page_2.this);
        button3.setOnClickListener(Page_2.this);
        button4.setOnClickListener(Page_2.this);
        button5.setOnClickListener(Page_2.this);
        button6.setOnClickListener(Page_2.this);
        button7.setOnClickListener(Page_2.this);


    }
    public int a3=0;
    public String str="3241";
    public String str1;

    public void onClick1(View view){
        str1 = String.valueOf(editText.getText());
        if (str1.equals(str)){
            a3+=4;
            //textView10.setText(String.valueOf(a));
        }else {
            a3=0;
            //textView10.setText(String.valueOf(0));
        }
    }


    public int a4;
    public int b=0;
    @Override
    public void onClick(View v) {

        if (b>=0){
            b++;
            switch (v.getId()){
                case R.id.btn:
                    textView4.setText(String.valueOf(b));
                    if (b==2){
                        a4++;
                    }
                    break;
                case R.id.btn2:
                    textView5.setText(String.valueOf(b));
                    if (b==3){
                        a4++;
                    }
                    break;
                case R.id.btn3:
                    textView6.setText(String.valueOf(b));
                    if (b == 1){
                        a4++;
                    }
                    break;
                case R.id.btn4:
                    textView7.setText(String.valueOf(b));
                    if (b==4){
                        a4++;
                    }
                    break;
                case R.id.btn5:
                    textView8.setText(String.valueOf(b));
                    if (b==6){
                        a4++;
                    }
                    break;
                case R.id.btn6:
                    textView9.setText(String.valueOf(b));
                    if (b==5){
                        a4++;
                    }
                    break;
                case R.id.btn7:
                    textView4.setText("");
                    textView5.setText("");
                    textView6.setText("");
                    textView7.setText("");
                    textView8.setText("");
                    textView9.setText("");
                    b=0;
                    break;
            }
        }
    }

    //public int setting2=setting+a3+a4;
    //public int mark=a2+setting;
    public void SaveAll(View view){
        Intent intent2=new Intent();
        intent2.putExtra("a", a);
        intent2.putExtra("a2", a2);
        intent2.putExtra("a3", a3);
        intent2.putExtra("a4", a4);
        //intent2.putExtra("setting", setting2);
        /*Bundle b2=new Bundle();
        b2.putInt("a", a);
        b2.putInt("a2", a2);
        b2.putInt("a3", a3);
        b2.putInt("a4", a4);
        b2.putInt("setting2", setting2);
        Intent intent2 = new Intent();
        intent2.putExtras(b2);
        intent2.putExtras(b2);
        intent2.putExtras(b2);
        intent2.putExtras(b2);
        intent2.putExtras(b2);*/
        intent2.setClass(Page_2.this, Page_3.class);
        startActivity(intent2);
    }

}
