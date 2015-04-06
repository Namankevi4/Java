import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Period_of_Time1 implements ISpecified_period_of_time<List<Map.Entry<String, Integer>>>
{
	@Override
	public List<Map.Entry<String, Integer>> process(ArrayList<logs> list, Date  fromDate, Date toDate)
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(logs element: list)
		{
			if(element.getTime().after(fromDate) && element.getTime().before(toDate))
			{
				if(map.containsKey(element.getHost()))
				{
					map.put(element.getHost(), map.get(element.getHost())+1);
				}
				else
				{
					map.put(element.getHost(), 1);
				}
			}
		}
		List<Map.Entry<String, Integer>> list1 = new ArrayList<Map.Entry<String, Integer>>();
		list1.addAll(map.entrySet());
		
			
		Collections.sort(list1, new Comparator<Map.Entry<String, Integer>>()
				{
			         @Override
			         public int compare(Map.Entry<String, Integer> el1, Map.Entry<String, Integer> el2)
			         {
			        	 return el2.getValue().compareTo(el1.getValue());
			         }
		        });
		if(list1.size()>5)
		{
			while(list1.size()>5)
			{
				list1.remove(list1.size()-1);
			}
		}
		
		return list1;
	}

}
