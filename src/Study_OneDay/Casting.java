package Study_OneDay;

public class Casting {

	public static void main(String[] args) {
		double a = 1.1;
		double b = 1;
		double b2 = (double)1;
		System.out.println(b);//1.0실수로 컨버팅
		
		//int c = 1.1; ->에러
		
		int d = (int) 1.1;//강제로 정수로 만들어줌
		double e = 1.1;
		//그냥 형변환을하면 손실이 있음->1.1 에서 1로 형변환 하면 .1이 사라짐
		System.out.println(d);
		
		String f = Integer.toBinaryString(1);
		System.out.println(f);
		//결과:1 (문자열)
		System.out.println(f.getClass());//해당 변수가 어떤타인입지 알려줌
	}

}
