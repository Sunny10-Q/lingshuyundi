package com.sunny.ms.sms.controller;

import com.sunny.chaincloud.domain.sms.domain.SendResultDTO;
import com.sunny.chaincloud.domain.sms.domain.SmsInfoDTO;
import com.sunny.ms.sms.service.SmsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("sms")
@Api(tags = "短信发送相关接口")
public class SmsController {

    @Resource
    private SmsService smsService;

    @PostMapping("send")
    @ApiOperation("发送短信")
    public List<SendResultDTO> send(@RequestBody SmsInfoDTO smsInfoDTO) {
        return this.smsService.sendSms(smsInfoDTO);
    }
}
