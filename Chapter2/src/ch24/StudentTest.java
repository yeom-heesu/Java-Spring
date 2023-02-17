package ch24;

public class StudentTest {

	public static void main(String[] args) {
		Student std1 = new Student("Lee",10001);
		Student std2 = new Student("Kim",10002);
		
		std1.addSubject("국어", 100);
		std1.addSubject("수학", 50);
		
		std2.addSubject("국어", 70);
		std2.addSubject("수학", 85);
		std2.addSubject("영어", 100);
		
		std1.studentInfo();
		System.out.println("================");
		std2.studentInfo();
		
	}

}
