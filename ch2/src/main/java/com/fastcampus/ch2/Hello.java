package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//1. ���� ȣ�� ������ ���α׷����� ���
@Controller
public class Hello {
	//2. URL�� �޼��带 ����
	@RequestMapping("/hello")
	public static void main(String[] args) {
		
		System.out.println("Hello");

	}
	}