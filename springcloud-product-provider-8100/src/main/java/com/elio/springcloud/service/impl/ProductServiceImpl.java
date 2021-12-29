package com.elio.springcloud.service.impl;

import com.elio.springcloud.dao.ProductMapper;
import com.elio.springcloud.entity.Product;
import com.elio.springcloud.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService{

    @Resource
    private ProductMapper productMapper;

    public Product selectById(Long id) { return productMapper.selectById(id); }

    public int deleteById(Long id) {
        return productMapper.deleteById(id);
    }

    public int updateById(Long id, String name) {
        return productMapper.updateById(id, name);
    }

    public int insertOne(Product product) {
        return productMapper.insertOne(product);
    }
}