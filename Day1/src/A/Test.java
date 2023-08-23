package A;
import java.io.File;
import java.io.IOException;

public class Test 
{
	public static void main(String args[]) throws IOException
	{
		File f=new File("XYZ.txt");
		boolean b=f.createNewFile();
		if(b==true)
		{
			System.out.println("File created successfully");
		}
		else
		{
			System.out.println("Not created");
		}
		
	}

}
