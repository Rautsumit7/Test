package CollectionSet;
import java.util.*;
public class Task2 {
	public static void main(String[] args) {
		
		List<Float>l=new ArrayList<>();
		
		
	    l.add(20f);
	    l.add(34.1f);
	    l.add(26.23f);
	    l.add(10f);
	    l.add(20.20f);
	    l.add(45f);
	    l.add(26.23f);
	    l.add(48f);
	    l.add(54f);
	    l.add(89f);
	    l.add(20f);
	    
	    System.out.println(l);
	    
	    Set<Float>s=new LinkedHashSet<>(l);
	   
	    
	    System.out.println(s);
	}

}
