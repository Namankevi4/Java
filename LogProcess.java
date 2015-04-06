import java.util.Date;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.util.Locale;




public class LogProcess implements ILogProcess
{
	IReader reads = new Reader();
	IParse parse = new Parse();
	IWriter write = new Writer();
	
	public void Process(String args[]) throws ParseException
	{
		
	    reads.input_from_file(args[0], logs);
	    parse.parse(logs, log);
     	 Date  fromDate = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss Z",Locale.US).parse("01/Jul/1995:00:00:12 -0400");
		 Date  toDate =   new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss Z",Locale.US).parse("01/Jul/1995:00:00:32 -0400"); 
        System.out.print("Report "+args[2]+"\n");
	    switch(args[2])
	    {
		    case "1" : 
		    {
		    	ISpecified_period_of_time <List<Map.Entry<String, Integer>>> rep1 = new Period_of_Time1();
		    	System.out.println(rep1.process(log, fromDate, toDate));
		    	break;
		    }
		    case "2" :
		    {
		    	ISpecified_period_of_time <Integer> rep2 = new Period_of_Time2();
		    	System.out.println(rep2.process(log, fromDate, toDate));
		    	break;
     	    }
		    case "3" :
		    {
		    	ISpecified_period_of_time <logs> rep3 = new Period_of_Time3();
		    	System.out.println(rep3.process(log, fromDate, toDate).getBytes() + " " + rep3.process(log, fromDate, toDate).getRequest());
		    	break;
		    }
			  default:{System.out.print("Error" );break;}

	    
	    }
	    
	    
    }
}
