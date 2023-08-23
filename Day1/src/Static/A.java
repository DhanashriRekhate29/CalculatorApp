package Static;

public class A 
{
int x;
static int y;
public void m1()
{
	System.out.println(x);
	System.out.println(y);
	//System.out.println(A.x);
	System.out.println(A.y);
}
public void m2()
{
	System.out.println(x);
	System.out.println(y);
	A a=new A();
	System.out.println(a.x);
	//System.out.println(a.y);
	System.out.println(A.y);	
}
}
