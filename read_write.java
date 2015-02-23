import java.io.*;
import java.util.Scanner;
public class read_write
{
	public static void main(String[] args)
	{
         try(Scanner bf = new Scanner (new FileReader(args[0])))
         {
        	 int numb_of_string=0;
        	 int count =0;
        	 try
        	 {
        	 numb_of_string = Integer.parseInt(args[1]);
        	 count = Integer.parseInt(args[2]);
        	 } catch (Exception e) {System.out.println("Incorrect input"); System.exit(0);}
	         
           int c =1;
	       while (bf.hasNext() && c<numb_of_string)
           {
	    	  bf.nextLine();
        	  c++;
           }
	       
	       while (bf.hasNext() && c<numb_of_string+count )
	       {
	    	   System.out.println(bf.nextLine());
	    	   c++;
	       }
         } catch (Exception e) {System.out.println("File not Found");} 
	
     }
}
