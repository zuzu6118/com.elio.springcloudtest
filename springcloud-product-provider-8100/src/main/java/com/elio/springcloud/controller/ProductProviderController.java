package com.elio.springcloud.controller;

import com.elio.springcloud.entity.Product;
import com.elio.springcloud.service.ProductService;
import dto.Result;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Log4j
@RequestMapping("/")
public class ProductProviderController {

    @Resource
     private ProductService productService ;

    @Value("${spring.application.name}")
     private String instantName;

    @Value("${server.port}")
    private String port;

    @GetMapping("product/provider/get/info")
     public Result getServiceInfo()
     {
         return new Result(200, "查询成功", "当前服务名："+instantName + " 当前端口："+port);
     }
    /**
     * 查询
     * @param id
     * @return
     */
    @GetMapping("product/provider/get/{id}")
    public Result selectById(@PathVariable("id") Long id) throws Exception {
        return new Result(200, "查询成功", productService.selectById(id));
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @GetMapping("product/provider/delete/{id}")
    public Result deleteById(@PathVariable("id") Long id){
        return new Result(200, "删除成功", productService.deleteById(id));
    }

    /**
     * 修改
     * @param product
     * @return
     */
    @PostMapping("product/provider/update")
    public Result updateById(@RequestBody Product product){
        return new Result(200, "修改成功", productService.updateById(product.getId(), product.getName()));

    }

    /**
     * 新增
     * @return
     */
    @PutMapping( "product/provider/add")
    public Result insertById(@RequestBody Product product){
        return new Result(200, "修改成功", productService.insertOne(product));
    }
}
