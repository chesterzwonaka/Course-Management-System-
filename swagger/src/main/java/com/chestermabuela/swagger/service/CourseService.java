package com.chestermabuela.swagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chestermabuela.swagger.dao.CourseRepository;
import com.chestermabuela.swagger.model.Course;

@Service
public class CourseService {
    
    @Autowired
    private CourseRepository repository;
    
    public String saveCourse(Course course) {
        repository.save(course);
        return "Course saved successfully with id: " + course.getCourseId();
    }
    
    public List<Course> getAllCourses() {
        return repository.findAll();
    }
    
    public List<Course> deleteCourseById(int courseId) {
        repository.deleteById(courseId);
        return repository.findAll();
    }
}
