package ch02;

public class Student {
	public String std_name;
	public int std_Id;
	public String address;

	public void showStudentInfo() {
		System.out.println(std_Id + "학번 학생의 이름은 " + std_name + "이고, 주소는 " + address + "입니다.");
	}
	//getter, setter 메소드
	public String getstdName() {
		return std_name;
	}

	public String getAddress() {
		return address;
	}

	public int getstdId() {
		return std_Id;
	}

	public void setstdName(String name) {
		std_name = name;
	}

	public void setAddress(String addr) {
		address = addr;
	}

	public void setstdId(int id) {
		std_Id = id;
	}
	
}
