package com.chestermabuela.swagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chestermabuela.swagger.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
