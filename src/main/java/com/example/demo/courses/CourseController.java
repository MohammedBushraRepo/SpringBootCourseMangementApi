package com.example.demo.courses;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.topics.Topic;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping ("/topics/{id}/courses")
	public List<Courses> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping("/topics/{topicid}/course/{id}")
	public Optional<Courses> getCourse(@PathVariable String id ) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method =RequestMethod.POST , value = "/topics/{topicid}/course")
	public void addCourse(@RequestBody Courses course  , @PathVariable String topicId) {
		course.setTopic(new Topic(topicId , "" , ""));
		courseService.addCourse(course);
	}
	@RequestMapping(method =RequestMethod.PUT , value = "/topics/{topicid}/course/{id}")
	public void updateCourse(@RequestBody Courses course , @PathVariable String  id , @PathVariable String topicId) {
		course.setTopic(new Topic(topicId , "" , ""));
		courseService.updateCourse(course);
	}
	@RequestMapping(method = RequestMethod.DELETE , value="/topics/{topicid}/course/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
}
