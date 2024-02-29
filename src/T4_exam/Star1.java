package T4_exam;

import java.util.Scanner;

//피라미드 출력 프로그램
public class Star1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, n1;
		System.out.print("피라미드 층수를 입력해주세요:");
		n1 = sc.nextInt();
		for(i = 0; i < n1; i++)
		{
			for(j = 1; j < (n1 - i); j++)
			{
				System.out.print(" ");
			}
			for(j = 0; j <= i; j++)
			{
				System.out.print("★");
			}
			for(j = 1; j <= i; j++)
				System.out.print("★");
			System.out.println();
		}
		sc.close();
	}
}
