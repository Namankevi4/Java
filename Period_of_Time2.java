import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class Period_of_Time2 implements ISpecified_period_of_time <Integer>
{
	@Override
	public Integer process(ArrayList<logs> list, Date  fromDate, Date toDate)
	{
       int sum = 0;
		
		for(logs element: list)
		{
			if(element.getTime().after(fromDate) && element.getTime().before(toDate))
			{
				sum+=element.getBytes();
			}
		}
		return sum;
		
	}

}
