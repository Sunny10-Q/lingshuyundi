package com.sunny.ms.transportinfo.service;

import com.sunny.ms.transportinfo.entity.TransportInfoDetail;
import com.sunny.ms.transportinfo.entity.TransportInfoEntity;

public interface TransportInfoService {

    TransportInfoEntity saveOrUpdate(String transportOrderId, TransportInfoDetail infoDetail);

    TransportInfoEntity queryByTransportOrderId(String transportOrderId);
}
