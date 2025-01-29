package exceptionConcept;

import java.io.IOException;

public class ThrowAndThrowsConcept {

	public static void jansi() throws IOException  {

		System.out.println("explaning throw concept");
		throw new IOException();
	}
	
	public static void main(String[] args) throws IOException  {
		jansi();
	}
}
