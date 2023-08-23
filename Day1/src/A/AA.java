package A;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AA {
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\BC");
		boolean b=	f.mkdir();
		File f1=new File(f+"\\PR");
		boolean b1=	f1.mkdir();

		
		if(b==true)
		{
			System.out.println("folder create");
		}
		else
		{
			System.out.println("not create");
		}
		
		File f2=new File(f1+"\\abc.txt");
		boolean b2=f2.createNewFile();
		
		FileWriter fw=new FileWriter(f2,true);
		fw.write("welcome");
		fw.flush();


	}

}
