package stringFunction;

public class LiteralStringAndNonLiteralStringDemo {

	public static void main(String[] args) {
		/*String s = "selva";  // store inside heap memory 
		String s1 = "selva";

		System.out.println(System.identityHashCode(s)+"Literal");
		System.out.println(System.identityHashCode(s1)+"Literal"); //same memory
		*/
		
		
		
		/*String x = new String("selva");
		String x1 = new String("selva");//create new memory
		
		System.out.println(System.identityHashCode(x)+"Non");// store in heap memory

		System.out.println(System.identityHashCode(x1)+"Non");*/
		
		
		
		/*String m = "selva"; // we can store more duplicate value in same memory
		String m1 = "raj";
		System.out.println(System.identityHashCode(m)+"Immutable");
		System.out.println(System.identityHashCode(m1)+"Immutable");
	
		System.out.println(m.concat(m1));
		System.out.println(System.identityHashCode(m.concat(m1))); // its create new memory
*/

		

		StringBuffer y = new StringBuffer("selva");   // we cant store more duplicate value in same memory
		String y1 = new String("selva");
		
		System.out.println(System.identityHashCode(y));

		System.out.println(System.identityHashCode(y1));  //it takes same memory
		
		System.out.println(y.append(y1));
		System.out.println(System.identityHashCode(y.append(y1))); 

		
		
		



		
	}
}
