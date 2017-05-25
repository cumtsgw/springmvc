package com.nickel.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nickel.model.Person;

@Controller
@RequestMapping("/mvc")
public class MVController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/person")
	public String toPerson(Person person, HttpServletRequest req) {
		req.getParameter("person.name");
		System.out.println(person.getName() + "," + person.getAge());
		return "hello";
	}
}
