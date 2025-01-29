package constructorConcept;

public class ConstructorConcept{
	public  ConstructorConcept(int a , int b) {
      
		System.out.println("default constructor");
	}
	
	public  ConstructorConcept(int a) {
        this("ws");  
		System.out.println("jansi ");
	}
	
	public  ConstructorConcept(String t) {
       this(true);
		System.out.println(" aravind");
	}
	
	public  ConstructorConcept(boolean t) {

		System.out.println(" barathan");
	}
	
	public static void main(String[] args) {
		ConstructorConcept defaultConstructor =new  ConstructorConcept(55,10);
		
	}
	
	
}