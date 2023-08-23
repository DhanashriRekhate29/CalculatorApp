package TypeCasting;

public class Test
{
	public Employee setDeveloper()
	{
		Developer d=new Developer();
		d.noofprograms=10;
		d.eid=1;
		d.name="abc";
	return d;
}
public Employee setTester()
{
        Tester t=new Tester();
	d.noofprograms=5;
	d.eid=2;
	d.name="xyz";
return t;
}
public static void main(String args[])
{
	Test test=new Test();
	Employee e=test.setDev();
	System.out.println(e.eid);
	System.out.println(e.name);
	Tester t=(Tester)test.setTester();
	System.out.println(t.eid);
	System.out.println(t.name);
	System.out.println(t.noofTest);
	
}
}
