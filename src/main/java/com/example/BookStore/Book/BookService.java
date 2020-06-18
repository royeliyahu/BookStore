package com.example.BookStore.Book;

import com.example.BookStore.Topic.Topic;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Book> getBooksByTopic(String topic) {
        return bookRepository.findByTopicId(topic);
    }

    public List<Book> getBooksByAuthor(int author){
        return bookRepository.findByAuthorId(author);
    }

    public List<Book> getBooksByAuthor(String author){
        return bookRepository.findByAuthorName(author);
    }

    public List<Book> getBooksByAuthorAndPublishrt(Integer author, String publisher) {
        return bookRepository.findByAuthorIdAndPublisher(author, publisher);
    }

    public List<Book> getBooksByPublishrt(String publisher) {
        return bookRepository.findByPublisher(publisher);
    }

    public List<Book> getBooksByPages(Integer min, Integer max) {
        List<Book> books = new ArrayList<>();

        bookRepository.findAll().forEach(books::add);
        return books.stream().filter(book -> book.getPages() > min).filter(book -> book.getPages() < max).collect(Collectors.toList());


    }
}
