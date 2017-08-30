package com.night.system.utils.other;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by Administrator on 2017/8/28.
 * 读取配置文件
 */
public class ProUtil {
    /**
     * 读取myConfig中的用户配置
     * @param key
     * @return
     * @throws Exception
     */
    @SuppressWarnings("finally")
    public static String readValue(String key){
        InputStreamReader is = null;
        String value = null;
        try{
            Properties p = new Properties();
            is = new InputStreamReader(ProUtil.class.getClassLoader().getResourceAsStream("myConfig.properties"),"utf-8");
            p.load(is);
            value = p.getProperty(key);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                if(is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return value;
        }
    }
}
