package ch13;

import java.util.*;


public class ConitionTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int max = 0;
		System.out.println("첫번째 수를 입력하세요.");
		int num1 = scan.nextInt();
		System.out.println("두번째 수를 입력하세요.");
		int num2 = scan.nextInt();
		
		max = num1>num2 ? num1 : num2;
		System.out.println("둘중 더 큰 수는 "+ max);
	}

}
