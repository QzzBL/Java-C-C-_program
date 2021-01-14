package com.qzz.controller;

import com.qzz.pojo.Books;
import com.qzz.service.BookService;
import com.sun.org.apache.xerces.internal.xs.StringList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired //自动注入bean
    private BookService bookService;//必须引入BookService，因为  controller层调service层
    //查询全部书籍，并且返回到一个书籍展示页面


    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();//调service层，service层再调dao层，取到数据后返回给list
        model.addAttribute("list",list);//给前端传递数据
        return "allBook";//返回到allBook页面
    }


    //点击新增书籍时到这里，然后跳转到addbook.jsp页面
    @RequestMapping("/toAddBook")
    public String toAddpaper()
    {
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books)
    {
        System.out.println("addBook=>"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook"; //重定向到@RequestMapping("/allBook")
    }

    @RequestMapping("/toUpdateBook") //拿到相应书的信息
    public String toUpdateBook(Model model, int id) {
        Books books = bookService.queryBookById(id);
        //System.out.println(books);
        model.addAttribute("book",books );
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Books book,Model model)
    {
        System.out.println("updateBook=>"+book);
        bookService.updateBook(book);
        Books books = bookService.queryBookById(book.getBookID());
        model.addAttribute("books", books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/deleteBook")
    public String deleteBook(int id)
    {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";

    }

    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model)
    {
        Books books=bookService.queryBookByName(queryBookName);
        System.out.println("queryBookName=>"+books);
        List<Books> list=new ArrayList<Books>();
        list.add(books);
        if (books == null) {
            list=bookService.queryAllBook();//如果没查到就返回全部书籍
            model.addAttribute("error","未查到信息");

        }
        model.addAttribute("list",list);
        return "allBook";
    }
}
