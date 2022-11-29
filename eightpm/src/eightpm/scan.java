package eightpm;

import java.util.Scanner;

public class scan {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	/*	System.out.println("enter number 1");
		int a = s.nextInt();
		System.out.println("enter number 1");
		int b = s.nextInt();
		System.out.println("enter number 1");
		int c = s.nextInt();
		//System.out.println("the sum is" + (a+b+c));*/
		
		System.out.println("enter your name");
		String name = s.nextLine();
		System.out.println(name);
		
		System.out.println("enter number 1");
		int a = s.nextInt();
		System.out.println("enter number 1");
		int b = s.nextInt();
		System.out.println("enter number 1");
		int c = s.nextInt();
		System.out.println("the sum is" + (a+b+c));
		
	}

}
