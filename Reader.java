import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Reader implements IReader
{
	public void input_from_file(String filename, ArrayList<String> log)
	{
		try(Scanner bf = new Scanner (new FileReader(filename)))
		{
			int c=0;
			while (bf.hasNext())
		       {
		    	   String str = bf.nextLine();
		    	   log.add(str);
		    	   c++;
      	       }
		} catch (Exception e) {System.out.print("Error");}
	}
}
