package T1_while;

import java.util.Scanner;

//반복문 탈출
public class Test3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, i = 0, breakNum;
		while(true)
		{
			System.out.print("거꾸로 출력할 수를 입력하세요 1까지:");
			n1 = sc.nextInt();
			System.out.print("탈출할 수를 입력하세요:");
			breakNum = sc.nextInt();
			if(n1 >= breakNum) break;
			System.out.println("입력이 잘못되었습니다 다시 입력해주세요");
		}
		while(i < n1) {
			System.out.print(n1 + " ");
			if(n1 == breakNum)
				break;
			n1--;
		}
		sc.close();
	}
}
