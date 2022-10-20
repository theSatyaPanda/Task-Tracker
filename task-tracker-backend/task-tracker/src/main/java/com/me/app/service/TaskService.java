package com.me.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.app.dto.Task;
import com.me.app.repository.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository  taskRepository;

	public List<Task> listTasks() {
		
		return taskRepository.findAll(); //find all database in the taskRepository.  
		
	}

	public void saveTask(Task task) {
		//validate data is valid or not
		//if valid save
					
		taskRepository.save(task);
	}
	
	

}
