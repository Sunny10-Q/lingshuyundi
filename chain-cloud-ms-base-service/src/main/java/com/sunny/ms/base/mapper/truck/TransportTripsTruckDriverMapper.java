package com.sunny.ms.base.mapper.truck;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunny.ms.base.entity.truck.TransportTripsTruckDriverEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 车次与车辆关联信息表  Mapper 接口
 * </p>
 *
 * @author itcast
 * @since 2019-12-20
 */
@Mapper
public interface TransportTripsTruckDriverMapper extends BaseMapper<TransportTripsTruckDriverEntity> {

}
