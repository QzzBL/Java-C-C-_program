package com.qzz.service;

import com.qzz.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //增加一本书
    int addBook(Books books);

    //删除一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int id);  //为什么类型用Books

    //查询全部书
    List<Books> queryAllBook();

    //通过书名查书
    Books queryBookByName(String bookName);

}
