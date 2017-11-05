package com.qishui.ztools;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.qishui.xtools.LogUtils;
import com.qishui.xtools.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(StringUtils.toString(i), StringUtils.toString(10 - i));
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(StringUtils.toString(10 - i));
        }

        LogUtils.e(map);
        LogUtils.e(list);
        LogUtils.e("Hello");
        LogUtils.e(1);
        LogUtils.e('a');
        LogUtils.e(200L);
        LogUtils.e(2.5f);
        LogUtils.e(2.5d);

        LogUtils.e(map, "Map遍历");
        LogUtils.e(list, "List遍历");
        LogUtils.e("Hello", "String输出");
        LogUtils.e(1, "int输出");
        LogUtils.e('a', "字符输出");
        LogUtils.e(200L, "long输出");
        LogUtils.e(2.5f, "float输出");
        LogUtils.e(2.5d, "double输出");

    }
}
