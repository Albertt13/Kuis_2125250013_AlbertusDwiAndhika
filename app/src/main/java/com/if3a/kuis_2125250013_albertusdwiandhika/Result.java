package com.if3a.kuis_2125250013_albertusdwiandhika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    private TextView tv1, tv2, tv3;
    private Button Btn_Logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tv1 = findViewById(R.id.tv_r1);
        tv2 = findViewById(R.id.tv_r2);
        tv3 = findViewById(R.id.tv_r3);

        Btn_Logout = findViewById(R.id.btn_LO);

        Intent intent = getIntent();
        tv1.setText(intent.getStringExtra("varr1"));
        tv2.setText(intent.getStringExtra("varr2"));
        tv3.setText(intent.getStringExtra("varr3"));
        Btn_Logout.setText(intent.getStringExtra("varLO"));
    }
}