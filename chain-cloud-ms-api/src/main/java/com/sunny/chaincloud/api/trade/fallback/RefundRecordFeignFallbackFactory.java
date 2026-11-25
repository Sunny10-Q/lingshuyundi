package com.sunny.chaincloud.api.trade.fallback;

import com.sunny.chaincloud.api.trade.RefundRecordFeign;
import com.sunny.chaincloud.domain.trade.domain.RefundRecordDTO;
import org.springframework.cloud.openfeign.FallbackFactory;

import java.util.List;

public class RefundRecordFeignFallbackFactory implements FallbackFactory<RefundRecordFeign> {
    @Override
    public RefundRecordFeign create(Throwable cause) {
        return new RefundRecordFeign() {
            @Override
            public List<RefundRecordDTO> findList(Long productOrderNo, Long tradingOrderNo) {
                return null;
            }
        };
    }
}
