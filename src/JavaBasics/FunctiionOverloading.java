package JavaBasics;
//function overloading: 
// the methods which have same methods name
//either argument count be different or argument data type should be different

public class FunctiionOverloading {
	
	public void getData(int a)
	{
		System.out.println(a);
	}
	public void getData(String a)
	{
		System.out.println(a);
	}
	public void getData(int a, int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		FunctiionOverloading f=new FunctiionOverloading();
		f.getData(3);
		f.getData("hello");
		f.getData(2, 3);

	}

}
