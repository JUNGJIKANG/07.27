
public class OpDemo {
	public static void main(String[] args) {
//		//최우선 연산자
//		int age=26;
		//단항연산자
//		int age=26;
//		age=age+1;
//		age++; //age에 1을 더 하라는 것, age--는 -1을 하라는 의미, 증감은 앞에써도 되고 뒤에써도 무관함
		//prefix operator(앞에 써도댐), posfix oprator(뒤에 써도댐), +-만 해당함.
//		System.out.println("age="+age);
//		System.out.println("age="+ ++age); //++이 변수의 앞에 있으면 더하는것을 먼저하라는 의미, 즉 더해서 출력하라. (1증가해서 출력)
//		System.out.println("age="+ age++); //출력을 우선하고 더하기를 하라는 의미.
//		
		//++age;, age++;의 경우는 단독이라서 앞뒤 상관없으나, 내용에 들어가게 될 경우 순서 중요해짐.
		
//		int su=345678;
//		String result=Integer.toBinaryString(su);
//		System.out.println("result="+result);
//		int su1=~su;
//		result=Integer.toBinaryString(su1);
//		System.out.println("result="+result);
//		System.out.println("su1="+su1);
		
//		boolean flag=4>6;
//		System.out.println("flag="+flag);
//		System.out.println("flag="+!flag);
		
//		Student jikang=new Student(); //new는 단항연산자.

		//형변환, Cast, Convert
		//1. Cast Up, Promotion, 자동형변환, Implicit Conversion
		double result = 5+3.14; //5를 5.0으로 형변환하여 계산하는 것.
		System.out.println("result="+result);
		//2. Cast Down, Demotion, 강제적형변환, Explicit Conversion
		int result1=(int)(5+3.14); //3.14를 3으로 강제형변환 시켜서 계산. (int)로 줄여서 계산하는 것. int를 long로 해도 가능
		
		System.out.println("result1="+result1);
	}
}
