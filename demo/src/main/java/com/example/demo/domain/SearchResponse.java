package com.example.demo.domain;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: lsy
 * @create: 2022-07-09 09:46
 **/

@Data
public class SearchResponse implements Serializable {
    private static final long serialVersionUID = 8731897259639250742L;

    private int ret = 1;

    private JSONObject data;

    private Book book;
}
