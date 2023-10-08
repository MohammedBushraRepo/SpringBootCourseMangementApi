package com.example.demo.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface  CourseRepository extends CrudRepository <Courses , String>{

    public List<Courses> findTopicId(String topicId);
	
}
