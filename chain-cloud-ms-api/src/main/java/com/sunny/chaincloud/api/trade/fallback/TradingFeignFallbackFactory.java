package com.sunny.chaincloud.api.trade.fallback;

import com.sunny.chaincloud.api.trade.TradingFeign;
import com.sunny.chaincloud.domain.trade.domain.TradingDTO;
import org.springframework.cloud.openfeign.FallbackFactory;

public class TradingFeignFallbackFactory implements FallbackFactory<TradingFeign> {
    @Override
    public TradingFeign create(Throwable cause) {
        return new TradingFeign() {
            @Override
            public TradingDTO queryTrading(Long productOrderNo, Long tradingOrderNo) {
                return null;
            }
        };
    }
}
