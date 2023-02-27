package com.fastcampus.ch2;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestHeader {
	@RequestMapping("/requestHeader")
	public void main(HttpServletRequest request) {
		
		Enumeration<String> e = request.getHeaderNames();

		while (e.hasMoreElements()) {
			String name = e.nextElement();
			System.out.println(name + ":" + request.getHeader(name));
		}
	}
}

//실행 결과
host:localhost:8080
connection:keep-alive
content-length:0
sec-ch-ua:"Chromium";v="110", "Not A(Brand";v="24", "Google Chrome";v="110"
cache-control:no-cache
sec-ch-ua-mobile:?0
user-agent:Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36
sec-ch-ua-platform:"Windows"
accept:*/*
origin:chrome-extension://coohjcphdfgbiolnekdpbcijmhambjff
sec-fetch-site:none
sec-fetch-mode:cors
sec-fetch-dest:empty
accept-encoding:gzip, deflate, br
accept-language:ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7
