package eightpm;

public class imp implements inter1{

	@Override
	public void ab1() {
		// TODO Auto-generated method stub
		System.out.println("ab1");
		
	}

	
	public static void main(String args[])
	{
		
		imp imp1 = new imp();
		imp1.ab1();
		imp1.ab2();
	}
}
