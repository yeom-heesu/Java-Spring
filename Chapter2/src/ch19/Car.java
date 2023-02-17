package ch19;

public class Car {
	private static Car instance = new Car();
	private String carName;
	private static int serialNum=10000; 
	private int carNum;
	
	public Car() {
	}
	public static Car getInstance(){
		if (instance == null) {
			instance = new Car();
		}
		return instance;
	}
	public Car createCar() {
		
		return instance;
	}
	public int getCarNum() {
		carNum =  serialNum + 1;
		serialNum ++;
		return carNum;
	}
}
