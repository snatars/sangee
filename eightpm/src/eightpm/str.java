package eightpm;

public class str {
public static void main(String[] args) {
	String p="ILOVEINDIA";
	System.out.println(p.toLowerCase());
	p=p.toLowerCase();
	System.out.println(p);
	System.out.println(p.indexOf('v'));
	System.out.println(p.charAt(3));
	
	System.out.println(p.replace('i', 'I'));
	System.out.println(p.replace("india","USA"));
	System.out.println(p.contains("love"));
	System.out.println(p.substring(1, 5));
	System.out.println(p.length());
}
}
