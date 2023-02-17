package ch03;

public class FunctionTest {
	
	public static int addNum(int num1,int num2) {
		
		return num1+num2;
	}
	
	public static void sayHello(String gre) {
	
		System.out.println(gre);
	}
	
	public static int calcsum() {
		
		int sum = 0;
		int i;
		
		for (i=0;i<=100;i++) {
			sum += i;
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		
		int res = addNum(n1,n2);
		
		sayHello("ㅎㅇ");
		System.out.println(res);
	}

}
