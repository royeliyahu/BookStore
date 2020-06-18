package com.example.BookStore.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/")
    public String root(){
        //log
        return "Hi there BookStore is online<br> please check help for commands";
    }

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        //log
        return topicService.getAllTopics();
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hi there!!";
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }

    @RequestMapping(value="/topics/active")
    public List<Topic> getActiveTopics(){
        return topicService.getAllActiveTopics();
    }
}
