package com.example.foraddtask;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Page_3 extends AppCompatActivity implements View.OnClickListener {

    TextView textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14;
    EditText editText, editText2, editText3, editText4, editText5, editText6, editText7;
    Button button;
    int a=0;
    int a2 = 0;
    int a3 =0;
    int a4 = 0;
    //int setting2=0;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_3);
        textView=findViewById(R.id.tV);
        textView2=findViewById(R.id.tV2);
        textView3=findViewById(R.id.tV3);
        textView4=findViewById(R.id.tV4);
        textView5=findViewById(R.id.tV5);
        textView6=findViewById(R.id.tV6);
        textView7=findViewById(R.id.tV7);
        textView8=findViewById(R.id.tV8);
        textView9=findViewById(R.id.tV9);
        textView10=findViewById(R.id.tV10);
        textView11=findViewById(R.id.tV11);
        textView12=findViewById(R.id.tV12);
        textView13=findViewById(R.id.tV13);
        textView14=findViewById(R.id.tV14);
        editText=findViewById(R.id.eT);
        editText2=findViewById(R.id.eT2);
        editText3=findViewById(R.id.eT3);
        editText4=findViewById(R.id.eT4);
        editText5=findViewById(R.id.eT5);
        editText6=findViewById(R.id.eT6);
        editText7=findViewById(R.id.eT7);
        button=findViewById(R.id.btn);
        a=getIntent().getIntExtra("a", 0);
        a2=getIntent().getIntExtra("a2", 0);
        a3=getIntent().getIntExtra("a3", 0);
        a4=getIntent().getIntExtra("a4", 0);
        //setting2=getIntent().getIntExtra("setting2", 0);


        button.setOnClickListener(this);

    }

    String [] str ={"Button", "Button", "setText", "setBackgroundColor", "setWidth", "setGravity", "setTextColor"};
    public int a5=0;
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:
                String str1= String.valueOf(editText.getText());
                String str2= String.valueOf(editText2.getText());
                String str3= String.valueOf(editText3.getText());
                String str4= String.valueOf(editText4.getText());
                String str5= String.valueOf(editText5.getText());
                String str6= String.valueOf(editText6.getText());
                String str7= String.valueOf(editText7.getText());
                if (str[0].equals(str1)){
                    a5++;
                }if (str[1].equals(str2)){
                a5++;
            }if (str[2].equals(str3)){
                a5++;
            }if (str[3].equals(str4)){
                a5++;
            }if (str[4].equals(str5)){
                a5++;
            }if (str[5].equals(str6)){
                a5++;
            }if (str[6].equals(str7)){
                a5++;
            }
                textView14.setText(String.valueOf(a5));
                //int setting3=setting2+a5;
                Intent intent3=new Intent();
                intent3.putExtra("a", a);
                intent3.putExtra("a2", a2);
                intent3.putExtra("a3", a3);
                intent3.putExtra("a4", a4);
                intent3.putExtra("a5", a5);
                //intent3.putExtra("setting3", setting3);
                /*Bundle b=new Bundle();
                b.putInt("a", a);
                b.putInt("a2", a2);
                b.putInt("a3", a3);
                b.putInt("a4", a4);
                b.putInt("a5", a5);
                b.putInt("setting3", setting3);
                Intent intent3=new Intent();
                intent3.putExtras(b);
                intent3.putExtras(b);
                intent3.putExtras(b);
                intent3.putExtras(b);
                intent3.putExtras(b);
                intent3.putExtras(b);*/
                intent3.setClass(Page_3.this, Other.class);
                a5=0;
                startActivity(intent3);
                break;
        }
    }
}
