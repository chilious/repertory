package com.night.web.Interaction;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/8/28.
 */
public class ClientJson extends HashMap{
    private static final long serialVersionUID = 1L;

    public ClientJson(){
        this.put("success",true);
    }
    public void setSuccess(boolean b){
        this.put("success", b);
    }
    public void setErrorMsg(String error){
        this.put("msg", error);//添加错误信息
    }
    public void setAttribute(String key,Object value){
        this.put(key, value);
    }
}
