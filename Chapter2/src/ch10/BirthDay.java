package ch10;

public class BirthDay {
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		if (month >=1 && month <= 12) {
			this.month = month;
			isValid = true;
		}else {
			isValid = false;
		}
		
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if (isValid)
			System.out.println(year+"년 "+month + "월"+ day+"일");
		else
			System.out.println("존재하지 않는 년월일 입니다.");
	}
}
