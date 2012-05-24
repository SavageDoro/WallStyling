package de.berlin.htw;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;

public class PaintActivity extends Activity implements OnTouchListener  {
    private float x;
    private float y;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paint);
        MyCustomPanel view = new MyCustomPanel(this);
        
        ViewGroup.LayoutParams params = 
                            new ViewGroup.LayoutParams(LayoutParams.FILL_PARENT,
                                                       LayoutParams.FILL_PARENT);
        addContentView(view, params);
        view.setOnTouchListener(this);
        
    }
    private class MyCustomPanel extends View {

        public MyCustomPanel(Context context) {
            super(context);
            
        }
        @Override
        public void draw(Canvas canvas) {
            
            Paint paint = new Paint();
            
            // linewidth for both lines 
            paint.setStrokeWidth(10);
            
            paint.setColor(Color.GREEN);                    
            canvas.drawLine(100,100,200,250,paint);
            
            paint.setColor(Color.RED);
            canvas.drawLine(200, 250, 300, 210, paint);
            
            canvas.drawCircle(200, 250, 3, paint);
            
            //circle for touchEvent
            canvas.drawCircle(x,y,20, paint);
            
            
        }
    }
    public boolean onTouch(View v, MotionEvent event) {
        x = event.getX();
        y = event.getY();
        
        v.invalidate();
        return true;
    }
}