package stringQuestion;

public class EquallsInterviewQuestion {

	public static void main(String[] args) {
		String s = new String("selva");
		
		 System.out.println(System.identityHashCode(s));
		
		 String s1= "selva";
		 System.out.println(System.identityHashCode(s1));

		
		System.out.println(s==s1);
		System.out.println(s.equals(s1));

		// == // its checking address element
		// equals //its checking content element
	
		for (int i=0;i<5;i++) {
			if(i==3) {
				//System.out.println(i);
			}
		}

	}
}
