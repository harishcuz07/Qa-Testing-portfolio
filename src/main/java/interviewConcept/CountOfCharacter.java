package interviewConcept;

public class CountOfCharacter {

	public static void main(String[] args) {
		String g = "selvaraj";
		int count=0;
		for(int i=0;i<g.length();i++) {
			char ch = g.charAt(i);
			
			if(ch=='a' || ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'|| ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				
				System.out.println(ch);
				count++;
			}
			
		}
		System.out.println(count);
	}
}
