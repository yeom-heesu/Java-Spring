package ch17;

public class RoopTest {

	public static void main(String[] args) {
		//1~10까지 더하여 그결과를 출력해보자 
		int i = 1;
		int res = 0;
		while(i<=10) {
			res += i;
			i += 1;
		}
		System.out.println(res);
	}

}
