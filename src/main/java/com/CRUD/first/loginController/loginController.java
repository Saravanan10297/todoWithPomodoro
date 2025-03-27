package com.CRUD.first.loginController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.CRUD.first.Service.AuthenticationService;

@Controller
public class loginController {
	
//	private AuthenticationService authenticate;
//	
//	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String loginPage(ModelMap model) {
		
		//logger.debug("Request param is {}", name);
		//logger.info("info level");
		model.put("UName","saro");
		return "welcomePage";
	}
	
	
	
	

//	@RequestMapping(value="login",method = RequestMethod.POST)
//	public String WecomePage(@RequestParam String UName,@RequestParam String Pass ,ModelMap model) {
//		model.put("UName", UName);
//		
//		//logger.debug("Request param is {}", name);
//		//logger.info("info level");
//		if (authenticate.authenticate(UName,Pass)) {
//			return "welcomePage";
//		}
//		model.put("error","invailed login");
//		return "loginjsp";
//		
//	}
//
//
//	public loginController(AuthenticationService authenticate) {
//		super();
//		this.authenticate = authenticate;
//	}




}
