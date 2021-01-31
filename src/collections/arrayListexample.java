package collections;

import java.util.ArrayList;

public class arrayListexample {
	//ArrayList,LinkedList,Vector implementen List Interface
	//can accept duplicate values
	//array have fixed size where as arraylist can grow dynamicaly
	//u can access and insert any value in andy index

	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("rahul");
		a.add("java");
		a.add("java");
		a.add("java");
		System.out.println(a);
		a.add("student");
		a.add(0,"dozent");
		
		System.out.println(a);
		//a.remove(0);
		//a.remove("java");
		System.out.println(a.get(2));
		
		//testing
		System.out.println(a.contains("Shan"));
		System.out.println(a.indexOf("dozent"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());

	}

}
