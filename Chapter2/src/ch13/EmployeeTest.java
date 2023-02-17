package ch13;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setEmployeeName("이순신");
		
		System.out.println(employee.getSerialNum());
		
		Employee employee2 = new Employee();
	  	employee2.setEmployeeName("김유신");
		
		employee.showInfo();
		employee2.showInfo();
	}

}
