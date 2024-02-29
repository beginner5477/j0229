package T1_while;

import java.util.Scanner;

//반복문 탈출
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, i = 0, breakNum;
		System.out.println("거꾸로 출력할 수를 입력하세요 1까지:");
		n1 = sc.nextInt();
		System.out.println("탈출할 수를 입력하세요:");
		breakNum = sc.nextInt();
		
		while(i < n1) {
			n1--;
			System.out.print(n1 + " ");
			if(n1 == breakNum)
				break;
		}
		sc.close();
	}
}
