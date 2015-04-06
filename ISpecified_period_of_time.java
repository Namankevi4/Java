import java.util.ArrayList;
import java.util.Date;

public interface ISpecified_period_of_time <T>
{
   T process(ArrayList<logs> list, Date  fromDate, Date toDate);
}
