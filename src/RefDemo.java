import java.util.Scanner;
public class RefDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("호준의 이름 : ");
		String name=sc.nextLine();
		
		System.out.print("호준의 나이 : ");
		int age=sc.nextInt();
		
		Student hojun=new Student();
		hojun.name=name;
		hojun.age=age;
		
		Student jikang=hojun;
		System.out.println("지강의 이름 : "+hojun.name);
		System.out.println("지강의 나이 : "+hojun.age);
//		Student jikang=new Student();
//		jikang.name=hojun.name; //주소복사
//		jikang.age=hojun.age; //값복사, copypaste했음.
   		
//		System.out.print("몸무게");
//		double weight=sc.nextDouble;
	}
}
