//package com.example.BookStore;
//
//import com.example.BookStore.Topic.Topic;
//import com.example.BookStore.Topic.TopicService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.web.reactive.function.client.WebClient;
//import org.springframework.web.reactive.function.client.WebClientResponseException;
//import reactor.core.publisher.Mono;
//
//import java.io.IOException;
//import java.util.*;
//
//@SpringBootTest
//class TopicTests {
//	@Autowired
//	TopicService topicService;
//	@Autowired
//	WebClient.Builder webClientBuilder;
//
//	@Test
//	void testGetAllTopics() throws IOException {
//		Object[] data;
//		List<Object> topics = new ArrayList<>();
//
//		data = webClientBuilder.build()
//						.get()//use get method (post, update...)
//						.uri("http://localhost:8080/topics/")
//						.retrieve()//get the data
//						.bodyToMono(List.class)//its an async call
//						.block().stream().toArray();
//
//		Arrays.asList(data).stream().forEach(topics::add);
//
//
////		assert   topicService.getAllTopics().size() == 5;
////		assert   topics.size() == 6;
//	}
//
//	@Test
//	void testGetATopic() {
//		Object data = webClientBuilder.build()
//				.get()//use get method (post, update...)
//				.uri("http://localhost:8080/topics/Java")
//				.retrieve()//get the data
//				.bodyToMono(Object.class)
//				.block();
//
//		assert "Java".equals(((Map)data).get("id"));
//	}
//
//	@Test
//	void testAddTopics() {
//		System.err.println("roy");
//		try{
//			topicService.getTopic("roy");
//			assert false;
//		}
//		catch (NoSuchElementException e){
//			assert e.getMessage().equals("No value present");
//		}
//		catch (Exception e){
//			assert false;
//		}
//		Topic topic = new Topic("roy","roy topic","just did it");
//
//		webClientBuilder.build()
//				.post()
//				.uri("http://localhost:8080/topics")
//				.contentType(MediaType.APPLICATION_JSON)
//				.body(Mono.just(topic), Topic.class)
//				.retrieve()
//				.bodyToMono(Topic.class)
//				.block();
//
//		topic.setId("got it");
//
//		webClientBuilder.build().post().uri("http://localhost:8080/topics")
//				.contentType(MediaType.APPLICATION_JSON)
//				.accept(MediaType.APPLICATION_JSON)
//				.body(Mono.just(topic), Topic.class)
//				.exchange()
//				.block();
//
//		Object[] data1;
//
//		data1 = webClientBuilder.build()
//				.get()//use get method (post, update...)
//				.uri("http://localhost:8080/topics/")
//				.retrieve()//get the data
//				.bodyToMono(List.class)//its an async call
//				.block().stream().toArray();
//
////		assert topicService.getTopic("roy") != null;
//
//		Object data = webClientBuilder.build()
//				.get()//use get method (post, update...)
//				.uri("http://localhost:8080/topics/roy")
//				.retrieve()//get the data
//				.bodyToMono(Object.class)
//				.block();
//
//		assert "roy".equals(((Map)data).get("id"));
//	}
//
//	@Test
//	void testAlterTopic() {
//
//		Object data = webClientBuilder.build()
//				.get()//use get method (post, update...)
//				.uri("http://localhost:8080/topics/Java")
//				.retrieve()//get the data
//				.bodyToMono(Object.class)//its an async call
//				.block();
//
//		assert "Core Java Description".equals(((Map)data).get("description"));
//
//		Topic topic = new Topic("Java","Core Java","Core Java Description altered");
//		webClientBuilder.build().put().uri("http://localhost:8080/topics/Java")
//				.contentType(MediaType.APPLICATION_JSON)
//				.accept(MediaType.APPLICATION_JSON)
//				.body(Mono.just(topic), Topic.class)
//				.exchange()
//				.block();
//
//		data = webClientBuilder.build()
//				.get()//use get method (post, update...)
//				.uri("http://localhost:8080/topics/Java")
//				.retrieve()//get the data
//				.bodyToMono(Object.class)//its an async call
//				.block();
//
//		assert "Core Java Description altered".equals(((Map)data).get("description"));
//
////		topicService.updateTopic("Java", new Topic("Java","Core Java updated", "Core Java Description updated"));
////		assert topicService.getTopic("Java").getName().equals("Core Java updated");
//	}
//
//	@Test
//	void testDeleteTopic() {
//		Object data = webClientBuilder.build()
//				.get()//use get method (post, update...)
//				.uri("http://localhost:8080/topics/lolo")
//				.retrieve()//get the data
//				.bodyToMono(Object.class)//its an async call
//				.block();
//
//		assert "lolo".equals(((Map)data).get("id"));
//
//		webClientBuilder.build().delete().uri("http://localhost:8080/topics/lolo")
//				.accept(MediaType.APPLICATION_JSON)
//				.retrieve()
//				.bodyToMono(Object.class).block();
//
//		try{
//			data = webClientBuilder.build()
//				.get()//use get method (post, update...)
//				.uri("http://localhost:8080/topics/lolo")
//				.retrieve()//get the data
//				.bodyToMono(Object.class)//its an async call
//				.block();
//
//		}
//		catch (WebClientResponseException e){
//			assert e.getMessage().equals("500 Internal Server Error from GET http://localhost:8080/topics/lolo");
//		}
//		catch (Exception e){
//			assert false;
//		}
//
//
//
//
////		assert topicService.getTopic("Java") != null;
////		topicService.deleteTopic("Java");
////		try{
////			topicService.getTopic("Java");
////		}
////		catch (NoSuchElementException e){
////			assert e.getMessage().equals("No value present");
////		}
////		catch (Exception e){
////			assert false;
////		}
//	}
//}
//
//
