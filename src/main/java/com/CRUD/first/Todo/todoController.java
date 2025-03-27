package com.CRUD.first.Todo;

import java.time.LocalDate;
import java.util.List;

import javax.sql.rowset.Predicate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;

@Controller
public class todoController<todos> {
	
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
@RequestMapping( value="add-todo",method = RequestMethod.GET)
   public String showTodos(ModelMap model) {
	   String username =(String)model.get("name");
	   todoEntity todo =new todoEntity(0,username,"",LocalDate.now().plusYears(1),false);
       model.addAttribute("todo",todo);
	   return "AddPage";
}

@RequestMapping( value="add-todo", method =RequestMethod.POST)
   public String addTodos (ModelMap model, @Valid  @ModelAttribute("todo") todoEntity todo, BindingResult result) {
	if(result.hasErrors()) {
		return "AddPage";
	}
	
	    todoService.addTodo((String)model.get("name"),todo.getDescription(), todo.getTargeDate(), true);
	     return "redirect:list-todos";
    }
@RequestMapping("delete-todo")
public String deleteTodos(@RequestParam int id) {
	   todoService.deleteById(id);
	   return "redirect:list-todos";
}

@RequestMapping(value="Update-todo" ,method=RequestMethod.GET)
public String showUpdateTodos(@RequestParam int id,ModelMap model) {
	   todoEntity todo =todoService.findById(id);
	   model.addAttribute("todo",todo);
	   return "AddPage";
}
 
@RequestMapping( value="Update-todo", method =RequestMethod.POST)
public String updateTodos (ModelMap model, @Valid  @ModelAttribute("todo") todoEntity todo, BindingResult result) {
	if(result.hasErrors()) {
		return "AddPage";
	}
	    String username = (String)model.get("name");
	    todo.setUsername(username);
	    todoService.updtaeById(todo);
	     return "redirect:list-todos";
 }
}





