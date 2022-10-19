package com.example.smstest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.xzl.marquee.library.MarqueeView;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    TextView smsText;

    MarqueeView marqueeView;
    FrameLayout smsFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        smsText = findViewById(R.id.smsText);
//        smsText.setSelected(true);
//        smsFrame = findViewById(R.id.smsFrame);
//        smsFrame.setVisibility(View.GONE);

        marqueeView = findViewById(R.id.marquee);
        marqueeView.setText("동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세 무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세");
        marqueeView.start();


    }


}