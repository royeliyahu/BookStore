package com.example.BookStore.Topic;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface TopicRepository extends CrudRepository<Topic, String>{

    @Query("SELECT t FROM Topic t WHERE t.description LIKE 'active' ")
    Collection<Topic> findAllActiveTopics();
}
