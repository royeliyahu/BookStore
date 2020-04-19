package com.example.BookStore;

import com.example.BookStore.Topic.TopicService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookStoreApplicationTests {
	@Autowired
	TopicService topicService;

	@Test
	void contextLoads() {
		System.err.println("rrrr" + topicService.getAllTopics());
		System.err.println("rrraaaar" + topicService.getTopic("Java"));

		assert   topicService.getTopic("Java")!= null;
	}

}


