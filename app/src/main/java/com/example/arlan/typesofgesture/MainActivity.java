package com.example.arlan.typesofgesture;

import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {

    TextView textView;
    GestureDetectorCompat gestureDetectorCompat;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.idTextView1);


        gestureDetectorCompat = new GestureDetectorCompat(this, this);
        button = (Button)findViewById(R.id.button);
        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetectorCompat.onTouchEvent(event);
                return true;
            }
        });
    }


    @Override
    public boolean onDown(MotionEvent e) {
        textView.setText("onDown");
        Log.v("arvinsTag", "onDown");
        return true;
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        textView.setText("onFling");
        Log.v("arvinsTag", "onFling");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        textView.setText("onLongPress");
        Log.v("arvinsTag", "onLongPress");
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        textView.setText("onScroll");
        Log.v("arvinsTag", "onScroll");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        textView.setText("onShowPress");
        Log.v("arvinsTag", "onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        textView.setText("onSingleTapUp");
        Log.v("arvinsTag", "onSingleTapUp");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        textView.setText("onDoubleTap");
        Log.v("arvinsTag", "onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        textView.setText("onDoubleTapEvent");
        return true;
    }


    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        textView.setText("onSingleTapConfirmed");
        Log.v("arvinsTag", "onSingleTapConfirmed");
        return true;
    }


}




