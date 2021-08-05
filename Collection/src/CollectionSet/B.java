package CollectionSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B {

	public static void main(String[] args) {
		
		
		List<Integer>l=new ArrayList<>();
		
		    l.add(5);
		    l.add(3);
		    l.add(4);
		    l.add(6);
		    l.add(5);
		    l.add(3);
		    
		    System.out.println(l);
		    
		    Collections.sort(l);
		    
		    System.out.println(l);
		    
}
}