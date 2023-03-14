package com.fastcampus.ch2;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class YoilTellerMVC4 {
	@ExceptionHandler(Exception.class)
	public String catcher(Exception ex) {
		ex.printStackTrace();
		return "yoilError";
	}
    @RequestMapping("/getYoilMVC4") // http://localhost:8080/ch2/getYoil?year=2021&month=10&day=1
    public String main(MyDate date, Model model) {
       
    	// 1. �Է�
    	// ������ ���ʿ��� �ҽ� ����
        // 2. ó��
    	
    	//1) ��ȿ���˻�
//    	if (!isValid(date))
//    		return "yoilError";
////    	
    	//2) ���ϰ��
        char yoil = getYoil(date);
        
        //3) ����� ����� model�� ���� k-v�� ����
        model.addAttribute("myDate",date);
        model.addAttribute("yoil",yoil);
        
        return "yoil";
        // 3. ���
//        return "yoil";	//WEB-INF/views/yoil.jsp
        
      
    }

	private char getYoil(MyDate date) {
		// TODO Auto-generated method stub
		return getYoil(date.getYear(), date.getMonth(), date.getDay());
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