package com.example.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.domain.Book;
import com.example.demo.domain.SearchResponse;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: lsy
 * @create: 2022-07-09 10:09
 **/
@Service
public class CacheService {

    @Cacheable(value = "test")
    public SearchResponse getResponse(String bookId) {
        // 获取书籍对象,此对象实现了序列化
        Book book = getBook(bookId);

        // 将书籍对象存放到json
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("book", book);

        // 将json放到response对象
        SearchResponse resp = new SearchResponse();
        resp.setData(jsonObject);
        return resp;
    }

    @Cacheable(value = "test")
    public SearchResponse getResponse2(String bookId) {
        // 获取书籍对象,此对象实现了序列化
        Book book = getBook(bookId);

        // 将书籍对象放到response对象
        SearchResponse resp = new SearchResponse();
        resp.setBook(book);
        return resp;
    }

    private Book getBook(String bookId) {
        Book book = new Book();
        book.setBookId(bookId);
        book.setBookName("斗破苍穹");
        return book;
    }
}
