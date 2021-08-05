package CoolectionDay2;
import java.util.*;
public class B {
	public static void main(String[] args) {
		List mh=new ArrayList();
		
		mh.add("pune");
		mh.add("mumbai");
		mh.add("nagpur");
		
		List jh=new ArrayList();
		
		jh.add("Ranchi");
		jh.add("lohardaga");
		
		List india=new ArrayList();
		
		  india.add(mh);
		  india.add(jh);
		  
		  Iterator itr=india.iterator();//---mh,jh
		  
		  while(itr.hasNext())//------------1.true                 2.true
			  {
			  List l=(List)itr.next();//---mh                        jh
			  Iterator itr1=l.iterator();//---(pune,mumbai,nagpur)   Ranchi,lohardaga
			  
		  
		  while(itr1.hasNext())//--------1.true 2.T 3.T 4.F           1.true 2.T 3.False
		  {
		  String city=(String)itr1.next();//pune,mumbai,nagpur         Ranchi, lohardaga
		 System.out.println(city);
		  }
		
			  }
		
		
	}

}
