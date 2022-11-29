package eightpm;

import java.util.concurrent.ArrayBlockingQueue;

public class myqueue {
	
	public static void main(String args[])
	{
		ArrayBlockingQueue<Double> myQ = new ArrayBlockingQueue<>(4);
		myQ.add(1.5);
		myQ.add(2.5);
		myQ.add(3.5);
		myQ.add(4.5);
		System.out.println(myQ);
		myQ.remove();
		System.out.println(myQ.peek());
		for (double x:myQ)
		{
			System.out.println(x);
		}
	}

}
