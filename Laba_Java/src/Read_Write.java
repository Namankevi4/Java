import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Read_Write
{
	public static void main(String[] args)  
	{
         
        	 int numb_of_string=0;
        	 int count =0;
        	 ArrayList<logs> log = new ArrayList<logs>();
        	 
        	 try
        	 {
        	 numb_of_string = Integer.parseInt(args[1]);
        	 count = Integer.parseInt(args[2]);
        	 } catch (Exception e) {System.out.println("Incorrect input"); System.exit(0);}
	         
             
             input_from_file(args[0], log);
             
             print_some_string(log, numb_of_string, count);
             
	         output_in_file(log, args[3]);
    }
	public static void print_some_string( ArrayList<logs> log, int numb_of_string, int count)
	{
		for (int i=numb_of_string; i<=numb_of_string+count; i++)
		{
			System.out.println(log.get(i).getHost() + "\t" + log.get(i).getTime().toString() + "\t" + log.get(i).getRequest() + "\t" + log.get(i).getReply() + "\t" + log.get(i).getBytes());
		}
	}
	public static void output_in_file(ArrayList<logs> log, String filename)
	{
		try (BufferedWriter out = new BufferedWriter(new FileWriter(filename)))
		{
			for (logs l : log)
			{
				out.write(l.getHost() + "\t    " + l.getTime().toString() + "\t    " + l.getRequest() + "\t    " + l.getReply() + "\t    " + l.getBytes() + '\n');
			}
		} catch (Exception e) {System.out.print("Error");}
	}
	public static void input_from_file(String filename, ArrayList<logs> log)
	{
		try(Scanner bf = new Scanner (new FileReader(filename)))
		{
			int c=0;
			while (bf.hasNext())
		       {
		    	   logs l = new logs();
		    	   String str = bf.nextLine();
		    	   l.parse(str);
		    	   log.add(l);
		    	   c++;
		    	   
		       }
		} catch (Exception e) {System.out.print("Error");}
	}
}
