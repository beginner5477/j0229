package T4_exam;

import java.util.Scanner;

// 마름모 찍기
public class assignment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, n1, n2 = 0;
		System.out.print("다이아몬드 세로 반절 길이를 적어주세요:"); // 
		n1 = sc.nextInt();
		n2 = n1 + 1;
		for(i = 0; i < n2; i++)
		{
			for(j = 1; j < (n2 - i); j++)
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
		for(i = 0; i < n1; i++)
		{
			for(j = 0; j <= i; j++)
			{
				System.out.print(" ");
			}
			for(j = 0; j < (n1 - i); j++)
			{
				System.out.print("★");
			}
			for(j = 1; j < (n1 - i); j++)
				System.out.print("★");
			System.out.println();
		}
		
		sc.close();
	}
}
