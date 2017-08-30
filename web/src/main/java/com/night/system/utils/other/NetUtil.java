package com.night.system.utils.other;

/**
 * Created by Administrator on 2017/8/28.
 */
public class NetUtil {
    /**
     * 判断是否为ajax请求
     * @return
     */
    public static boolean isAjax(String header){
        return (header != null  && "XMLHttpRequest".equals( header.toString())) ;
    }
}
