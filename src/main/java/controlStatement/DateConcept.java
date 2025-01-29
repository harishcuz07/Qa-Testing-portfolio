package controlStatement;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConcept {

	public static void main(String[] args) {
		String date = "01-11-1990";
		
		String[] s=date.split("-");
		String day =s[0];
		String month = s[1];
		String year =s[2];
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
		
		Date d = new Date();
    SimpleDateFormat ss = new SimpleDateFormat("dd:MMMM:YYYY hh:mm:ss E");	
    
    String datess=ss.format(d);
    System.out.println(datess);
		
	}
}
