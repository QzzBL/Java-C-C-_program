package com.qzz.service;

import com.qzz.dao.BookMapper;
import com.qzz.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BookServiceImpl")
public class BookServiceImpl  implements BookService{
    @Autowired
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper){
        this.bookMapper = bookMapper;
    }

    //增加一本书
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    //删除一本书
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    //更新一本书
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    //查询一本书
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    //查询全部书
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    //通过书名查书
    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }

}
