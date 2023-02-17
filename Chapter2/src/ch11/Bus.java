package ch11;

public class Bus {
	int bus_num;
	int bus_money;
	public int passengercnt;
	
	public Bus() {}
	public Bus(int num) {
		this.bus_num = num;
		this.bus_money = 0;
	}
	public Bus(int num,int money) {
		this.bus_num = num;
		this.bus_money = money;
	}
	
	public void take(int money) {
		this.bus_money += money;
		this.passengercnt += 1;
	}
	
	public void stdInfo() {
		System.out.println(bus_num+"번 버스의 수입은"+ bus_money + "탑승한 수는 "+ passengercnt + "명 입니다.");
	}
}
