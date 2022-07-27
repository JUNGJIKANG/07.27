
public class CopyDemo_1 {
	public static void main(String[] args) {
	Car sonata=new Car();
	sonata.price=25_000_000;
	
	Car matiz=new Car(); //값복사
	matiz.price=sonata.price;
	
	System.out.println("Before Change");
	System.out.println("Sonata's Price="+sonata.price);
	System.out.println("Matiz's Price="+matiz.price);
	
	System.out.println("After Change");
	sonata.price=1_000_000;
	System.out.println("Sonata's Price="+sonata.price);
	System.out.println("Matiz's Price="+matiz.price);
	}
}

class car{
	int price;
}