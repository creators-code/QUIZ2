package com.example.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Q1 extends AppCompatActivity {
    private Button bu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        bu = (Button) findViewById(R.id.button2);
        bu.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      openq2();
                                  }
                              }
        );
    }

    public void openq2() {
        Intent intent = new Intent(this, q2.class);
        startActivity(intent);
    }
}
