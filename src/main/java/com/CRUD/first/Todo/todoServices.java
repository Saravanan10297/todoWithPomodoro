package com.CRUD.first.Todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;


@Service
public class todoServices {

     private static List<todoEntity> todos =new ArrayList<>();
     private static int todosCount =0;
	
	static {
		todos.add(new todoEntity(++todosCount ,"in12horsMarathan","Learn Pomodoro",LocalDate.now().plusYears(1),false));
		todos.add(new todoEntity(++todosCount,"in12horsMarathan","Learn 12HourMarathan",LocalDate.now().plusYears(2),false));
		todos.add(new todoEntity(++todosCount,"in12horsMarathan","Learn springBoot",LocalDate.now().plusYears(3),false));
	}
	
	public List<todoEntity> findByUsername(String username){
	     return todos;
	}
	
	public void addTodo(String username,String description,LocalDate targetDate,Boolean Action){
		
	     todoEntity todo =new todoEntity(++todosCount,username,description,targetDate,Action);
	     todos.add(todo);
		
	}
	public void deleteById(int id) {
		Predicate<? super todoEntity> predicate  = todo->todo.getId() == id;
		todos.removeIf(predicate  = todo->todo.getId() == id);
		
	}


	public todoEntity findById(int id) {
		Predicate<? super todoEntity> predicate  = todo->todo.getId() == id;
		todoEntity todo =todos.stream().filter(predicate).findFirst().get();
	    return todo;
	}

	public void updtaeById(@Valid todoEntity todo2) {
		deleteById(todo2.getId());
		todos.add(todo2);
		
	}
}
