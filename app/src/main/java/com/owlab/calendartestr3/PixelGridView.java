package com.owlab.calendartestr3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by ernest on 7/17/16.
 */
public class PixelGridView extends View {
    private static final String TAG = PixelGridView.class.getSimpleName();

    private int numColumns;
    private int numRows;
    private int cellWidth, cellHeight;
    private Paint aPaint = new Paint();

    private boolean[][] cellChecked;

    public PixelGridView(Context context) {
        super(context);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oW, int oH) {
        super.onSizeChanged(w, h, oW, oH);

        calculateDimensions();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.WHITE);

        if(numColumns < 1 || numRows < 1) {
            return;
        }

        int width = getWidth();
        int height = getHeight();

        for(int i = 0; i < numColumns; i++) {
            for(int j = 0; j < numRows; j++) {
                if(cellChecked[i][j]) {
                    canvas.drawRect(i * cellWidth, j * cellHeight,
                            (i+1) * cellWidth, (j+1) * cellHeight,
                            aPaint);
                }
            }
        }

        for(int i = 1; i < numColumns; i++) {
            canvas.drawLine(i * cellWidth, 0,
                    i * cellWidth, height,
                    aPaint);
        }

        for(int j = 1; j < numRows; j++) {
            canvas.drawLine(0, j * cellHeight,
                    width, j * cellHeight,
                    aPaint);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN) {
            int column = (int)(event.getX() / cellWidth);
            int row = (int)(event.getY() / cellHeight);

            cellChecked[column][row] = !cellChecked[column][row];
            invalidate();
        }

        return true;
    }


    private void calculateDimensions() {
        if(numColumns < 1 || numRows < 1) {
            return;
        }

        cellWidth = getWidth() / numColumns;
        cellHeight = getHeight() / numRows;

        cellChecked = new boolean[numColumns][numRows];

        invalidate();
    }

    public int getNumColumns() {
        return numColumns;
    }

    public void setNumColumns(int numColumns) {
        this.numColumns = numColumns;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }
}
