package com.xxy.seckill.seckillmanagement.dao;

import com.xxy.seckill.seckillmanagement.dataobject.PromoDAO;
import com.xxy.seckill.seckillmanagement.service.model.PromoModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PromoDAOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Mon May 13 22:54:35 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    int deletePromo(@Param("idList") String[] idList);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Mon May 13 22:54:35 CST 2019
     */
    int insert(PromoDAO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Mon May 13 22:54:35 CST 2019
     */
    int insertSelective(PromoDAO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Mon May 13 22:54:35 CST 2019
     */
    PromoDAO selectByPrimaryKey(Integer id);

    PromoDAO selectByItemId(Integer itemId);

    List<PromoDAO> listPromo(PromoModel promoModel);

    int listPromoCount(PromoModel promoModel);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Mon May 13 22:54:35 CST 2019
     */
    int updateByPrimaryKeySelective(PromoDAO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Mon May 13 22:54:35 CST 2019
     */
    int updateByPrimaryKey(PromoDAO record);
}