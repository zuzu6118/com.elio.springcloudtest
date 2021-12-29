package com.elio.springcloud.service;

import com.elio.springcloud.service.impl.ProductFallbackServieImpl;
import dto.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "springcloud-product-provider",fallback = ProductFallbackServieImpl.class)
public interface ProductService {

    @GetMapping("product/provider/get/info")
     public Result getServiceInfo();
    /**
     * 查询
     * @param id
     * @return
     */
    @GetMapping("product/provider/get/{id}")
    public Result selectById(@PathVariable("id") Long id);
}
