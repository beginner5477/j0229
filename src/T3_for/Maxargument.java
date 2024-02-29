package T3_for;

import java.util.Scanner;

//두수를 입력받아 최대공약수를 출력하는 프로그램
public class Maxargument {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0, i, temp = 0, maxAgment = 0;
		System.out.print("첫번째 수를 입력하세요:");
		n1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요:");
		n2 = sc.nextInt();
		if(n1 > n2)
		{
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		for(i = 1; i <= n2; i++)
		{
			if(n1 % i == 0 && n2 % i == 0)
			{
				maxAgment = i;
			}
		}
		System.out.println(n1+"과 "+n2+"의 최대공약수는 "+maxAgment+"입니다.");
		
		sc.close();
	}
}
