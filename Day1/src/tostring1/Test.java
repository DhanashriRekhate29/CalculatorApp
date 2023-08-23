package tostring1;

public class Test
{
public static void main(String args[])
{
	Hospital h=new Hospital();
	h.setName("XYZ");
	h.setLocation("Karvenagar");
	h.setmobno(987654378l);
	System.out.println(h.getName());
	System.out.println(h.getLocation());
	System.out.println(h.getMobno());
	
}
}
