package com.qishui.xtools;

import android.util.Log;
import java.util.Map;

/**
 * -----------------------------------------------
 * 作者：qishui on 2017/11/4 13:14
 * 邮箱：qishuichixi@163.com
 * 版本：V2.0.0
 * 作用：
 * <p>
 * -----------------------------------------------
 */

public class LogUtils {

    private static String TAG = "QISHUICHIXI";
    public static boolean flag = true;

    public static void setFlag(boolean flag) {
        LogUtils.flag = flag;
    }

    public static void setTAG(String TAG) {
        LogUtils.TAG = TAG;
    }

    public static void e(Object s) {
        e(s, "");
    }

    public static void e(Object s, String desc) {
        if (flag) {
            if ((s instanceof Map)) {
                outMap((Map) s, desc);
            } else {
                Log.e(TAG, StringUtils.addString(desc, "\n", StringUtils.toString(s)));
            }
        }
    }


    private static void outMap(Map map) {
        //遍历map
        outMap(map, "");
    }

    private static void outMap(Map map, String desc) {
        //遍历map
        Log.e(TAG, "\n================================" + desc + "============================================");
        for (Object s : map.keySet()) {
            Log.e(TAG, "key: " + s + "  value: " + map.get(s) + "\n");
        }
        Log.e(TAG, "\n================================" + desc + "============================================");
    }
}
