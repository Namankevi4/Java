import java.text.ParseException;
import java.util.ArrayList;

public interface ILogProcess 
{
	ArrayList<logs> log = new ArrayList<logs>();
	ArrayList<String> logs = new ArrayList<String>();
	
	void Process(String args[]) throws ParseException;
	
}
