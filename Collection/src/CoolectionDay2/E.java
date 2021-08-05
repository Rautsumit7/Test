package CoolectionDay2;
import java.util.*;
public class E {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(73.30f);
		l.add(256.39d);
		l.add(11);
		l.add(77l);
		l.add(79.10);
		l.add(87d);
		l.add(58l);
		
Iterator itr=l.iterator();
		
		while(itr.hasNext())
		{
			Object o=itr.next();
		
		if(o instanceof Integer)    
		{
			int x=(int)o;
			System.out.println(x);  
		}
		else if(o instanceof Long)
		{
			long i=(long)o;
			System.out.println(l); 
		}
		else if(o instanceof Double)
		{
			double d=(double)o;
			System.out.println(d); 
		}
		else if(o instanceof Float)
		{
			float f=(float)o;
			System.out.println(f); 
		}
		
		
	}
	}
}
