package com.fastcampus.ch2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello11")
public class HelloServlet extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		// 서블릿이 초기화 될때 자동으로 호출되는 메소드
		//1. 서블릿의 초기화작업 담당
		System.out.println("[HelloServlet] init()");
		
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1.입력
		// 2.처리
		// 3.출력
		System.out.println("[HelloServlet] service()");
	}

	@Override
	public void destroy() {
		// 서블릿 메모리 unload
		System.out.println("[HelloServlet] destroy() 1");
	}

	
}
