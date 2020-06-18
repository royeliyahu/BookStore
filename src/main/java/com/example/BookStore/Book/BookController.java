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

    @RequestMapping("/books/topic/{topic}")
    public List<Book> getBooksByTopic(@PathVariable String topic){
        return bookService.getBooksByTopic(topic);
    }

    @RequestMapping("books/publisher/{publisher}")
    public List<Book> getBooksByAuthorAndPublisher(@PathVariable String publisher){
        return bookService.getBooksByPublishrt(publisher);
    }

    @RequestMapping("books/authorId/{author}")
    public List<Book> getBooksByAuthorId(@PathVariable Integer author){
        return bookService.getBooksByAuthor(author);
    }

    @RequestMapping("books/authorName/{author}")
    public List<Book> getBooksByAuthorName(@PathVariable String author){
        return bookService.getBooksByAuthor(author);
    }

    @RequestMapping("books/author/{author}/publisher/{publisher}")
    public List<Book> getBooksByAuthorAndPublisher(@PathVariable Integer author, @PathVariable String publisher){
        return bookService.getBooksByAuthorAndPublishrt(author, publisher);
    }

    @RequestMapping("books/pages/{min}/{max}")
    public List<Book> getBooksByPages(@PathVariable Integer min, @PathVariable Integer max){
        return bookService.getBooksByPages(min, max);
    }

}
