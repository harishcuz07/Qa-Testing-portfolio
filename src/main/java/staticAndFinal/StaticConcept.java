package staticAndFinal;

public class StaticConcept{
	
	static int a=100;
	
	public static void kalai() {
		System.out.println("static method");
	}
	
	public static void main(String[] args) {

		System.out.println(a);
		kalai();
	}
}