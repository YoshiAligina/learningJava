package oops.part7;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapSample {
	public static void main(String[] args) 
	{

	}
	public static void TreeMap()
	{
		TreeMap<Integer, String> ob1 = new TreeMap<>();
		ob1.put(1, "India");
		ob1.put(2, "America");
		ob1.put(5, "Japan");
		ob1.put(4, "Canada");
		ob1.put(3, "China");
		ob1.put(-4, "UK");
		// Key, Value
		
		for(Map.Entry<Integer, String> entry : ob1.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
			
		// Does NOT allow null keys, but allows null values. 
		// Contains a value based on the key. 
		// It also maintains ascending order. 
	}
	public static void LinkedHashmap() 
	{
		LinkedHashMap<Integer, String> ob1 = new LinkedHashMap<>();
		ob1.put(1, "India");
		ob1.put(2, "America");
		ob1.put(5, "Japan");
		ob1.put(4, "Canada");
		ob1.put(3, "China");
		ob1.put(null, "UK");
		// Key, Value
		
		for(Map.Entry<Integer, String> entry : ob1.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		// It contains values based on the keys, and they keys have to be unique. 
		// Can have one null key, and multiple null values. 
		// It maintains insertion order
			
	}
	public static void Hashmap() 
	{
		HashMap<Integer, String> ob1 = new HashMap<>();
		
		ob1.put(1, "India");
		ob1.put(2, "America");
		ob1.put(5, "Japan");
		ob1.put(4, "Canada");
		ob1.put(3, "China");
		ob1.put(null, "UK");
		//ob1.put(null, null);
		// Key, Value
		
		for(Map.Entry<Integer, String> entry : ob1.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		// It contains values based on the keys, and they keys have to be unique. 
		// Can have one null key, and multiple null values. 
	}
}
