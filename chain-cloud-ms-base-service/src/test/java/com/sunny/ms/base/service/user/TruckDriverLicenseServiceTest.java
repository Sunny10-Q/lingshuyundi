package com.sunny.ms.base.service.user;

import com.sunny.BaseApplication;
import com.sunny.ms.base.entity.user.TruckDriverLicenseEntity;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes = {BaseApplication.class})
public class TruckDriverLicenseServiceTest {

    @Resource
    private TruckDriverLicenseService truckDriverLicenseService;

    @Test
    public void findOne() {
        TruckDriverLicenseEntity entity = this.truckDriverLicenseService.findOne(1L);
        System.out.println(entity);
    }
}