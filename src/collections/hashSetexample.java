package collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetexample {
    //HashSet,LinkedHashSet,TreeSet implement Set interface
	//does not accept duplicate values
	//There is no quarantee elements stored in sequential order..Random or 
	
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");
		hs.add("CHINA");
		hs.add("GERMANY");
		
		System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs.add("FRANCE"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println("=========================");
		
		Iterator<String> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
