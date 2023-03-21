package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegusterController {
	@RequestMapping("/regsiter/add")
	public String register() {
		return "registerForm";
	}
	
	@RequestMapping("/regsiter/save")
	public String save() {
		return "registerInfo";
	}
}
