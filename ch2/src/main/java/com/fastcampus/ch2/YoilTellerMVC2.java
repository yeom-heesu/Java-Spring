package com.fastcampus.ch2;

import java.io.IOException;
import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class YoilTellerMVC2 {
	@ExceptionHandler(Exception.class)
	public String catcher(Exception ex) {
		ex.printStackTrace();
		return "yoilError";
	}
    @RequestMapping("/getYoilMVC2") // http://localhost:8080/ch2/getYoil?year=2021&month=10&day=1
    public ModelAndView main(int year,
    		@RequestParam(required=true) int month,
    		@RequestParam(required=true) int day) throws IOException {
        
    	ModelAndView mv = new ModelAndView();
    	// 1. 입력
    	// 기존의 불필요한 소스 제거
        // 2. 처리
    	
    	//1) 유효성검사
//    	if (!isValid(year,month,day))
//    		return "yoilError";
//    	
    	//2) 요일계산
        char yoil = getYoil(year, month, day);
        
        //3) 계산한 결과를 model에 저장 k-v값 저장
        mv.addObject("year",year);
        mv.addObject("month",month);
        mv.addObject("day",day);
        mv.addObject("yoil",yoil);
        
        mv.setViewName("yoil");
        return mv;
        // 3. 출력
//        return "yoil";	//WEB-INF/views/yoil.jsp
        
      
    }

	private boolean isValid(int year, int month, int day) {
		
		return true;
	}

	private char getYoil(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        return " 일월화수목금토".charAt(dayOfWeek);   // 일요일:1, 월요일:2, ... 
	}
}