package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student std1 = new Student(1,"KIM");
		Student std2 = new Student(2,"LEE");
		
		std1.setKoreaSubject("국어",100);
		std1.setMathSubject("수학",100);
		
		std2.setKoreaSubject("국어",70);
		std2.setMathSubject("수학",80);
		
		std1.showScoreInfo();
		std2.showScoreInfo();
	}

}
