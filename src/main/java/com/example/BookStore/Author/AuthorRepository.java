package com.example.BookStore.Author;

import com.example.BookStore.Book.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.Collection;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

//    @Query("SELECT id, name FROM author WHERE id IN " +
//            "SELECT id FROM book GROUP BY author HAVING count(id) = :number")


//    @Query("SELECT t FROM Topic t WHERE t.description LIKE 'active' ")
//    Collection<Topic> getAuthorsWithBooksNum(int num);


//    @Query("SELECT a FROM Author a where a.id = :number ")
////            "JOIN author ON book.author_id = author.id")



//    SELECT a FROM Article a WHERE a.title=:title and a.category=:category")
//    List<Article> fetchArticles(@Param("title") String title, @Param("category") String category);




    @Query( "SELECT a FROM Author a WHERE a.id IN :ids")
    Collection<Author> getAuthorsWithBooksNum(ArrayList<Integer> ids);


    @Query("SELECT b FROM Book b ORDER BY b.author")
    Collection<Book> getBooks();

    @Query("SELECT AVG(u.id) from Author u")
    int getAverageAge();
}





