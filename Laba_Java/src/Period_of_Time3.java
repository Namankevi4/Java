import java.util.ArrayList;
import java.util.Date;


public class Period_of_Time3 implements ISpecified_period_of_time <logs>
{
	@Override
	public logs process(ArrayList<logs> list, Date  fromDate, Date toDate)
	{
		logs l = new logs();
		int max=0;
		for(logs element: list)
		{
			if(element.getTime().after(fromDate) && element.getTime().before(toDate)&&max<element.getBytes())
			{
				max = (int) element.getBytes();
				l = element;
			}
		}
		
		return l;
	}

}
