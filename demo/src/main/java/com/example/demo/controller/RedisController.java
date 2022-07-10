package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.domain.Book;
import com.example.demo.domain.SearchResponse;
import com.example.demo.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lsy
 * @create: 2022-07-09 09:26
 **/
@RestController
public class RedisController {
    @Autowired
    private CacheService cacheService;

    @RequestMapping("/t1")
    public SearchResponse t1(String bookId){
        SearchResponse response = cacheService.getResponse(bookId);
        return response;
    }

    @RequestMapping("/t2")
    public SearchResponse t2(String bookId){
        SearchResponse response = cacheService.getResponse2(bookId);
        return response;
    }
}
