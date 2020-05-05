package com.example.BookStore.Book;

import com.example.BookStore.Author.Author;
import com.example.BookStore.Topic.Topic;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    private int pages;
    @ManyToOne
    private Author author;
    @ManyToOne
    private Topic topic;
    private String publisher;

    public Book() {
    }

    public Book(String id, String name, int pages, Author author, String publisher, Topic topic) {
        this.id = id;
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.publisher = publisher;
        this.topic = topic;
    }

    public Book(String id, String name, int pages, String publisher) {
        this.id = id;
        this.name = name;
        this.pages = pages;
        this.publisher = publisher;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book {" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", author=" + author +
                ", topic=" + topic +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
