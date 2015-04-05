import java.util.ArrayList;


public interface IWriter
{
	void output_in_file(ArrayList<logs> log, String filename);
	void output_some_string( ArrayList<logs> log, int numb_of_string, int count);
}
