package T3_for;

//이중 for문 practice 
//리얼 브레이크문은 레이블 붙이고 탈출시키며됨.
public class Test7 {
	public static void main(String[] args) {
		int cnt = 0;
		atom: for(int i = 1; i <= 3; i++)
		{
			for(int j = 1; j <= 4; j++)
			{
				
				cnt++;
				System.out.println(cnt);
				if(cnt == 6)
					break atom;
			}
		}
	}
}
