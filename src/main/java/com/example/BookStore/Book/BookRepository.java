package com.example.BookStore.Book;

import com.example.BookStore.Topic.Topic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface BookRepository extends CrudRepository<Book, String>{

}
