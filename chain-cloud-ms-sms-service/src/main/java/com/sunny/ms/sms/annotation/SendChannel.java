package com.sunny.ms.sms.annotation;

import com.sunny.ms.sms.enums.SendChannelEnum;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented //标记注解
public @interface SendChannel {

    SendChannelEnum type();

}
