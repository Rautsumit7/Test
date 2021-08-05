package CollectionSet;

import java.util.*;

public class Task1 {
	public static void main(String[] args) {
		
		List<String>l=new ArrayList<>();
		
	    l.add("Abc");
	    l.add("ABC");
	    l.add("Abc");
	    l.add("ABC");
	    l.add("ABc");
	    l.add("Abc");
	    l.add("ABC");
	    
	    
	    System.out.println(l);
	    
	    Set<String>s=new HashSet<>(l);
	    
	    System.out.println(s);
	}
}
	
	
