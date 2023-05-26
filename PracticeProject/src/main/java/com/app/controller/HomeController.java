package com.app.controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class HomeController {
	public HomeController() {
		System.out.println("in ctor of " + getClass());
	}
	@PostConstruct
	public void anyInit()
	{
		System.out.println("in init of " + getClass());
	}
	@PreDestroy
	public void anyDestroy()
	{
		System.out.println("in destroy of " + getClass());
	}
	//add req handling method : to display a welcome mesg
	@RequestMapping("/hello")
	//SC will auto create n populate HandlerMapping bean (spring managed) : singleton n eager
	//Map : key : /hello (value of the @ReqMapping)
	//Value : F.Q handler className.methodName (com.app.controller.HomeController.sayHello1)
	public String sayHello1()
	{
		System.out.println("in say hello 1");
		return "/welcome";//logical view name(forward view name)
		//Handler rets a logical view name to D.S
		//Logical View Name : /welcome
		//Actual view /WEB-INF/views/welcome.jsp
	}
	
}
