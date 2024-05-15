package mypkg;

public class MyCalc {
	int sum(int a, int b)
	{
		return a+b;
	}
	
	int diff(int a, int b)
	{
		return a-b;
	}
	
	public static void main (String[] args)
	{
		MyCalc calc = new MyCalc();
		System.out.println("Sum is " + calc.sum(20, 30));
		System.out.println("Diff is " + calc.diff(30, 20));
	}
}
