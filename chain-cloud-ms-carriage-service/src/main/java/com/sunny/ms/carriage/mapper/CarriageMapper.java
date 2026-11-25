package com.sunny.ms.carriage.mapper;

import com.sunny.ms.carriage.entity.CarriageEntity;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 运费管理表 mapper接口
 */
@Mapper
public interface CarriageMapper extends BaseMapper<CarriageEntity> {

}
