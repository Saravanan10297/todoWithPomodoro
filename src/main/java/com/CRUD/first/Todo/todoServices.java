package com.CRUD.first.Todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class todoServices {

     private static List<todoEntity> todos =new ArrayList<>();
	
	static {
		todos.add(new todoEntity(1,"in12horsMarathan","Learn Pomodoro",LocalDate.now().plusYears(1),false));
		todos.add(new todoEntity(2,"in12horsMarathan","Learn 12HourMarathan",LocalDate.now().plusYears(2),false));
		todos.add(new todoEntity(3,"in12horsMarathan","Learn springBoot",LocalDate.now().plusYears(3),false));
	}
	
	public List<todoEntity> findByUsername(String username){
	     return todos;
	}
}
