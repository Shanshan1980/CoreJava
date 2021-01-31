package JavaBasics;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		Date d=new Date();
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy.MMMM.dd hh:mm:ss");
		
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(d.toString());

	}

}
