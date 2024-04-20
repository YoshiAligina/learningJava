package oops.part7;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListSample 
{
	public static void main(String[] args)
	{
		

	}
	
	public static void Vectors()
	{
		Vector<String> ob = new Vector<String>();
		
		ob.add("India");
		ob.add("China");
		ob.add("USA");
		
		System.out.println(ob); // Vectors are synchronizedd and they are slow because  they are thread safe.
	}
	public static void LinkedList()
	{
		LinkedList ob = new LinkedList<>();
		ob.add("india");
		ob.add("america");
		ob.add(100);
		ob.add(null);
		ob.add(100);
		ob.add(true);
		
		System.out.println(ob);
	
		// Lin ked list internally uses a doubly linked list to store the elements. 	
	}
	
	public static void arrayListPrograms()
	{
		String s[] = {"India","China","USA","UK"}; // Definition of an array, it can only be homogeneous on creation. 
		
		// They have a fixed size. 
		// Arrays are homogeneous, but we can add whatever. 
		
		System.out.println(s[0]);
		
		ArrayList ob = new ArrayList<>();
		
		ob.add("india");
		ob.add("america");
		ob.add(100);
		ob.add(null);
		ob.add(100);
		ob.add(true);
		
		ob.add(1,"Japan");
		ob.remove(3);
		
		System.out.println(ob.size());		

		System.out.println(ob);
		
		// Internally uses a dynamic array to store the elements.
		// Allows hetero insertion.
		// And allows duplicates
		// Null instertion is ALSO allowed.
		// In intesertion order.
	}
}
