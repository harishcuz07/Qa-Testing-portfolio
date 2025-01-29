package polymorphismConcept;

public class MethodOverloading {

	public void methodOverloading(int a) {
		System.out.println("integer");
	}
	
   public void methodOverloading(int a, String b) {
		System.out.println("integer String");
	}

   public void methodOverloading(int a, boolean c) {
	System.out.println("integer boolean");
    }
   
   public static void main(String[] args) {
	   MethodOverloading obj =new MethodOverloading();
	   obj.methodOverloading(12,true);
	   obj.methodOverloading(12);
	 //  obj.methodOverloading(12,"aravind");


}
}
