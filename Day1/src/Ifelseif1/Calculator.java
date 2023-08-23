package Ifelseif1;
import java.util.Scanner;
public class Calculator
{
	public void addition()
	{

		Scanner sc=new Scanner(System.in);
				System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number'");
		int b = sc.nextInt();
		int c=a+b;
		System.out.println(c);
	}
	public void subtraction()
	{
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number'");
		int b = sc.nextInt();
		int c=a-b;
		System.out.println(c);
	}
	public void multiplication()
	{
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number'");
		int b = sc.nextInt();
		int c=a*b;
		System.out.println(c);
	}
	public void division()
	{
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number'");
		int b = sc.nextInt();
		int c=a/b;
		System.out.println(c);
	}
}
