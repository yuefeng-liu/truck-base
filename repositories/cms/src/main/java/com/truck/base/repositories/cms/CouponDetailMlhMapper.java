package com.truck.base.repositories.cms;

import com.truck.base.entities.cms.CouponDetailMlh;
import com.truck.base.entities.cms.CouponDetailMlhExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CouponDetailMlhMapper {
    int countByExample(CouponDetailMlhExample example);

    int deleteByExample(CouponDetailMlhExample example);

    int insert(CouponDetailMlh record);

    int insertSelective(CouponDetailMlh record);

    List<CouponDetailMlh> selectByExampleWithRowbounds(CouponDetailMlhExample example, RowBounds rowBounds);

    List<CouponDetailMlh> selectByExample(CouponDetailMlhExample example);

    int updateByExampleSelective(@Param("record") CouponDetailMlh record, @Param("example") CouponDetailMlhExample example);

    int updateByExample(@Param("record") CouponDetailMlh record, @Param("example") CouponDetailMlhExample example);
}