package com.night.system.utils.other;

/**
 * Created by Administrator on 2017/8/28.
 * 字符串工具类
 */
public class StringUtil {
    /**
     * 判断字符串是否为空
     * @param s
     * @return
     */
    public static boolean isNone(String s){
        if(s == null)
            return true;
        if("".equals(s.trim()))
            return true;
        return false;
    }
}
