package collectionsConcept;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapConcept {
	public static void main(String[] args) {
		Map<Integer,String> c = new HashMap<Integer,String>();
		c.put(10, "jansi");
		c.put(null, "jansi");
		c.put(null, "hari");
		c.put(10, "jansii");   
		c.put(20, "barathan");
		c.put(30, "aravind");
		c.put(120, "navin");
		System.out.println(c.get(10));
		Set<Integer> ty=c.keySet();
		System.out.println(ty);
		
		for(Integer fr:ty) {
			System.out.println(fr);
		}
		
		Collection<String>tr=c.values();
		System.out.println(tr);
		for(String frw:tr) {
			System.out.println(frw);
		}
		
		Set<Entry<Integer,String>> er = c.entrySet();

		for(Entry<Integer,String> w:er) {
			System.out.println(w);
			System.out.println(w.getKey());
			System.out.println(w.getValue());
		}
		
		
		Map<Integer,String> d = new LinkedHashMap<Integer,String>();
		d.put(10, "jansi");
		d.put(10, "jansii");
		d.put(20, "barathan");
		d.put(30, "aravind");
		d.put(120, "navin");
		System.out.println(d);
		
		Map<Integer,String> e = new TreeMap<Integer,String>();
		e.put(10, "jansi");
		c.put(null, "jansi");
		e.put(120, "navin");
		e.put(10, "jansii");
		e.put(30, "aravind");
		e.put(20, "barathan");
		System.out.println(e);
	}
}
