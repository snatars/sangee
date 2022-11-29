package eightpm;

public interface inter1 {
	
	public void ab1();
	default public void ab2()
	{
		System.out.println("ab2");
	}

}
