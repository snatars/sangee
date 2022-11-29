package eightpm.exception;

import java.util.Scanner;

public class except {
	
	public static void main (String args[]) throws ArithmeticException
	{
	
		try
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Please enter your age");
			int age = s.nextInt();
			if (age > 18) {
				System.out.println("ready to vote");
			}
			else {
				throw (new ArithmeticException("minor") );
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally");
		}
	}

}
