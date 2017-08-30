package com.night.web.service.base;

import com.night.persistence.dao.admin.IAdminDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
@Service
@Transactional
public class BaseService implements IBaseService{
    @Resource
    private IAdminDao dao;

    @Override
    public <T> T findByID(Class<T> t, Long id) throws Exception {
        return dao.findByID(t,id);
    }

    @Override
    public <T> List<T> findAll(Class<T> t) throws Exception {
        return dao.findAll(t);
    }

    @Override
    public <T> void save(T t) throws Exception {
        dao.save(t);
    }

    @Override
    public <T> void save(List<T> list) throws Exception {
        for(T temp : list){
            dao.save(temp);
        }
    }

    @Override
    public <T> void delete(T t) throws Exception {
        dao.delete(t);
    }

    @Override
    public <T> void delete(List<T> list) throws Exception {
        dao.delete(list);
    }
}
