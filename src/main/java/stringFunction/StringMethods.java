package stringFunction;

public class StringMethods {

	public static void main(String[] args) {
		String objName = "welcome to CHENNAI to to to";
		char c = objName.charAt(6);
		System.out.println(c);
		
		int size = objName.length();
		System.out.println(size);
		
		String s=objName.toUpperCase();
		System.out.println(s);
		
		String sa=objName.toLowerCase();
		System.out.println(sa);
	
		System.out.println(objName.equals("welcome to CHENNAi")); // case sensitive
		System.out.println(objName.equalsIgnoreCase("welcome to chennaii"));
		
		boolean uiu = objName.startsWith("welcome");
		System.out.println(uiu);  // case sensitive
		
		System.out.println(objName.endsWith("CHENNAI"));    // case sensitive
		
		System.out.println(objName.contains("to"));    // case sensitive
		
		String h=objName.replace("to","too");
		System.out.println(h);
		
		String hs=objName.replaceAll("to","dfg");
		System.out.println(hs);
		
		String aaa ="aff ";
		System.out.println(aaa.length());
		boolean b=aaa.isEmpty();
		System.out.println(b);
		
		String er=aaa.trim();
		System.out.println(er.length());
		
		String[] f=objName.split(" ");
		
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i]);
		}
		
		
		int u=objName.lastIndexOf('e');
		System.out.println(u);     // case sensitive
		
		int uq=objName.indexOf('e');
		System.out.println(uq);
		
		String ko=objName.substring(0,7);
		System.out.println(ko);
		
	}
}
