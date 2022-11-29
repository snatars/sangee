package eightpm;

public class child extends parent{

	@Override
	public void am() {
		// TODO Auto-generated method stub
		System.out.println("am");
		
	}

	public static void main (String[] args)
	{
		
		child ch = new child();
		ch.am();
		ch.nm();
	}
}
