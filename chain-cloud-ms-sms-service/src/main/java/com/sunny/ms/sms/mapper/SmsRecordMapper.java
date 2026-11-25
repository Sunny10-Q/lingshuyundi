package com.sunny.ms.sms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunny.ms.sms.entity.SmsRecordEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 短信发送记录 Mapper 接口
 */
@Mapper
public interface SmsRecordMapper extends BaseMapper<SmsRecordEntity> {
}
