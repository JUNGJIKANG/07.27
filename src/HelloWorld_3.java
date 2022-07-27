//Static을 활용한 주소입력(주소없이 접근이 가능하다)
public class HelloWorld_3 {
//	String str="Hello, World"; //member variable or instance variable
	static String str="Hello,World"; //Static Variable or Class variable / Class와 Main이 같은 Static을 가지고 있으므로 인식 가능
	
	public static void main(String[] args) {
//	String str="Hello,World"; //Local Variable	
		System.out.println("str="+str);
	}
}
