
public class CopyDemo_2 {
	public static void main(String[] args) {
		Product mouse=new Product();
		mouse.price=20000; 
		Product keyboard=mouse; //주소복사
		System.out.println("BeforeChange");
		System.out.println("Mouse's Price="+mouse.price);
		System.out.println("Keyboard's Price="+keyboard.price);
		
		System.out.println("AfterChange");
		mouse.price=10000;
		System.out.println("Mouse's Price="+mouse.price);
		System.out.println("Keyboard's Price="+keyboard.price);
	}
}

class Product{
	int price;
}