package com.sunny.ms.oms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunny.ms.oms.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单 Mapper 接口
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {

}
