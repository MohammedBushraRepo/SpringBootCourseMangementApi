package com.example.demo.courses;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository CourseReopsitory;


	public List<Courses> getAllCourses(String topicId){
		//return topics ;
		List<Courses> courses = new ArrayList<>();
		CourseReopsitory.findTopicId(topicId).forEach(courses::add);
		//CourseReopsitory.findAll().forEach(courses::add);
		return courses;
		
	}
	
	public Optional<Courses> getCourse(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return CourseReopsitory.findById(id);
	}

	public void addCourse(Courses cource) {
			//topics.add(topic);
		CourseReopsitory.save(cource);
		}

	public void updateCourse(Courses course) {
		CourseReopsitory.save(course);
		
		
	}

	public void deleteCourse(String id) {
		
		CourseReopsitory.deleteById(id);
		
			//	topics.removeIf(t -> t.getId().equals(id));
	
			}
			
			}

 