
public class StringDemo {
	public static void main(String[] args) {
//		String name; - 선언, Declaration(name을 선언해서 쓰겠다), name은 값을 넣지않고 주소를 넣겠다는 의미
//		name="정지강"; - 할당, Assignment, 정지강을 name이라는 주소 변수에 넣겠다는 의미. 
//		String name="정지강"; //초기화, Initialization
//		System.out.printf("이름=%s\n", name); 

		String name=new String("정지강"); //String(); 중() 안 내용은 constructors 참조, String은 new를 쓰지 않아도 되는 언어.
		Student jikang; //declaration, Stack을 만든 것.
		jikang=new Student(); //Assignment, Heap에서 Stack을 참조하는 것.
		jikang.hakbun="2022-001";
		jikang.name="정지강";
		jikang.age=26;
//		jikang.weight=82.5;
//		jikang.grade='A';
//		jikang.flag=
//		System.out.printf("%s,%s,%d\n",jikang.hakbun,jikang.name,jikang.age);

		Student chulsu=new Student();
		chulsu.name="안철수"; //안철수 번지
		chulsu.age=58;
//		System.out.printf("%s,%d\n",chulsu.name,chulsu.age);
		
		Student minji=new Student();
		minji.name="김민지"; //김민지 번지
		minji.age=26;
//		System.out.printf("%s,%d\n",minji.name,minji.age);
		
		System.out.print("정지강 학생정보 : ");
		System.out.printf("이름=%s, 나이=%d\n",jikang.name,jikang.age);
		System.out.print("안철수 학생정보 : ");
		System.out.printf("이름=%s, 나이=%d\n",chulsu.name,chulsu.age);
		System.out.print("김민지 학생정보 : ");
		System.out.printf("이름=%s, 나이=%d\n",minji.name,minji.age);
	}
}
