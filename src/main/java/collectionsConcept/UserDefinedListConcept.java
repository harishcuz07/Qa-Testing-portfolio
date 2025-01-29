package collectionsConcept;

import java.util.LinkedList;
import java.util.List;

public class UserDefinedListConcept extends PojoConcept {

	public static void main(String[] args) {
		List<UserDefinedListConcept> nm = new LinkedList<UserDefinedListConcept>();
		
		UserDefinedListConcept ud = new UserDefinedListConcept();
		ud.setId(12);
		ud.setName("jansi");
		
		UserDefinedListConcept ud1 = new UserDefinedListConcept();
		ud1.setId(12);
		ud1.setName("jansi");
		
		nm.add(ud1);
		nm.add(ud);
		
		for(UserDefinedListConcept k: nm) {
			System.out.println(k.getId());
			System.out.println(k.getName());
		}  
	}
}
