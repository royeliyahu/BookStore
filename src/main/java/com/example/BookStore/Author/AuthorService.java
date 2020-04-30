package com.example.BookStore.Author;

import com.example.BookStore.Book.Book;
import org.apache.logging.log4j.LogManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

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

    public List<Author> getAuthorsWithBooksNum(int number){
        List<Author> authors = new ArrayList<Author>();
//        authorRepository.getAuthorsWithBooksNum((ArrayList<Integer>) getAuthorIdsWithBooksNum(number)).forEach(authors::add);

//        Map<String, Long> counts =
//                list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
//

        ArrayList<Book> books = (ArrayList<Book>) authorRepository.getBooks();
        Map<Object, Long> booksPerAuthor = new HashMap<Object, Long>();

//        booksPerAuthor = books.stream().collect(Collectors.groupingBy(book -> book.getAuthor().getId(), Collectors.counting()));
        //collect authors with book count to map

        ArrayList<Integer> as;

        as = (ArrayList<Integer>) books.stream().collect(Collectors.groupingBy(book -> book.getAuthor().getId(), Collectors.counting()))
                //collect authors with book count to map
        .entrySet().stream().filter(map -> map.getValue() == number).collect(Collectors.toList())
                //get entry set of author ids with book count
        .stream().map( Map.Entry::getKey).collect(Collectors.toList());
        //get only the ids

//        List<Map.Entry<Object, Long>> w = booksPerAuthor.entrySet().stream().filter(map -> map.getValue() == number).collect(Collectors.toList());
//                .stream().forEach(objectLongEntry -> System.err.println(objectLongEntry.getKey()));
        //get entry set of author ids with book count

        System.err.println("g");

//        as = w.stream().map( Map.Entry::getKey).collect(Collectors.toList());
        //get only the ids

        if(as.isEmpty()){
            return authors;
        }
        authorRepository.getAuthorsWithBooksNum(as).forEach(authors::add);
        return authors;
    }

    public List<Integer> getAuthorIdsWithBooksNum(int number){
        ArrayList<Integer>  autorIds = new ArrayList<Integer>();
        authorRepository.getBooks();//.forEach(book -> autorIds.add(book.getAuthor().getId()));
        authorRepository.getBooks().forEach(book -> autorIds.add(book.getAuthor().getId()));
        authorRepository.getAverageAge();

        return autorIds;
    }
}
