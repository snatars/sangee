package eightpm;

public class meth1 {

	public static void main(String[] args)
	{
		System.out.println(meth1.divide(10,2));
		meth1.average(98,99,97);
		meth1 obj = new meth1();
		obj.add(20,30);
		obj.product();
		meth1 areaobj = new meth1();
		System.out.println(areaobj.areaOfTriangle(3.5));
		System.out.println(areaobj.areaOfRect(4.5f, 2.5f));
		
	}
	
	public static double divide(double num1, double num2)
	{
		double result = num1/num2;
		return result;
		
	}
	
	private static void average(int num1, int num2, int num3)
	{
		int total = num1+num2+num3;
		double average = total/3;
		System.out.println("average is "+average);
	}
	
	public void add(int num1,int num2)
	{
		int sum = num1+num2;
		System.out.println(sum);
	}
	
	public void product()
	{
		double prod = 10.3*20.5;
		System.out.println(prod);
	}
	
	private double areaOfTriangle(double r)
	{
		return (3.14*r*r);
	}
	public float areaOfRect(float l, float b)
	{
		return l*b;
	}
}

