package com.night.system.utils.other;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
/**
 * Created by Administrator on 2017/8/28.
 */
public class DateUtil {
    /**
     * 返回指定格式的日期字符串
     * @param formart
     * @return
     */
    public static String getDateText(String formart,Date date)throws Exception{
        if(date == null) return null;
        SimpleDateFormat sdf = new SimpleDateFormat(formart);
        return sdf.format(date);
    }

    /**
     * 根据日期获取当周周一的日期
     * @return
     * @throws Exception
     */
    public static Date getThisMonday(Date date)throws Exception{
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY,0);
        c.set(Calendar.MINUTE,0);
        c.set(Calendar.SECOND,0);
        c.set(Calendar.MILLISECOND,0);
        c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        return c.getTime();
    }

    /**
     * 根据日期获取当日上周一的日期
     * @return
     * @throws Exception
     */
    public static Date getPreviousMonday(Date date)throws Exception{
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY,0);
        c.set(Calendar.MINUTE,0);
        c.set(Calendar.SECOND,0);
        c.set(Calendar.MILLISECOND,0);
        c.add(Calendar.WEEK_OF_YEAR,-1);
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return c.getTime();
    }
    /**
     * 根据日期获取当日下周一的日期
     * @return
     * @throws Exception
     */
    public static Date getNextMonday(Date date)throws Exception{
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY,0);
        c.set(Calendar.MINUTE,0);
        c.set(Calendar.SECOND,0);
        c.set(Calendar.MILLISECOND,0);
        c.add(Calendar.WEEK_OF_YEAR, 1);
        c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        return c.getTime();
    }

    /**
     * 根据日期获取当月第一天的日期
     * @return
     * @throws Exception
     */
    public static Date getThisMonthFirstDate(Date date)throws Exception{
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY,0);
        c.set(Calendar.MINUTE,0);
        c.set(Calendar.SECOND,0);
        c.set(Calendar.MILLISECOND,0);
        c.set(Calendar.DAY_OF_MONTH,1);
        return c.getTime();
    }

    /**
     * 根据日期获取上月第一天的日期
     * @return
     * @throws Exception
     */
    public static Date getPreviousMonthFirstDate(Date date)throws Exception{
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY,0);
        c.set(Calendar.MINUTE,0);
        c.set(Calendar.SECOND,0);
        c.set(Calendar.MILLISECOND,0);
        c.add(Calendar.MONTH, -1);
        c.set(Calendar.DAY_OF_MONTH,1);
        return c.getTime();
    }

    /**
     * 根据日期获取下月第一天的日期
     * @return
     * @throws Exception
     */
    public static Date getNextMonthFirstDate(Date date)throws Exception{
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY,0);
        c.set(Calendar.MINUTE,0);
        c.set(Calendar.SECOND,0);
        c.set(Calendar.MILLISECOND,0);
        c.add(Calendar.MONTH, 1);
        c.set(Calendar.DAY_OF_MONTH,1);
        return c.getTime();
    }

    /**
     * 根据日期格式和日期字符串返回时间
     * @param format
     * @param date
     * @return
     * @throws Exception
     */
    public static Date textToDate(String format,String date)throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(date);
    }

    /**
     * 根据日期格式和日期字符串返回时间的第二天
     * @param format
     * @param date
     * @return
     * @throws Exception
     */
    public static Date textToNextDate(String format,String date)throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date d = sdf.parse(date);
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.DAY_OF_YEAR, 1);
        return c.getTime();
    }

    /**
     * 获取当前日期昨天的0点
     * @param d
     * @return
     */
    public static Date getYestodayZeroTime(Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.set(Calendar.HOUR_OF_DAY,0);
        c.set(Calendar.MINUTE,0);
        c.set(Calendar.SECOND,0);
        c.set(Calendar.MILLISECOND,0);
        c.add(Calendar.DAY_OF_YEAR, -1);
        return c.getTime();
    }
    /**
     * 获取今天0点
     * @return
     * @throws Exception
     */
    public static Date getTodayZeroTime(Date today)throws Exception{
        Calendar c = Calendar.getInstance();
        c.setTime(today);
        c.set(Calendar.HOUR_OF_DAY,0);
        c.set(Calendar.MINUTE,0);
        c.set(Calendar.SECOND,0);
        c.set(Calendar.MILLISECOND,0);
        return c.getTime();
    }

    /**
     * 获取明天0点
     * @return
     * @throws Exception
     */
    public static Date getTomorrowZeroTime(Date today)throws Exception{
        Calendar c = Calendar.getInstance();
        c.setTime(today);
        c.set(Calendar.HOUR_OF_DAY,0);
        c.set(Calendar.MINUTE,0);
        c.set(Calendar.SECOND,0);
        c.set(Calendar.MILLISECOND,0);
        c.add(Calendar.DAY_OF_YEAR, 1);
        return c.getTime();
    }

    /**
     * 根据日期获取30天前的那天时间
     * @return
     */
    public static Date getMonthBeforeDate(Date today) {
        Calendar c = Calendar.getInstance();
        c.setTime(today);
        c.set(Calendar.HOUR_OF_DAY,0);
        c.set(Calendar.MINUTE,0);
        c.set(Calendar.SECOND,0);
        c.set(Calendar.MILLISECOND,0);
        c.add(Calendar.MONTH, -1);
        return c.getTime();
    }

    /**
     * 获取两个时间的月份差值
     * @return
     */
    public static int getMonthMinus(Date d1 ,Date d2){
        int result = 0;
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(d1);
        c2.setTime(d2);
        result = (c2.get(Calendar.YEAR)-c1.get(Calendar.YEAR))*12+c2.get(Calendar.MONTH) - c1.get(Calendar.MONTH);
        return result;
    }

    /**
     * 获取某日X天后的那天
     * @param d
     * @return
     */
    public static Date getXDaysLater(Date d, Integer X) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.DAY_OF_YEAR, X);
        return c.getTime();
    }

    /**
     * 判断某天是否是指定的周几
     * @param x
     * @return
     */
    public static boolean isThatWeekDay(Date d,Integer x) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        int today = c.get(Calendar.DAY_OF_WEEK);
        //一周第一天是否为星期天
        boolean isFirstSunday = (c.getFirstDayOfWeek() == Calendar.SUNDAY);
        //若一周第一天为星期天，则-1
        if(isFirstSunday){
            today = today - 1;
            if(today == 0){
                today = 7;
            }
        }
        if(today == x){
            return true;
        }
        return false;
    }

    /**
     * 判断某天是否是一月中的第几天
     * @param d
     * @param x
     * @return
     */
    public static boolean isThatMonthDay(Date d, Integer x) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        int today = c.get(Calendar.DAY_OF_MONTH);
        if(today == x){
            return true;
        }
        return false;
    }

    /**
     * 获取下一秒的时间
     * @param d
     * @return
     */
    public static Date getNextSecond(Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.SECOND, 1);
        return c.getTime();
    }


    /**
     * 获取两个时间的周数差
     * @param d1
     * @param d2
     * @return
     */
    public static int minusWeek(Date d1,Date d2){
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setFirstDayOfWeek(Calendar.MONDAY);
        c2.setFirstDayOfWeek(Calendar.MONDAY);
        c1.setTime(d1);
        c2.setTime(d2);
        int i1 = c1.get(Calendar.WEEK_OF_YEAR);
        int i2 = c2.get(Calendar.WEEK_OF_YEAR);
        return i2 - i1;
    }
}
