import java.text.ParseException;
import java.util.ArrayList;

public class Parse implements IParse
{
	public void parse(ArrayList<String> log, ArrayList<logs> logs) throws ParseException
	{
		for (String l : log)
		{
			logs s = new logs();
			s.parse(l);
			logs.add(s);
		}
	}

}
