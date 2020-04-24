package com.example.BookStore.Author;

import com.example.BookStore.Book.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

//    @Query("SELECT id, name FROM author WHERE id IN " +
//            "(SELECT id FROM book GROUP BY author HAVING count(id) = :number)")
//    List<Author> getAuthorsWithBooksNum(int number);
}
