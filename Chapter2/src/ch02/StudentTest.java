package ch02;

public class StudentTest {

	public static void main(String[] args) {
		//메인
		Student std1 = new Student();
		Student std2 = new Student();
		
		std1.setAddress("서울시");
		std1.setstdId(1);
		std1.setstdName("김개똥");
		
		std2.setAddress("인천");
		std2.setstdId(2);
		std2.setstdName("박영희");
		
		std1.showStudentInfo();
		std2.showStudentInfo();
	}

}
