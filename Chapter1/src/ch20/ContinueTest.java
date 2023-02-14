package ch20;

public class ContinueTest {

	public static void main(String[] args) {
		// 1~100까지 수중 3의 배수 출력
//		int num = 1;
//		while (num<=100) {
//			
//			if (num%3==0) {
//				System.out.println(num);
//			}
//			num += 1;
//		}
		
		for (int i=1;i<=100;i++) {
			if (i%3!=0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
