package com.example.smstest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.xzl.marquee.library.MarqueeView;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    //TextView smsText;

    MarqueeView marqueeView;
    FrameLayout smsFrame;
    List<String> smsText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        smsText = findViewById(R.id.smsText);
//        smsText.setSelected(true);
//        smsFrame = findViewById(R.id.smsFrame);
//        smsFrame.setVisibility(View.GONE);
        smsText = new ArrayList<>();

        smsText.add("동해물과 백두산이 마르고 닳도록");
        smsText.add("하느님이 보우하사 우리나라 만세");
        smsText.add("무궁화 삼천리 화려강산");
        smsText.add("대한사람 대한으로 길이 보전하세");

        Log.d("msgmsg", "smsText : " + smsText.get(0));
        Log.d("msgmsg", "Serial Number : " + UUID.randomUUID().toString());

        marqueeView = new MarqueeView(this, null, 0, smsText);

//        marqueeView = findViewById(R.id.marquee);
//        marqueeView.setText("동해물과 백두산이 마르고 닳도록");
//        marqueeView.start();


    }

}