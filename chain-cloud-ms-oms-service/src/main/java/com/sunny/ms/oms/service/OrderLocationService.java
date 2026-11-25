package com.sunny.ms.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunny.chaincloud.domain.oms.domain.OrderLocationDTO;
import com.sunny.ms.oms.entity.OrderLocationEntity;

/**
 * 位置信息 服务
 */
public interface OrderLocationService extends IService<OrderLocationEntity> {

    OrderLocationDTO findOrderLocationByOrderId(Long orderId);
}
