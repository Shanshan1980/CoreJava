package JavaBasics;

public class StaticVar {
	String name;   // Instance Variables
	String address;
	//static block
	static String city;
	static int i;
	static {
		city="Bangalore";  // class Variables
		i=0;
	}
	
	StaticVar(String name, String address) {
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
	}
	public void getAddress(){      // Instance methods
		System.out.println(address+" "+city);
	}
	public static void getCity(){
		System.out.println(city);
	}

	public static void main(String[] args) {
		StaticVar obj=new StaticVar("Bob","Marthalli");
		StaticVar obj1=new StaticVar("Ram","Jaranga");
		StaticVar obj2=new StaticVar("Tilo","Menmei");
		obj.getAddress();
		obj1.getAddress();
		StaticVar.getCity();
		StaticVar.i=4;
		

	}

}
