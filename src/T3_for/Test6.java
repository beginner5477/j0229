package T3_for;

//이중 for문 practice 
//리얼 브레이크문은 
public class Test6 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i = 1; i <= 3; i++)
		{
			for(int j = 1; j <= 4; j++)
			{
				cnt++;
				System.out.println(cnt);
			}
		}
	}
}
