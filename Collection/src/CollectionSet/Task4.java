package CollectionSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4 {
	public static void main(String[] args) {
		List<Integer>l=new ArrayList<>();
		
	    l.add(20);
	    l.add(34);
	    l.add(26);
	    l.add(10);
	    l.add(20);
	    l.add(45);
	    l.add(26);
	    l.add(48);
	    l.add(10);
	    l.add(45);
	    l.add(54);
	    l.add(89);
	    l.add(20);
	    
	    System.out.println(l);
	    
	    Collections.sort(l);
	    
	    System.out.println(l);
	    
}
	}


