package Generic;

import java.util.ArrayList;
import java.util.List;

public class D {
	
	public static void main(String[] args) {
		List<String>mh=new ArrayList<>();
		mh.add("pune");
		mh.add("nagpur");
		
		List<String>jh=new ArrayList<>();
		mh.add("Ranchi");
		mh.add("Lohardaga");
		
		List<List<String>>india=new ArrayList<>();
		
	    india.add(mh);
	    india.add(jh);
	    
	    for(List<String>state:india)
	    {
	    	for(String city:state)
	    	{
	    		System.out.println(city);
	    	}
	    }
	}
}
