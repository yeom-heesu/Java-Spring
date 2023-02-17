package ch24;
import java.util.*;

public class Student {
	int studentId;
	String studentName;
	ArrayList<Subject> subjectlist;
	
	public Student() {}
	public Student(String name,int studentId) {
		this.studentName = name;
		this.studentId = studentId;
	}
	public void addSubject(String name,int score) {
		if (subjectlist == null) {
			subjectlist = new ArrayList<Subject>();
		}
		Subject sub = new Subject(name,score);
		subjectlist.add(sub);
	}
	public void studentInfo() {
		
		int sum = 0;
//		for (int i =0;i<subjectlist.size();i++) {
		for (Subject subject : subjectlist) {
			String str = "학생" + studentName + "의";
			str += subject.getName() + " 과목 성적은";
			str += subject.getScore() + "점 입니다.";
			sum += subject.getScore();
			System.out.println(str);
		}
		System.out.println("학생" + studentName + "의 총점은 " + sum +"점 입니다.");
	}
}
