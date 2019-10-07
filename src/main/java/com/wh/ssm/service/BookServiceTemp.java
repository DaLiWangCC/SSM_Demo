package com.wh.ssm.service;

import com.wh.ssm.dao.IBookDao;
import com.wh.ssm.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;

/**
 * Created by rememberthelesson on 2019/10/2.
 */

@Service
public class BookServiceTemp implements BookService{
    // 使用Dao中的接口
    @Autowired
    private IBookDao bookDao;

    // 实现接口
    public List<Book> listAll() {
        return bookDao.listAll();
    }
}
