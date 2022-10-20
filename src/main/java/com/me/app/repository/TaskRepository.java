package com.me.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.me.app.dto.Task;

@Repository
public interface TaskRepository  extends  JpaRepository<Task, Integer> {  //This .java  is created by interface 
	//We can't  create  objects for interface
	
	
}
