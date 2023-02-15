package ch08;

public class UserInfo {
	public static String name="Tomas";
	public static int height=180;
	public static int weight=78;
	public static int age=37;
	
	public static void getInfo() {
		System.out.println("키가"+ height +"이고 몸무게가 "+weight+"인 남성이 있습니다. 이름은 "+name +"이고 나이는"+age+"세 입니다.");
	}
	public static void main(String[] args) {
		getInfo();
	}
}
