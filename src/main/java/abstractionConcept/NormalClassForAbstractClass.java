package abstractionConcept;

public class NormalClassForAbstractClass extends AbstractClassConcept{

	@Override
	public void jansi() {

		System.out.println("implementation");
	}
	
		@Override
	void kalai() {
		System.out.println("implementaaftion");
		
	}
	public static void main(String[] args) {
		NormalClassForAbstractClass nm = new NormalClassForAbstractClass();
		nm.jansi();
		nm.kalai();
		
	}
}
