package ArrayConcept;

import java.util.Arrays;
import java.util.List;



public class BasicArray {
	
	 public static void main(String[] args) {
		 
	   int num[]= new int[5];
	   num[0]= 20;
	   num[1]= 30;
	   num[2]= 200;
	   num[3]= 300;
	   num[0]=56;
	   int numv[]= {23,12,43,78,7876,878,88,87,89,99,11,94};
	   
	   
	   Arrays.sort(numv);
	   
	   for(int number: numv) {
		   
		 //  System.out.println(number);
		   
		   
		   
	   }
	   int highestNumber = numv[numv.length - 1];
	   int lower = numv[0];
	   
	   System.out.println(highestNumber);
	   System.out.println(lower);
	/*   for(int i=0;i<numv.length;i++) {
		   int temp=0;
		   for(int j=i+1;j<numv.length;j++) {
			   if(numv[i]<numv[j]) {
				   temp=numv[j];
				   numv[j]=numv[i];
				   numv[i]= temp;
			   }
		   }
	   }
	   for(int k=0;k<numv.length;k++) {
		   System.out.println(numv[k]);
	   }
	   System.out.println(numv[numv.length-3]);
	   
	 }*/
  }
	 
}