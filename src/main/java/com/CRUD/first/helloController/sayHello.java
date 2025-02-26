package com.CRUD.first.helloController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sayHello {

	
	    @RequestMapping("hello")
	    @ResponseBody
		public String sayhello() {
			return "Hello World";
		}
	    @RequestMapping("helloHTML")
	    @ResponseBody
	    public String helloInHTML() {
	       StringBuffer sb = new StringBuffer();
	       sb.append("<HTML>");
	       sb.append("<HEAD>");
	       sb.append("<title> this HTML Hello page </title>");
	       sb.append("</HEAD>");
	       sb.append("<h4>My First Html Page</h4>");
	       sb.append("<body>");
	       sb.append("</body>");
	       sb.append("</HTML>");
	       return sb.toString();
	   }
	    
	   @RequestMapping("hellojsp")
	   public String hellojsp(){
		   return "Hello";
	   }

	

}
