package com.example.BookStore.Author;

import com.example.BookStore.Book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @RequestMapping("/authors")
    public List<Author> getAllAuthors(){
        return authorService.getAllAuthors();
    }

    @RequestMapping("/authors/{id}")
    public Author getAuthorById(@PathVariable int id){
        return authorService.getAuthorById(id);
    }

    @RequestMapping("/authors/books/{count}")
    public List<Author> getAuthorsWithBookCount(@PathVariable int count){
        return authorService.getAuthorsWithBooksNum(count);
    }

//    @RequestMapping("/authors/books/num/{count}")
//    public List<Book> getBooksNum(@PathVariable int count){
//        return authorService.getBooksNum(count);
//    }

}
