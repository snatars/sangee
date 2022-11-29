package eightpm;

public class child1 extends Parent1{
	int age =30;
	
	public void cn()
	{
		System.out.println("cn");
		System.out.println(age);
		System.out.println(super.age);
	}
	public static void cs()
	{
		System.out.println("cs");
	}
	public static void main(String[] args) 
		
	{
		child1 c1 = new child1();
		c1.cn();
		child1.cs();
		
		c1.pn();
		child1.ps();
		
	}
	
}

