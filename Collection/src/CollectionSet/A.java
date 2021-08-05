package CollectionSet;
import java.util.*;
public class A {
	public static void main(String[] args) {
		
	
	List<Integer>l=new ArrayList<>();
	
	    l.add(5);
	    l.add(3);
	    l.add(4);
	    l.add(6);
	    l.add(5);
	    l.add(3);
	    
	    System.out.println(l);
	    
	    Set<Integer>s=new LinkedHashSet<>(l);
	    
	    System.out.println(s);
	}
}
//  Remove duplicate