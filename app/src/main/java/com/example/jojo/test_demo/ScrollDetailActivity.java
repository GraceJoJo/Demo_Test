package com.example.jojo.test_demo;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

//http://blog.csdn.net/jkloshhm/article/details/78650081
// Android Scrollview上滑停靠—悬浮框停靠在标题栏下方（防微博详情页）
public class ScrollDetailActivity extends AppCompatActivity {

    private LinearLayout ll_suspens_bar;
    private LinearLayout ll_top_view;
    private ScrollView scrollview;
    private TextView tv_title_content;
    private View view_divider;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ll_suspens_bar = findViewById(R.id.ll_suspens_bar);
        scrollview = findViewById(R.id.scrollview);
        tv_title_content = findViewById(R.id.tv_title_content);
        ll_top_view = findViewById(R.id.ll_top_view);
        view_divider = findViewById(R.id.view_divider);
        initListener();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void initListener() {
        scrollview.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
//                Log.e("TAG", "scrollY=" + scrollY);
                if (scrollY >= tv_title_content.getHeight() + view_divider.getHeight()) {
                    ll_suspens_bar.setVisibility(View.VISIBLE);
                    ll_top_view.setVisibility(View.INVISIBLE);
                } else {
                    ll_suspens_bar.setVisibility(View.GONE);
                    ll_top_view.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
