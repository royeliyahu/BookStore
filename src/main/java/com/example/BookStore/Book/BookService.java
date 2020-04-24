package com.example.BookStore.Book;

import com.example.BookStore.Topic.Topic;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private static final Logger logger = LogManager.getLogger(BookService.class);

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        List<Book> books = new ArrayList<Book>();
        bookRepository.findAll().forEach(books::add);

        logger.error("getting all books.");
        return books;
    }

    public Book getBook(String id){
        return bookRepository.findById(id).get();
    }

}
