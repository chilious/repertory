package com.night.web.service.base;

import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
public interface IBaseService {
    /**
     * 根据ID找到记录
     * @param id
     * @param <T>
     * @return
     * @throws Exception
     */
    public <T> T findByID(Class<T> t, Long id)throws Exception;

    /**
     * 找到所有记录
     * @param t
     * @param <T>
     * @return
     * @throws Exception
     */
    public <T> List<T> findAll(Class<T> t)throws Exception;
    /**
     * 保存一个实体
     */
    public <T> void save(T t)throws Exception;

    /**
     * 批量保存实体
     */
    public <T> void save(List<T> list)throws Exception;

    /**
     * 删除一个实体
     * @param t
     * @param <T>
     * @throws Exception
     */
    public <T> void delete(T t)throws Exception;

    /**
     * 删除多个实体
     * @param list
     * @param <T>
     * @throws Exception
     */
    public <T> void delete(List<T> list)throws Exception;
}
