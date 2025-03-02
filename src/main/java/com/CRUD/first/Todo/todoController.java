package com.CRUD.first.Todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class todoController {
	
	private todoServices todoService;
	
   public todoController(todoServices todoService) {
		super();
		this.todoService = todoService;
	}

@RequestMapping("list-todos")
   public String listAllTodos(ModelMap model) {
	   List<todoEntity> todos =todoService.findByUsername("in12horsMarathan");
	   model.addAttribute("todos",todos);
	   return "listTodos";
   }
}
