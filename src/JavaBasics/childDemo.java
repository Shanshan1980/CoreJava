package JavaBasics;

public class childDemo extends parentDemo{
	String name="QAClickAcademy";
	public childDemo()
	{
		super(); //involke the constructor in the parent class, this should be always at first line
		System.out.println("child class constructor");
	}
	public void getStringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	public void getData()
	{
		super.getData();
		System.out.println("i am in child class");
	}

	public static void main(String[] args) {
		childDemo cd=new childDemo();
		cd.getStringdata();
		cd.getData();

	}

}
