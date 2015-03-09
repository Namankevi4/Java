import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
public class logs
{
    public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public int getReply() {
		return reply;
	}

	public void setReply(int reply) {
		this.reply = reply;
	}

	public int getBytes() {
		return bytes;
	}

	public void setBytes(int bytes) {
		this.bytes = bytes;
	}

	String host;
	
	Date time;
	
	String request;
	
	int reply;
		
	int bytes;
	String timePattern = "dd/MMM/yyyy:HH:mm:ss Z";	
	public void parse (String log) throws ParseException
	{
	   String str[] = log.split(" ", 4);
	   host = str[0];
	   String substr[] = str[3].split("[\\[\\]]", 3);
	   time = new SimpleDateFormat(timePattern, Locale.US).parse(substr[1]);
	   substr[2].trim();
	   request = substr[2].substring(2, substr[2].lastIndexOf('"'));
	   substr = substr[2].substring(substr[2].lastIndexOf('"')).split(" ");
       if (substr[1].equals("-"))
	   {
		   reply = 0;
       }
	   else
	  	   reply = Integer.parseInt(substr[1]);
	   if (substr[2].equals("-"))
	   {
		  bytes = 0;
	   }
	   else
		   bytes = Integer.parseInt(substr[2]);
    }
}
