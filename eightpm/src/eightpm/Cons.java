package eightpm;

public class Cons {
	
	public static void main (String args[])
	{
		Cons obj=new Cons();
		
	}
	public Cons(){
		int peri=50;
		int area = 4*5;
		System.out.println(area);
		area +=5;
		System.out.println(area);
		area-=5;
		System.out.println(area);
		area*=5;
		System.out.println(area);
		area/=5;
		System.out.println(area>10?"big":"small");
		System.out.println(area>=20 && peri>=50);
		System.out.println(area>20 && peri>50);
		System.out.println(area<25 && peri>=40);
		System.out.println(area>=30 && peri>=45);
		if (area>10)
		{
			System.out.println("wow so big");
		}
		
		else
		{
			System.out.println("very small");
		}
		
	}

}
