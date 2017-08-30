package com.night.persistence.dao.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
@Repository
public class BaseDao implements IBaseDao{
    @Autowired
    protected
    HibernateTemplate ht;

    @Override
    public <T> T findByID(Class<T> t, Long id) throws Exception {
        return ht.get(t , id);
    }

    @Override
    public <T> List<T> findAll(Class<T> t) throws Exception {
        return ht.loadAll(t);
    }

    @Override
    public <T> void save(T t) throws Exception {
        ht.saveOrUpdate(t);
    }

    @Override
    public <T> void delete(T t) throws Exception {
        ht.delete(t);
    }

    @Override
    public <T> void delete(List<T> t) throws Exception {
        ht.deleteAll(t);
    }
}
