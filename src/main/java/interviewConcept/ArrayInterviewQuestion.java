package interviewConcept;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayInterviewQuestion {

	public static void main(String[] args) {
		
		int[] y= {1,6,7,8,7,6,8};
		List<int[]> asList = Arrays.asList(y);
		Set<int[]> gh = new TreeSet<int[]>();
		gh.addAll(asList);
		for(int[] yy:gh) {
			System.out.println(yy);
		}
		
		
		/*String y[] = {"chennai","madurai","coimbatore"};
		int u=y.length;
		for(int i=0;i<u;i++) {
			if(y[i].contains("ai")) {
				System.out.println(y[i]);
			}
			
		}*/
	}
}
