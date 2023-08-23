package Narrowing;

public class TestB
{
public static void main(String args[])
{
	B b=new B();
	b.m1((A)null);
	b.m1((String)null);
}
}
