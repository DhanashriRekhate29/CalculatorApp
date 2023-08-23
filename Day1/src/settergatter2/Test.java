package settergatter2;

public class Test 
{
public static void main(String args[])
{
	Engine eng=new Engine();
	eng.setWeight(9.00f);
	eng.setType("pqrs");
	eng.setCapacity(98);
	System.out.println(eng.getWeight());
	System.out.println(eng.getType());
	System.out.println(eng.getCapacity());
}
}