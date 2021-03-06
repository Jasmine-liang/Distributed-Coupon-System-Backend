package com.passbook.dao;

/*
 * Merchants Dao接口
 * */

import com.passbook.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MerchantsDao extends JpaRepository<Merchants, Integer> {
    /**
     * 根据id获取商户对象
     * @param id ， 商户id
     *@return {@link Merchants}
     */

    Merchants findUserById(Integer id);
    /**
     * 根据商户名称获取商户对象
     * @param name， 商户名称
     * @return {@link Merchants}
     */

    Merchants findByName(String name);

    /**
     * 根据商户ids获取商户对象
     * @param ids 商户ids
     * @return {@link Merchants}
     */
    List<Merchants> findByIdIn(List<Integer> ids);

}