package com.example.demo.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicReopsitory;


	public List<Topic> getAllTopics(){
		//return topics ;
		List<Topic> topics = new ArrayList<>();
		topicReopsitory.findAll().forEach(topics::add);
		return topics;
		
	}
	
	public Optional<Topic> getTopic(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicReopsitory.findById(id);
	}

	public void addTopic(Topic topic) {
			//topics.add(topic);
		topicReopsitory.save(topic);
		}

	public void updateTopic(Topic topic, String id) {
		topicReopsitory.save(topic);
		/*
		for (int i = 0 ; i < topics.size() ; i++)  {
			Topics t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i, topic);
				 return;
				 */
		
		
	}

	public void deleteTopic(String id) {
		
		topicReopsitory.deleteById(id);
		
			//	topics.removeIf(t -> t.getId().equals(id));
	
			}
			
			}

 