package ch11;

public class Student {
	String std_name;
	int std_money;
	
	
	public Student() {}
	public Student(String std_name,int money) {
		this.std_name = std_name;
		this.std_money = money;
	}
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.std_money -= 1000;
	}
	public void takeSubway(Subway sub) {
		sub.take(1200);
		this.std_money -= 1200;
	}
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.std_money = 10000;
	}
	public void stdInfo() {
		System.out.println(std_name+"님의 남은돈은 " + std_money+"원 입니다.");
	}
	
}
