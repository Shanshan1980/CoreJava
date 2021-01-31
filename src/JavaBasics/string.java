package JavaBasics;

public class string {

	public static void main(String[] args) {
		String a="hallo/javastring";
		System.out.println(a.charAt(2));  
		System.out.println(a.indexOf("h"));
		System.out.println(a.substring(3,6));
		System.out.println(a.substring(5));
		System.out.println(a.concat("---rahul teachers"));
		System.out.println(a.length());
		System.out.println(a.trim());
		System.out.println(a.toUpperCase());
		String arr[]=a.split("/");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("/", "-"));
		

	}

}
