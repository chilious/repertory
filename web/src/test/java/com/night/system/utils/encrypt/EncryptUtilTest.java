package com.night.system.utils.encrypt;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/8/29.
 */
public class EncryptUtilTest {
    @Test
    public void encrypt() throws Exception {
        String s = EncryptUtil.encrypt("000000");
        System.out.println(s);
    }

    @Test
    public void decrypt() throws Exception {
    }

}