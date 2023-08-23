package Static;

public class Test
{
public static void main(String args[])
{
	Emp navin=new Emp();
	navin.eid=8;
	navin.salary=4000;
	Emp.ceo="mahesh";
	
	Emp ravi=new Emp();
	navin.eid=9;
	navin.salary=7000;
	Emp.ceo="mahesh";
	
	
	navin.Show();
	ravi.Show();
	
	
}
}
