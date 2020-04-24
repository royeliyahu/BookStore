package com.example.BookStore;

import com.example.BookStore.Author.Author;
import com.example.BookStore.Author.AuthorService;
import com.example.BookStore.Book.Book;
import com.example.BookStore.Topic.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

}
