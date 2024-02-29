package T4_exam;

import java.util.Scanner;

//최대최소 구하기 열악버전
public class Test5_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = -99, min = 99, n1;
		while(true)
		{
			System.out.print("수를 입력하세요:(종료시 999입력)");
			n1 = sc.nextInt();
			if(n1 == 999) break;
			if(n1 > max)
			{
				max = n1;
			}
			if(n1 < min)
			{
				min = n1;
			}
		}
		System.out.println("최대값: "+max+", 최솟값: "+min+"");
		
		sc.close();
	}
}
