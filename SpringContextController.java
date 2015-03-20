package com.net.javabb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class SpringContextController {
	@Autowired
	private UserDetails userDetails;
	@RequestMapping(value="/userdetail",
			method=RequestMethod.GET)
			
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public UserDetails getUser(){

		UserDetails userDetails = new UserDetails(); 
		userDetails.setUserName("Ahmed"); 
		userDetails.setEmailId("ahmed123@gmail.com"); 
    return userDetails; 

	}
	
	@RequestMapping(value="/angular",method=RequestMethod.GET)
	public String getAngular(Model model){
		model.addAttribute("data", "Hello angular");
		return "angular";
	}
	
}
