package com.night.web.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Chilious on 2017/9/5.
 */
public class MyStoreInfo {
    private String storeName;
    private BigDecimal expressMoney;
    private Integer purchaseCount;
    private Integer outCount_success;
    private Integer outCount_fail;
    private Integer inCount_success;
    private Integer inCount_fail;
    private BigDecimal purchaseMoney;
    private HashMap<String,Double> inMaterial;
    private HashMap<String,Double> outMaterial;
    private HashMap<String,Double> lossMaterial;
    private HashMap<String,Double> nowMaterial;
    private ArrayList<Admin> adminList;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public BigDecimal getExpressMoney() {
        return expressMoney;
    }

    public void setExpressMoney(BigDecimal expressMoney) {
        this.expressMoney = expressMoney;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    public Integer getOutCount_success() {
        return outCount_success;
    }

    public void setOutCount_success(Integer outCount_success) {
        this.outCount_success = outCount_success;
    }

    public Integer getOutCount_fail() {
        return outCount_fail;
    }

    public void setOutCount_fail(Integer outCount_fail) {
        this.outCount_fail = outCount_fail;
    }

    public Integer getInCount_success() {
        return inCount_success;
    }

    public void setInCount_success(Integer inCount_success) {
        this.inCount_success = inCount_success;
    }

    public Integer getInCount_fail() {
        return inCount_fail;
    }

    public void setInCount_fail(Integer inCount_fail) {
        this.inCount_fail = inCount_fail;
    }

    public BigDecimal getPurchaseMoney() {
        return purchaseMoney;
    }

    public void setPurchaseMoney(BigDecimal purchaseMoney) {
        this.purchaseMoney = purchaseMoney;
    }

    public HashMap<String, Double> getInMaterial() {
        return inMaterial;
    }

    public void setInMaterial(HashMap<String, Double> inMaterial) {
        this.inMaterial = inMaterial;
    }

    public HashMap<String, Double> getLossMaterial() {
        return lossMaterial;
    }

    public void setLossMaterial(HashMap<String, Double> lossMaterial) {
        this.lossMaterial = lossMaterial;
    }

    public HashMap<String, Double> getNowMaterial() {
        return nowMaterial;
    }

    public void setNowMaterial(HashMap<String, Double> nowMaterial) {
        this.nowMaterial = nowMaterial;
    }

    public ArrayList<Admin> getAdminList() {
        return adminList;
    }

    public void setAdminList(ArrayList<Admin> adminList) {
        this.adminList = adminList;
    }

    public HashMap<String, Double> getOutMaterial() {
        return outMaterial;
    }

    public void setOutMaterial(HashMap<String, Double> outMaterial) {
        this.outMaterial = outMaterial;
    }
}
