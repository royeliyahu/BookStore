package com.example.BookStore.Author;

import com.example.BookStore.Topic.Topic;
import com.example.BookStore.Topic.TopicService;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(AuthorService.class);
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors(){
        logger.error("getting all Authors ");
        List<Author> authors = new ArrayList<Author>();
        authorRepository.findAll().forEach(authors::add);
        return authors;
    }

    public Author getAuthorById(int id){
        return authorRepository.findById(id).get();
    }

//    public List<Author> getAuthorsWithBooksNum(int number){
//        return authorRepository.getAuthorsWithBooksNum(number);
//    }
}
