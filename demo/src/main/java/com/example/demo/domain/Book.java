package com.example.demo.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: lsy
 * @create: 2022-07-09 09:48
 **/
@Data
public class Book implements Serializable {
    private static final long serialVersionUID = 4214809951516203302L;

    private String bookId;

    private String bookName;
}
