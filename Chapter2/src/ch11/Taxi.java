package ch11;

public class Taxi {
	public String name;
	public int money;
	
	public Taxi() {}
	public Taxi(String name) {
		this.name = name;
	}
	public void take(int money) {
		this.money += money;
	}
	public void toInfo() {
		System.out.println(name +"택시 수입은 " + money +"원 입니다." );
	}
}
