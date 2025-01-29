package polymorphismConcept;

public class Boy extends Marriage{

	public void girlName() {
		System.out.println(1/0);
	}
	
	public static void main(String[] args) {
		Marriage b = new Boy();
		b.girlName();
	}
}
