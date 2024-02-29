package T4_exam;

//난수(무작위수)생성 중복숫자는 제외시켜줌 프로그램
//Math.random()는 0~1중의 실수를 랜덤으로 생성해줌.
public class Test2 {
	public static void main(String[] args) {
		int lotto;
		int[] intArray = new int[6];
		
		for(int i = 0; i < 6; i++)
		{
			lotto = (int)(Math.random() * 45) + 1;
			intArray[i] = lotto;
			for(int j = 0; j < i; j++)
			{
				if(intArray[i] == intArray[j])
				{
					i--;
					break;
				}
			}
		}
		for(int i = 0; i < 6; i++)
		{
			System.out.print(intArray[i] + " ");
		}
	}
}
