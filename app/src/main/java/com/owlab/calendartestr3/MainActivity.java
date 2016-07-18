package com.owlab.calendartestr3;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        PixelGridView pixelGridView = new PixelGridView(this);
        pixelGridView.setNumColumns(6);
        pixelGridView.setNumRows(5);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            pixelGridView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                @Override
                public void onScrollChange(View view, int i, int i1, int i2, int i3) {

                }
            });
        }

        setContentView(pixelGridView);
    }
}
