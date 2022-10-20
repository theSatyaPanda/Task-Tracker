package com.me.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.me.app.dto.Task;
import com.me.app.service.TaskService;

@RestController
@CrossOrigin("*") // * = for all  
public class TaskController {
	
	@Autowired  // Automatically find the taskService  in the TaskService. 
	private TaskService  taskService;
	
	@RequestMapping("/list")
	public List<Task> listTasks() {  // List type Task so the type  is declare in Task class. 
		
		List<Task> tasks = taskService.listTasks() ;
		
		return tasks;
	}
	
	@RequestMapping(path="/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)	
	public void saveTask(@RequestBody Task task) {
		System.out.println(task);
		taskService.saveTask(task);
	}

}
