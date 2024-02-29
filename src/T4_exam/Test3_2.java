package T4_exam;

import java.util.Scanner;

//1개의 주사위를 던졌을때 나오는 숫자맞추기 게임
public class Test3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = (int)(Math.random() * 6 + 1); 
		int userNum = 0;
		int c = 0;
		System.out.println("주사위 1~6까지 중 숫자 맞추기 기회는 3번");
		while(c < 3)
		{
			while(true)
			{
			System.out.print((c + 1) +"번째 수를 입력하세요:");
			userNum = sc.nextInt();
			if(userNum < 1 || userNum > 6)
			{
				System.out.println("입력이 잘못되엇습니다. 다시입력하쇼");
			}
			else
				break;
			}
			if(userNum == n1)
			{
				System.out.println("맞추셨습니다.");
				break;
			}
			else if(userNum > n1)
			{
				System.out.println("더 작은수를 넣어주세요");
			}
			else 
				System.out.println("더 큰수를 넣어주세요");
			c++;
		}
		if(c == 3)
		{
			System.out.println("정답은 "+n1+"임");
		}
		sc.close();
	}
}
