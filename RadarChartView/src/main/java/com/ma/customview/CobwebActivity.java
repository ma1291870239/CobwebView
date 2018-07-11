package com.ma.customview;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ma.customview.View.CobwebView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CobwebActivity extends AppCompatActivity {

    private CobwebView cobwebView;
    private List<Integer> list1=new ArrayList<>();
    private List<Integer> list2=new ArrayList<>();
    private List<Integer> list3=new ArrayList<>();
    private List<String> textList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cobweb);
        initData();
        initView();
    }

    private void initData() {
        for(int i=0;i<5;i++){
            list1.add(new Random().nextInt(100));
            list2.add(new Random().nextInt(100));
            list3.add(new Random().nextInt(100));
            textList.add("字体"+i);
        }
    }

    @SuppressLint("ResourceType")
    private void initView() {
        cobwebView=findViewById(R.id.main_cobweb);
//        cobwebView.setCobwebData("#D32F2F",list1);
//        cobwebView.setCobwebData("#388E3C",list2);
//        cobwebView.setCobwebData("#311B92",list3);
    }
}
