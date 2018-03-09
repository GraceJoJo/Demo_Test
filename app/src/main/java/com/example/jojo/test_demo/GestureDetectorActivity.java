package com.example.jojo.test_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;

public class GestureDetectorActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

    private GestureDetector detector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gesture_detector);

        //创建手势检测器
        detector = new GestureDetector(this, this);
    }

    //将该activity上的触碰事件交给GestureDetector处理
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return detector.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Log.e("TAG", "e1.getX()=" + e1.getX());
        Log.e("TAG", "e2.getX()=" + e2.getX());
        Log.e("TAG", "velocityX=" + velocityX);
        Log.e("TAG", "velocityY=" + velocityY);
        float minMove = 120;         //最小滑动距离
        float minVelocity = 0;      //最小滑动速度
        float beginX = e1.getX();
        float endX = e2.getX();
        float beginY = e1.getY();
        float endY = e2.getY();

        if (beginX - endX > minMove && Math.abs(velocityX) > minVelocity) {   //左滑
            Toast.makeText(this, velocityX + "左滑", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, ScrollDetailActivity.class);
            startActivity(intent);
        } else if (endX - beginX > minMove && Math.abs(velocityX) > minVelocity) {   //右滑
            Intent intent = new Intent(this, WatchMoreActivity.class);
            startActivity(intent);
            Toast.makeText(this, velocityX + "右滑", Toast.LENGTH_SHORT).show();
        } else if (beginY - endY > minMove && Math.abs(velocityY) > minVelocity) {   //上滑
            Intent intent = new Intent(this, LoadMoreRvActivity.class);
            startActivity(intent);
            Toast.makeText(this, velocityX + "上滑", Toast.LENGTH_SHORT).show();
        } else if (endY - beginY > minMove && Math.abs(velocityY) > minVelocity) {   //下滑
            Toast.makeText(this, velocityX + "下滑", Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}
