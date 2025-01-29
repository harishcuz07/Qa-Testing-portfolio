package stringFunction;

public class StringFunctionConcept{
	
	public static void main(String[] args) {
		
		String literalString = "jancy";
		String literalString1= "jancy";
		
		System.out.println(System.identityHashCode(literalString));
		System.out.println(System.identityHashCode(literalString1));
		
		String nonLiteralString = new String("barathan");
		String nonLiteralString1 = new String("barathan");
		
		System.out.println(System.identityHashCode(nonLiteralString));
		System.out.println(System.identityHashCode(nonLiteralString1));
		
		String immutableString = "aravind";
		String immutableString1 = "raj";
		
		System.out.println(System.identityHashCode(immutableString));
		System.out.println(System.identityHashCode(immutableString1));
		
		String a = immutableString.concat(immutableString1);
		System.out.println(System.identityHashCode(a));
		
		StringBuffer mutableString = new StringBuffer("selva");
		StringBuffer mutableString1 = new StringBuffer("raj");
		
		System.out.println(System.identityHashCode(mutableString));
		System.out.println(System.identityHashCode(mutableString1));
		
		StringBuffer t= mutableString.append(mutableString1);
		System.out.println(System.identityHashCode(t));


	}
}