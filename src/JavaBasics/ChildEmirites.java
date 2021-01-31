package JavaBasics;

// abstract class , inherite
public class ChildEmirites extends ParentAirCraft {
	public void engine()
	{
		System.out.println("new engine");
	}

	public static void main(String[] args) {
		ChildEmirites c=new ChildEmirites();
		c.engine();
		c.safetyGuidelines();
		c.bodyColor();
	}

	@Override
	public void bodyColor() {
		System.out.println("Red color on the body");
	}

}
