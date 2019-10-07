package com.wh.ssm.dao;

import com.wh.ssm.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rememberthelesson on 2019/10/2.
 */

@Repository
public interface IBookDao {
    List<Book> listAll();
}
