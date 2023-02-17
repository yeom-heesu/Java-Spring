package ch19;

public class CarfactoryTest {

	public static void main(String[] args) {
		Car factory = Car.getInstance();	//private static 변수
		Car mySonata = factory.createCar(); //public 메소드
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}

}
