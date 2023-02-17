package ch11;

public class TaketransTest {

	public static void main(String[] args) {
		Student std1 = new Student("James",5000);
		Student std2 = new Student("Tomas",10000);
		Student std3 = new Student("Edward",20000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		Subway sub1 = new Subway(2);
		Taxi taxi1 = new Taxi("잘나간다 운수");
		
		std1.takeBus(bus100);
		std2.takeSubway(sub1);
		std3.takeTaxi(taxi1);
		
		std1.stdInfo();
		std2.stdInfo();
		bus100.stdInfo();
		bus500.stdInfo();
		sub1.stdInfo();
		std3.stdInfo();
		taxi1.toInfo();
	}

}
