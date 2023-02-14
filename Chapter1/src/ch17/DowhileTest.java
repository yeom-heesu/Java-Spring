package ch17;

import java.util.*;

public class DowhileTest {

	public static void main(String[] args) {
		//입력받는 모든숫자의 합을 구하는 예제, 0이되면 종료
		Scanner scan = new Scanner(System.in);
		int input = 0 ;
		int res = 0;
		do {
			System.out.println("숫자를 입력하세요, 0을입력하면 프로그램이 종료됩니다.");
			input = scan.nextInt();
			res += input;
		}while (input !=0);
		System.out.println("모든 숫자의 합 = "+res);
	}

}
