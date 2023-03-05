package com.example.billing;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button submit;
    CheckBox Pizza, Burger,Cake,Fries;
    TextView Result;
    EditText e1,e2,e3,e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Result=(TextView) findViewById(R.id.Result);
        submit=(Button) findViewById(R.id.submit);
        Pizza=(CheckBox) findViewById(R.id.Pizza);
        Burger=(CheckBox) findViewById(R.id.Burger);
        Cake=(CheckBox) findViewById(R.id.Cake);
        Fries=(CheckBox) findViewById(R.id.Fries);
        e1=(EditText) findViewById(R.id.e1);
        e2=(EditText) findViewById(R.id.e2);
        e3=(EditText) findViewById(R.id.e3);
        e4=(EditText) findViewById(R.id.e4);
        submit.setOnClickListener(new View.OnClickListener() {
            int total=0;
            StringBuilder res=new StringBuilder();

            @Override
            public void onClick(View view) {
                if(Pizza.isChecked()&&e1.getText().toString()!=null){
                    total+=10*Integer.parseInt(e1.getText().toString());
                }
                if(Burger.isChecked()&&e2.getText().toString()!=null){
                    total+=5*Integer.parseInt(e2.getText().toString());
                }
                if(Cake.isChecked()&&e3.getText().toString()!=null){
                    total+=50*Integer.parseInt(e3.getText().toString());
                }
                if(Fries.isChecked()&&e4.getText().toString()!=null){
                    total+=10*Integer.parseInt(e4.getText().toString());
                }
                res.append("Total : "+ total+"Rs");
                Result.setText(res.toString());
            }
        });
    }
}
