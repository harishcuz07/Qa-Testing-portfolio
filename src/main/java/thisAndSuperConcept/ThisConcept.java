package thisAndSuperConcept;
public class ThisConcept extends SuperConcept{
	int id=90;
	
	public void barathan() {

		int id=125;
		System.out.println(super.id);
		System.out.println(id);
	}
	public static void main(String[] args) {
		ThisConcept objName = new ThisConcept();
		objName.barathan();
	}
}