package com.wh.ssm.service;

import com.wh.ssm.dao.IBookDao;
import com.wh.ssm.entity.Book;

import java.util.List;

/**
 * Created by rememberthelesson on 2019/10/2.
 */
public interface BookService {
    // 定义接口
    List<Book> listAll();

}
