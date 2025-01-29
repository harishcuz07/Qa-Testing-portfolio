package collectionsConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListConcept{
	
	public static void main(String args[]) {
		List objName = new ArrayList();
		objName.add(89);               // int
		objName.add(89); 
		objName.add(89); 
		objName.add(true);             // booleAN
		objName.add("barathan");       // string
		objName.add('a');             // character
		objName.add(122f);            // float
		
		Set obj1 = new HashSet();
		obj1.addAll(objName);
		System.out.println("xxxxxx"+obj1);
		
		System.out.println(objName.get(3));
		int rt=objName.size();
		System.out.println(rt);
		
		objName.add(2,false);
		System.out.println(objName);
		
		objName.set(2, 567);
		System.out.println(objName);

		boolean jk =objName.contains("barathan");
		System.out.println("output="+jk);
		
		int opow=objName.indexOf(89);
		System.out.println(opow);
		
		int opo=objName.lastIndexOf(89);
		System.out.println(opo);
		
		objName.remove(3);
		System.out.println(objName);

		for(int a=0;a<rt;a++) {
			System.out.println(objName.get(a));
		}
		objName.clear();
		System.out.println(objName);
	}
	
}