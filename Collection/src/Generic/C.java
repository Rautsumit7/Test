package Generic;
import java.util.*;
public class C {
	public static void main(String[] args) {
		List<String>mh=new ArrayList<>();
		mh.add("pune");
		mh.add("nagpur");
		
		List<String>jh=new ArrayList<>();
		jh.add("Ranchi");
		jh.add("Lohardaga");
		
		List<List<String>>india=new ArrayList<>();
		
	    india.add(mh);
	    india.add(jh);
	    
	    Iterator<List<String>>itr=india.iterator();//---mh,jh
	    while(itr.hasNext())
	    {
	    	List<String>state=itr.next();
	    	
	    	Iterator<String>itr1=state.iterator();
	    	while(itr1.hasNext())
	    	{
	    		String city=itr1.next();
	    		System.out.println(city);
	    	}
	    }
	    
	}

}
