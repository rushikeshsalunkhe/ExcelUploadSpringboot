package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;


@Service
public class CourseServiceImpl implements CourseService{

	
	List<Courses> list;
	
	public CourseServiceImpl() {
		
		/*
		 * list = new ArrayList<>(); list.add(new Courses(1,"Java" ,
		 * "Java description")); list.add(new Courses(2,"Python" ,
		 * "python description"));
		 */
	}
	
	
	@Override
	public List<Courses> getCourses() {
		
		return list;
	}


	@Override
	public Courses getCourse(long coursesid) {
		Courses c = null;
		/*
		 * for(Courses course : list) { if(course.getId() == coursesid ){ c = course;
		 * break; } }
		 */
		
		
		return c;
	}


	@Override
	public Courses addCourse(Courses course) {
//		list.add(course);
		
		return course;
	}


	@Override
	public Courses updateCourse(Courses course) {
		/*
		 * list.forEach(e ->{ if(e.getId()==course.getId()) {
		 * e.setTitile(course.getTitile()); e.setDescription(course.getDescription()); }
		 * });
		 */
		return course;
	}


	@Override
	public Courses deleteCourse(long parseLong) {
	    Courses courseToDelete = this.list.stream().filter(e->e.getId()==parseLong).findFirst().orElse(null);
	    if (courseToDelete != null) {
	  //      list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	    }
	    return courseToDelete;
	}

	
	
	
	
	
	
	

}
