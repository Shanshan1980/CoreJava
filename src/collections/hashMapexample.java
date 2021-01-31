package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapexample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0,"dog");
		hm.put(1,"cat");
		hm.put(42,"elephant");
		hm.put(3,"snake");
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
		
		Set sn=hm.entrySet();  // convert the hashMap into Set obj
		Iterator it=sn.iterator();  //
		while(it.hasNext())
		{
			
			Map.Entry mp=(Map.Entry)it.next(); //seperate key and value
			System.out.println(mp.getKey()+","+mp.getValue());
		}
		
		
		// Creating an empty HashMap 
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
  
        // Mapping string values to int keys 
        hash_map.put(10, "Geeks"); 
        hash_map.put(15, "4"); 
        hash_map.put(20, "Geeks"); 
        hash_map.put(25, "Welcomes"); 
        hash_map.put(30, "You"); 
  
        // Displaying the HashMap 
        System.out.println("Initial Mappings are: " + hash_map); 
  
        // Using entrySet() to get the set view 
        System.out.println("The set is: " + hash_map.entrySet()); 
    
} 

	}


