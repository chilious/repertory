package com.night.web.controller;

import com.night.persistence.entity.StoreEntity;
import com.night.web.service.store.IStoreService;
import com.night.web.vo.Admin;
import com.night.web.vo.MyStoreInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/8/24.
 */
@Controller
@RequestMapping(value = "/store")
@ResponseBody
public class StoreController {
    @Autowired
    IStoreService service;
    @Autowired
    HttpServletRequest req;

    /**
     * 跳转到我的仓库
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/mystore" , method = RequestMethod.GET)
    public ModelAndView gotoMyStore()throws Exception{
        MyStoreInfo msi = new MyStoreInfo();
        Admin admin = (Admin) req.getSession().getAttribute("storeAdmin");
        Integer adminID = admin.getAdminEntity().getId();
        StoreEntity se = service.getStoreByAdminID(adminID);
        //仓库名称
        msi.setStoreName(se.getName());
        //累计采购次数
        msi.setPurchaseCount(service.getPurchaseCount(se.getId()));
        //累计采购费
        msi.setPurchaseMoney(service.getMaterialMoney(se.getId()));
        //出库成功次数
        msi.setOutCount_success(service.getOutCountSuccess(se.getId()));
        //出库失败次数
        msi.setOutCount_fail(service.getOutCountFail(se.getId()));
        //入库成功次数
        msi.setInCount_success(service.getInCountSuccess(se.getId()));
        //入库失败次数
        msi.setInCount_fail(service.getInCountFail(se.getId()));
        //累计快递费
        msi.setExpressMoney(service.getExpressMoney(se.getId()));
        //累计入库物料量
        HashMap<String,Double> inMaterial = service.getInMaterial(se.getId());
        msi.setInMaterial(inMaterial);
        //累计出库物料量
        HashMap<String,Double> outMaterial = service.getOutMaterial(se.getId());
        msi.setOutMaterial(outMaterial);
        //累计损耗物料量
        HashMap<String,Double> lossMaterial = service.getLossMaterial(se.getId());
        msi.setLossMaterial(lossMaterial);
        //当前仓库物料量
        HashMap<String,Double> nowMaterial = service.getNowMaterial(se.getId());
        msi.setNowMaterial(nowMaterial);
        return new ModelAndView("mystore/mystore");
    }
}
