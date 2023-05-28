package tk.syf.author.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.syf.author.dto.BookDTO;
import tk.syf.author.feign.BookFeign;
import tk.syf.author.model.Author;

@RestController
@RequestMapping("author")
public class AuthorController {

    @Autowired
    private BookFeign bookFeign;
    
    @GetMapping("getOne")
    public Author getOne(){
        Author author = new Author();
        return author;
    }
    
    @GetMapping("getBook")
    public BookDTO getBook(){
        return bookFeign.getOne();
    }
}
