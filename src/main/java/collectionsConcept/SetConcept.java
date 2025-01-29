package collectionsConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetConcept {

	public static void main(String[] args) {
		Set obj1 = new HashSet();
		obj1.add(12);
		obj1.add("selva");
		obj1.add(true);
		obj1.add(12);
		obj1.add("selva");
		obj1.add(null);
		obj1.add(null);
		obj1.remove(12);
		System.out.println(obj1);
		
		Set obj = new LinkedHashSet();
		obj.add(12);
		obj.add("selva");
		obj.add(true);
		obj.add(12);
		obj.add("selva");
		obj.add(null);
		obj.add(null);
		System.out.println(obj);
		
		Set<Integer> objj = new TreeSet<Integer>();
		objj.add(23);
		objj.add(12);
		objj.add(45);
		objj.add(2);
		//objj.add(null);
		System.out.println(objj);
		/*for(Integer l:objj){
			System.out.println(l);
		}*/
		
		List objName = new ArrayList();

		objName.addAll(objj);
		System.out.println("List="+objName.get(3));
		
		
	}
}
