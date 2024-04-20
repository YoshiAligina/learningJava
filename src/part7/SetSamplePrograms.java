package oops.part7;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetSamplePrograms 
{
	public static void main(String[] args) 
	{

	}
	public static void TreeSetInt()
	{
		TreeSet<Integer> ob = new TreeSet<>();
		ob.add(5);
		ob.add(151345);
		ob.add(5355);
		ob.add(35);
		ob.add(6575456);
	//	ob.add(null);
	//	ob.add(null);
		
		System.out.println(ob);	
		
		// Does NOT allow null elements
		// It maintains default natural sorting order. ( ascending)
		// Internally uses treemap to store its element
	}
	
	public static void TreeSet()
	{
		TreeSet<String> ob = new TreeSet<>();
		ob.add("India.");
		ob.add("America");
		ob.add("Japan.");
		ob.add("UK.");
		ob.add("INDIA.");
	//	ob.add(null);
	//	ob.add(null);
		
		System.out.println(ob);	
		
		// Does NOT allow null elements
		// It maintains default natural sorting order. ( ascending)
		// Internally uses treemap to store its element
	}
	public static void HashSetProgram()
	{
		HashSet<String> ob = new HashSet<>();
		ob.add("India.");
		ob.add("America");
		ob.add("Japan.");
		ob.add("UK.");
		ob.add("INDIA.");
		ob.add(null);
		ob.add(null);
		System.out.println(ob);
		// Does NOT allow duplicates because of HashMap. But diff capitalizations have diff ASCII values. 
		// It has shuffled order of output. 
		// It contains unique elements only. 
		// Max of ONE null value. 
	}
	public static void LinkedHashSet()
	{
		LinkedHashSet<String> ob = new LinkedHashSet<>();
		ob.add("India.");
		ob.add("America");
		ob.add("Japan.");
		ob.add("UK.");
		ob.add("INDIA.");
		ob.add(null);
		ob.add(null);
		
		System.out.println(ob);
		
		// Difference between this and a regular hash set is that this maintains insertion order. 
		// And this uses a linkedhashmap to stare its elements. 
		// Max of one null element, 
	}
}

