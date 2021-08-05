package Generic;
import java.util.*;
public class B {
	public static void main(String[] args) {
		
       List<Integer>l=new ArrayList<>();
		
		l.add(5);
		l.add(20);
		l.add(30);
		l.add(40);
		//list.add("String");  //--compile time error class cast problem at run time
	
	     Iterator<Integer> itr=l.iterator();
	     while(itr.hasNext())//true ,false
	     {
	    	 int x=itr.next();//-----type cast not require becoz of generic
	    	 System.out.println(x);
	     }
	}
}
