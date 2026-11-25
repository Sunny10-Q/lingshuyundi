package com.sunny.ms.trade.annotation;

import com.sunny.chaincloud.domain.trade.enums.PayChannelEnum;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PayChannel {

    PayChannelEnum type();

}
