package com.example.piechart;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

public class MainActivity extends AppCompatActivity {
PieChartView pieChartView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pieChartView=(PieChartView)findViewById(R.id.chart);
        List<SliceValue> list=new ArrayList();

        list.add(new SliceValue(75, Color.parseColor("#5efc0f")));
        list.add(new SliceValue(25, Color.parseColor("#fc1b1b")));

        PieChartData pieChartData=new PieChartData(list);
        pieChartView.setPieChartData(pieChartData);
        pieChartView.setChartRotationEnabled(false);
    }
}
