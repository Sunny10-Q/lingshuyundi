package com.sunny.chaincloud.api.transportInfo.fallback;

import com.sunny.chaincloud.api.transportInfo.TransportInfoFeign;
import com.sunny.chaincloud.domain.transportInfo.domain.TransportInfoDTO;
import org.springframework.cloud.openfeign.FallbackFactory;

/**
 * @author zzj
 * @version 1.0
 */
public class TransportInfoFeignFallbackFactory implements FallbackFactory<TransportInfoFeign> {
    @Override
    public TransportInfoFeign create(Throwable cause) {
        return new TransportInfoFeign() {
            @Override
            public TransportInfoDTO queryByTransportOrderId(String transportOrderId) {
                return null;
            }
        };
    }
}
