package controlStatement;

public class TryCocept {

	public static void main(String[] args) {
		
		try {
		System.out.println(16/0);
		}
		
		catch(ArithmeticException e) {
			System.out.println(16/8);
		}
		
		catch(Exception e) {
			System.out.println(16/4);
		}
		
		finally {
			System.out.println("confirm");
		}
	}
}
