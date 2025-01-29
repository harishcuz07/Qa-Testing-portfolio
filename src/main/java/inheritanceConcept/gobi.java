package inheritanceConcept;

 class gobi {
	 
	int nolegs=2;
	
	public static void walk() {
		System.out.println("i can walk");
		
	}

	public static void talk() {
		System.out.println("i can talk");
		
	}
	
class hari extends gobi {
	
public void hk() {
	System.out.println("i can talk");

}
	
}
static class call {
	public static void main (String [] args) {
		gobi obj = new gobi();
		
		System.out.println(obj.nolegs);
		obj.walk();
		obj.talk();
		
	}

}
 }	