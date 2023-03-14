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
    	// 1. �Է�
    	// ������ ���ʿ��� �ҽ� ����
        // 2. ó��
    	
    	//1) ��ȿ���˻�
//    	if (!isValid(year,month,day))
//    		return "yoilError";
//    	
    	//2) ���ϰ��
        char yoil = getYoil(year, month, day);
        
        //3) ����� ����� model�� ���� k-v�� ����
        mv.addObject("year",year);
        mv.addObject("month",month);
        mv.addObject("day",day);
        mv.addObject("yoil",yoil);
        
        mv.setViewName("yoil");
        return mv;
        // 3. ���
//        return "yoil";	//WEB-INF/views/yoil.jsp
        
      
    }

	private boolean isValid(int year, int month, int day) {
		
		return true;
	}

	private char getYoil(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        return " �Ͽ�ȭ�������".charAt(dayOfWeek);   // �Ͽ���:1, ������:2, ... 
	}
}