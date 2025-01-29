package utilities;

import java.util.LinkedList;
import java.util.List;

public class asd extends xsd{
	
	public static void main(String[] args) {
		asd obj = new asd();
		obj.setId(10);
		obj.setName("hari");
		
		asd ob = new asd();
		ob.setId(20);
		ob.setName("selva");
		
		List<asd> ls = new LinkedList<asd>();
		ls.add(obj);
		ls.add(ob);
		
		
        System.out.println(ob.getName());		

	}

}
