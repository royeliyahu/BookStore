package com.example.BookStore.Book;

import com.example.BookStore.Topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @RequestMapping("/books/{id}")
    public Book getBook(@PathVariable String id){
        return bookService.getBook(id);
    }
}
