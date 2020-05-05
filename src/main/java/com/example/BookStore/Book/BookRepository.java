package com.example.BookStore.Book;

import com.example.BookStore.Topic.Topic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface BookRepository extends CrudRepository<Book, String>{

    public List<Book> findByTopicId(String  topic);

    public List<Book> findByAuthorId(int author);

    public List<Book> findByAuthorName(String author);

    public List<Book> findByAuthorIdAndPublisher(int author, String publisher);

    public List<Book> findByPublisher(String publisher);

}
