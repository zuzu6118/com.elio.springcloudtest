package com.elio.springcloud.service.impl;

import com.elio.springcloud.service.ProductService;
import dto.Result;
import org.springframework.stereotype.Component;

@Component
public class ProductFallbackServieImpl implements ProductService {
    @Override
    public Result getServiceInfo() {
        return new Result(500,"服务器内部出现错误，导致getServiceInfo接口异常",null);
    }

    @Override
    public Result selectById(Long id) {
        return new Result(500,"服务器内部出现错误，导致selectById接口异常",null);
    }
}
