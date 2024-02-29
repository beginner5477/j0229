package T4_exam;

import java.util.Scanner;

//숫자 맞추기 게임 1~100까지의 자연수가 들어와서 맞추는 게임
public class Test3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int ran = (int)((Math.random() * 100) + 1);
	int c = 1, n1;
	while(c <= 5)
	{
		System.out.print(c +"번째 수를 입력하세요:");
		n1 = sc.nextInt();
		if(n1 == ran)
		{
			System.out.println("맞추셨습니다.");
			break;
		}
		else if(n1 > ran)
		{
			System.out.println("더 작은수를 넣어주세요");
		}
		else 
			System.out.println("더 큰수를 넣어주세요");
		c++;
	}
	if(c == 6)
	{
		System.out.println("정답은 "+ran+"입니다.");
	}
	sc.close();
	}
}
