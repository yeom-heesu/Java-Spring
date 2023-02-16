package ch11;

public class Subway {
	public int sub_num;
	public int sub_money;
	public int passengercnt;
	
	public Subway() {}
	public Subway(int num) {
		this.sub_num = num;
	}
	public Subway(int num,int money) {
		this.sub_num = num;
		this.sub_money = money;
	}
	
	public void take(int money) {
		this.sub_money += money;
		this.passengercnt += 1;
	}
	
	public void stdInfo() {
		System.out.println(sub_num+"지하철의 수입은 " + sub_money+"원 탑승한 수는 "+ passengercnt + "명 입니다.");
	}
}

