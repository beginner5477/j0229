package T4_exam;

//난수(무작위수)생성 프로그램
//Math.random()는 0~1중의 실수를 랜덤으로 생성해줌.
public class Test1 {
	public static void main(String[] args) {
		/*double ran = Math.random();
		int i;
		double jud;
		double res;
		System.out.println(ran);
		for(i = -1;i <= ran; i++)
		{
			
		}
		jud = ran - i;
		res = ran - jud;
		System.out.println(res);
		*/
		double ran = Math.random();
		System.out.println(ran);
		for(int i = 1; i <=5; i++)
		{
			System.out.println( (int)(Math.random() * 10));
		}
		
	}
}
