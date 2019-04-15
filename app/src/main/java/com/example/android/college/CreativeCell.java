package com.example.android.college;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CreativeCell extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creative_cell);

        findViewById(R.id.llABES).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreativeCell.this,CreativeABES.class);
                startActivity(intent);
            }
        });


        findViewById(R.id.llSamvaad).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreativeCell.this,CreativeSamvaad.class);
                startActivity(intent);
            }
        });
    }
}
