package JavaBasics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        Properties prop=new Properties();
        FileInputStream fis=new FileInputStream("C:\\Users\\Shanshan Zhao\\eclipse-workspace\\CoreJava\\src\\data.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("browser"));
        System.out.println(prop.getProperty("url"));
        prop.setProperty("browser", "IE");   // change the property
        System.out.println(prop.getProperty("browser"));
        
        // write back the changed property into the data.properties file
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Shanshan Zhao\\eclipse-workspace\\CoreJava\\src\\data.properties");
        prop.store(fos, null);
	}

}
