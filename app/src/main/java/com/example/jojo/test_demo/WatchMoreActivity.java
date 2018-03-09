package com.example.jojo.test_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * 查看更多
 * 显示全文与隐藏功能
 */
public class WatchMoreActivity extends AppCompatActivity {
    TextView tv;
    Button btn;
    boolean isShowAll;
    String s = "但发斯蒂芬的佛教啊哦啊二等奖发了恐惧似懂非懂，爱递交奇怪阿尔发票奥支付到上世纪的阿斯顿发送到撒旦法大的事爱递交奇怪阿尔发票奥支付到上世纪的阿斯顿发送到撒旦法大的事发爱递交奇怪阿尔发票奥支付到上世纪的阿斯顿发送到撒旦法大的事发爱递交奇怪阿尔发票奥支付到上世纪的阿斯顿发送到撒旦法大的事发爱递交奇怪阿尔发票奥支付到上世纪的阿斯顿发送到撒旦法大的事发发的爱的色放的阿斯顿发阿斯顿发阿萨德发的多发点";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_more);
        tv = findViewById(R.id.tv);
        btn = findViewById(R.id.btn);
//        tv.setHeight(3 * tv.getLineHeight());
        tv.setText(s);
        tv.setMaxLines(3);

//        CollapsibleTextView tv = (CollapsibleTextView) findViewById(R.id.desc_collapse_tv);
//        tv.setDesc(s, TextView.BufferType.NORMAL);
    }

    public void switchStaus(View v) {
        if (isShowAll) {
            isShowAll = false;
            btn.setText("展开全部");
        } else {
            btn.setText("收起");
            isShowAll = true;
        }

        if (isShowAll) {
//            tv.setHeight(tv.getLineCount() * tv.getLineHeight());
            tv.setMaxLines(Integer.MAX_VALUE);
            tv.requestLayout();
        } else {
//            tv.setHeight(3 * tv.getLineHeight());
            tv.setMaxLines(3);
            tv.requestLayout();
        }
    }
}
