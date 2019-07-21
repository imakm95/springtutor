package com.ashwani.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ashwani.bean.Employee;
import com.ashwani.service.ServiceImpl;

@Controller
public class MyController{
 
   @RequestMapping(value = "/details", method = RequestMethod.GET)
   public String printHello(ModelMap model) {
	   List<Employee> empList;
	   ServiceImpl s = new  ServiceImpl();
	   empList = s.getEmployeeList();
      model.addAttribute("empList", empList);
      return "index";
   }
   
   @RequestMapping("/login")
   public String login() {
      return "login";
   }

}