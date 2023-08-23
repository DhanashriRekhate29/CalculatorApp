package Overloading;

import java.security.PublicKey;

public class A 
{
	public static void main(String[] args) 
	{
	main("ABC",10);
	A a =new A();
	a.main('A');
	System.out.println(a.main(12.2));
	public static void main(String s,int X)
	{

	}
	public void main(char c)
	{

	}
	public int main(double d)
	{
		return 10;
	}

	}
	
	

}
