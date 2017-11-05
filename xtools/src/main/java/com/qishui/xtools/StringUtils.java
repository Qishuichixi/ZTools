package com.qishui.xtools;

/**
 * -----------------------------------------------
 * 作者：qishui on 2017/11/4 11:41
 * 邮箱：qishuichixi@163.com
 * 版本：V2.0.0
 * 作用：
 * 字符串工具类
 * -----------------------------------------------
 */

public class StringUtils {

    /**
     * 字符串叠加
     *
     * @param objects
     * @return
     */
    public static String addString(Object... objects) {

        if (objects == null) return "";
        if (objects.length == 0) return "";

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < objects.length; i++) {
            sb.append("" + objects[i]);
        }
        return sb.toString();
    }

    public static String toString(Object obj) {
        if (obj == null) return "";
        return "" + obj;
    }


    /**
     * 判断字符串是否为空
     *
     * @param content
     * @return
     */
    public static Boolean isEmpty(String content) {

        if (content == null || "".equals(content)) {
            return true;
        }
        return false;
    }


    /**
     * 比较两个字符串
     *
     * @param s1
     * @param s2
     * @return
     */
    public static Boolean isEquals(String s1, String s2) {

        if (s1 != null && s2 != null) {

            if (s1.equals(s2)) {
                return true;
            } else {
                return false;
            }
        } else {

            if (s1 == null && s2 == null) {
                return true;
            } else {
                return false;
            }
        }
    }


    /**
     * 长度
     *
     * @param s1
     * @return
     */
    public static int getLenth(String s1) {

        if (!isEmpty(s1)) {
            return s1.length();
        }
        return 0;
    }


    /**
     * 大写
     *
     * @param s
     * @return
     */
    public static String toUpperCase(String s) {

        if (isEmpty(s)) {
            return "";
        } else {
            return s.toUpperCase();
        }
    }

}
