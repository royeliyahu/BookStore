package com.example.BookStore.Topic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private static final Logger logger = LogManager.getLogger(TopicService.class);

    @Autowired
    private TopicRepository topicRepository;

//    private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
//            new Topic("Spring", "Spring Framework", "Spring Framework description"),
//            new Topic("Java", "Core Java", "Core Java Description"),
//            new Topic("Rock", "Rock & Roll", "Rock & Roll description")
//    ));

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<Topic>();
        topicRepository.findAll().forEach(topics::add);

        logger.error("getting all topics.");
        return topics;
    }

    public List<Topic> getAllActiveTopics(){
        List<Topic> topics = new ArrayList<Topic>();
//        topicRepository.findAllActiveTopics().forEach(topics::add);

        logger.error("getting all active topics.");
        return topics;
    }

    public Topic getTopic(String id){
//        return topics.stream().filter(s -> s.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic){
//        topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic){
//        for (int i = 0; i < topics.size(); i++) {
//            Topic t = topics.get(i);
//            if(t.getId().equals(id)){
//                topics.set(i, topic);
//                return;
//            }
//        }
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
//        topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }


}
