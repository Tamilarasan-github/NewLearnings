package basics;

import java.util.HashMap;
import java.util.Map;

public class StaticConcept
{
	static Map<String, String> values=new HashMap<String, String>();
	
	static
	{
		values.put("Hi","1");
		System.out.println(values);
	}
	
	public static void main(String[] args)
	{
		
	}
	
}
