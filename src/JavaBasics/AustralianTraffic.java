package JavaBasics;
import demopack.CentralTraffic;
import demopack.ContinentTraffic;

public class AustralianTraffic implements CentralTraffic,ContinentTraffic {

	public static void main(String[] args) {
		//a object of class AustralianTraffic create to implement CentralTraffic interface
		CentralTraffic a=new AustralianTraffic();
		a.redStop();
		a.greenGo();
		a.flashYellow();
		
		ContinentTraffic c=new AustralianTraffic();
		c.Trainsymbol();
		
		AustralianTraffic b=new AustralianTraffic();
		b.greenGo();
		b.redStop();
		b.flashYellow();
		b.walkonsymbol();
		b.Trainsymbol();
	}

	@Override
	public void greenGo() {
		System.out.println("green go implementation");
	}
	public void walkonsymbol()
	{
	System.out.println("walking");
	}
	@Override
	public void redStop() {
		System.out.println("red stop implementation");
	}

	@Override
	public void flashYellow() {
		System.out.println("flash yellow implementation");
	}

	@Override
	public void Trainsymbol() {
		System.out.println("Trainsymbol");
		
	}

}
