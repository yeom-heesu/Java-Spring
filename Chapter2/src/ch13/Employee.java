package ch13;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String department;
	private static int serialNum = 1000;
	
	public Employee() {
		employeeId = serialNum +1;
		serialNum++;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeName(String employeename) {
		this.employeeName = employeeName;
	}
	public void getDepartment(String department) {
		this.department = department;
	}
	
	public void showInfo() {
		System.out.println("사원번호 : "+ employeeId +"이름 : "+ employeeName + "부서 : " + department);
	}
	public static int getSerialNum() {
		return serialNum;
	}
}
