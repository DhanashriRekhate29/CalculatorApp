package File;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class A
{
		public static void main(String[] args) throws IOException 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter folder name");
			String folder=sc.next();
			File f=new File(folder);
			Boolean b=f.mkdir();
			if(b==true)
			{
				System.out.println("Folder is created");
			}
			else
			{
				System.out.println("folder is not created");
			}
			
			
			Scanner sc1=new Scanner (System.in);
			System.out.println("Enter file name");
			String file=sc.next();
			File f1=new File(file);
			boolean b1=f1.createNewFile();
			if(b1==true)
			{
				System.out.println("File is created");
			}
			else
			{
				System.out.println("File is not created");
			}
			Scanner sc2=new Scanner (System.in);
			System.out.println("Enter information"+f1);
			String information=sc.next();
			FileWriter fw=new FileWriter(f1,true);
			fw.write(information);
			fw.flush();
		}
}
			
			
			
			
			
			
			
			
