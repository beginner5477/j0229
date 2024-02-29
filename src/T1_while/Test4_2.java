package T1_while;

import java.util.Scanner;

//반복문 탈출
public class Test4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i < 10)
		{
			i++;
			//짝수인 값만 출력하쇼 단 홀수인 경우는 출력 않고 다시조건을 비교하쇼
			if(i % 2 != 0)
				continue;
			System.out.println(i);
		}
		sc.close();
	}
}
