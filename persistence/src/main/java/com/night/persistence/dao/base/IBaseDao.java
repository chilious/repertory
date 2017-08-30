package com.night.persistence.dao.base;

import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
public interface IBaseDao {
    /**
     * 根据ID获取一个实体
     * @param t
     * @param id
     * @param <T>
     * @return
     * @throws Exception
     */
    public <T> T findByID(Class<T> t , Long id)throws Exception;

    /**
     * 获取所有实体
     * @param t
     * @param <T>
     * @return
     * @throws Exception
     */
    public <T> List<T> findAll(Class<T> t)throws Exception;

    /**
     * 保存一个实体
     * @param t
     * @param <T>
     * @throws Exception
     */
    public <T> void save(T t)throws Exception;

    /**
     * 删除一个实体
     * @param t
     * @param <T>
     * @throws Exception
     */
    public <T> void delete(T t)throws Exception;

    /**
     * 批量删除多个实体
     * @param t
     * @param <T>
     * @throws Exception
     */
    public <T> void delete(List<T> t)throws Exception;
}
