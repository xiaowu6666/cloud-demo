package tk.syf.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.syf.book.dto.AuthorDTO;
import tk.syf.book.feign.AuthorFeign;
import tk.syf.book.model.Book;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private AuthorFeign authorFeign;

    @GetMapping("getOne")
    public Book getOne(){
        Book book = new Book();
        return book;
    }
    
    @GetMapping("getAuthor")
    public AuthorDTO getAuthor(){
        return authorFeign.getOne();
    }
}
