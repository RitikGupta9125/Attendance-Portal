package com.example.android.college;

import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PythonTraining extends AppCompatActivity {
    private BottomSheetBehavior bottomSheetBehavior1,bottomSheetBehavior2;
    private CoordinatorLayout layout;
    Button one,two;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_training);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        final View bottomsheet = findViewById(R.id.sheet1);
        final View bottomsheet2 =findViewById(R.id.sheet2);
        bottomSheetBehavior1 = BottomSheetBehavior.from(bottomsheet);
        bottomSheetBehavior2 = BottomSheetBehavior.from(bottomsheet2);
        layout =  findViewById(R.id.coordinateLayout);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bottomSheetBehavior1.getState() == BottomSheetBehavior.STATE_EXPANDED) {
                    bottomSheetBehavior1.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetBehavior1.setState(BottomSheetBehavior.STATE_EXPANDED);

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetBehavior2.setState(BottomSheetBehavior.STATE_EXPANDED);

            }
        });
    }
}
