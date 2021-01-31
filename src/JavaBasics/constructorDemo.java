package JavaBasics;

public class constructorDemo {
	//constructor will not return values
	//name of the constructor should be the same with class name
	//whenever u create a obj constructor is called
	
	//Default constructor
	public constructorDemo()
	{
		System.out.println("i am in the constructor");
	}
	
	//Parameterized constructor
	public constructorDemo(int a, int b)
	{
		System.out.println("i am in the parameterized constructor");
	}
	
	public constructorDemo(String a)
		{
			System.out.println(a);
		}
	
	public void getData()
	{
		System.out.println("i am the method getData");
	}

	public static void main(String[] args) {
		//if not any para in the obj passt, will use default constructor
		constructorDemo cs=new constructorDemo();
		constructorDemo cs1=new constructorDemo("hello");
		constructorDemo cs2=new constructorDemo(2,3);
	
	}

}
