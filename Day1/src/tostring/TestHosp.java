package tostring;
import java.util.*;
public class TestHosp
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name:-");
	String S=sc.next();
	System.out.println("Enter Location:-");
	String p=sc.next();
	System.out.println("Enter MobNo:-");
	long l=sc.nextLong();
	
	Hospital h=new Hospital(S,p,l);
	System.out.println(h);

	
	
}
}
