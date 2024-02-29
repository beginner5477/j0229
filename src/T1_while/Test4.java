package T1_while;

import java.util.Scanner;

//반복문 탈출
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i < 10)
		{
			i++;
			//짝수인 값만 출력하쇼
			if(i % 2 == 0)
				System.out.println(i);
		}
		sc.close();
	}
}
