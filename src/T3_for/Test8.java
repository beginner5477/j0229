package T3_for;

//이중 for문 practice 
//return은 그냥 포함된 메소드 자체를 탈출함.
public class Test8 {
	public static void main(String[] args) {
		int cnt = 0;
		for(int i = 1; i <= 3; i++)
		{
			for(int j = 1; j <= 4; j++)
			{
				
				cnt++;
				System.out.println(cnt);
				if(cnt == 6)
					return;
			}
		}
	}
}
