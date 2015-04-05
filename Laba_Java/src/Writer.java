import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;


public class Writer implements IWriter
{
	public void output_in_file(ArrayList<logs> log, String filename)
	{
		try (BufferedWriter out = new BufferedWriter(new FileWriter(filename)))
		{
			for (logs l : log)
			{
				out.write(l.getHost() + "\t    " + l.getTime().toString() + "\t    " + l.getRequest() + "\t    " + l.getReply() + "\t    " + l.getBytes() + '\n');
			}
		} catch (Exception e) {System.out.print("Error");}
	}
	public void output_some_string( ArrayList<logs> log, int numb_of_string, int count)
	{
		for (int i=numb_of_string; i<=numb_of_string+count; i++)
		{
			System.out.println(log.get(i).getHost() + "\t" + log.get(i).getTime().toString() + "\t" + log.get(i).getRequest() + "\t" + log.get(i).getReply() + "\t" + log.get(i).getBytes());
		}
	}

}
