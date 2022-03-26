package com.anu.mp_fix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button inc, dec;
    TextView tv;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inc = findViewById(R.id.increment);
        dec = findViewById(R.id.decrement);
        tv = findViewById(R.id.textView);

        inc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                count++;
                tv.setText(count + " Clicks!");

            }
        });

        inc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                count--;
                tv.setText(count + " Clicks!");
            }
        });


    }
}