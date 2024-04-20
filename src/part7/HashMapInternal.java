package oops.part7;
import java.util.HashMap;

class Key 
{
	String key;
	
	public Key(String key)
	{
		super(); // It will call object
		this.key = key;
		//System.out.println("Default ");
		//This is a constructor it has no return type, it is called automatically.
		// Object is the superclass for all object.
	}
	
	@Override
	public int hashCode()
	{
		System.out.println("Hashcode "+ (int)key.charAt(0));
		return (int)key.charAt(0);
		
		// This is a method of object.
	}
	@Override
	public boolean equals(Object obj)
	{
		System.out.println("Equals "+ ((Key)obj).key);
		return key.equals(((Key)obj).key);
	}
}
public class HashMapInternal 
{
	public static void main(String[] args) 
	{
		HashMap<Key, Integer> map = new HashMap<>();
		map.put(new Key("India"), 1);
		map.put(new Key("America"), 2);
		
		System.out.println((Integer) map.get(new Key("America")));
	}
}
