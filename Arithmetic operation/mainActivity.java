package com.example.arithmetic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   Button add,sub;

   EditText op1,op2;

   TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=(Button) findViewById(R.id.button);
        sub=(Button) findViewById(R.id.button2);
        op1=(EditText) findViewById(R.id.editTextTextPersonName);
        op2=(EditText) findViewById(R.id.editTextTextPersonName2);
        res=(TextView) findViewById(R.id.textView3);

        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            double opr1 = Double.parseDouble(op1.getText().toString());
                double opr2 = Double.parseDouble(op2.getText().toString());

                // add both number and store it to
                double ans = opr1 + opr2;

                // set it ot result textview
                res.setText(Double.toString(ans));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                double opr1 = Double.parseDouble(op1.getText().toString());
                double opr2 = Double.parseDouble(op2.getText().toString());

                // add both number and store it to
                double ans = opr1 - opr2;

                // set it ot result textview
                res.setText(Double.toString(ans));
            }
        });
    }
}
