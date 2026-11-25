package com.sunny.ms.sms.service;

import com.sunny.chaincloud.domain.sms.domain.SendResultDTO;
import com.sunny.chaincloud.domain.sms.domain.SmsInfoDTO;

import java.util.List;

public interface SmsService {

    /**
     * 发送短信
     *
     * @param smsInfoDTO 发送短信信息
     * @return 发送记录列表
     */
    List<SendResultDTO> sendSms(SmsInfoDTO smsInfoDTO);
}
