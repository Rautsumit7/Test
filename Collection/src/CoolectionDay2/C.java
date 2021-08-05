package CoolectionDay2;
import java.util.*;
public class C {
	public static void main(String[] args) {
		List l=new ArrayList();
		
		l.add(34);
		l.add("abc");
		l.add('m');
		l.add("xyx");
		l.add(45);
		l.add('A');
		
		Iterator itr=l.iterator();
		
		while(itr.hasNext())
		{
			Object o=itr.next();
		
		if(o instanceof Integer)    
		{
			int x=(int)o;
			System.out.println(x);  
		}
		else if(o instanceof String)
		{
			String s=(String)o;
			System.out.println(s); 
		}
		else if(o instanceof Character)
		{
			char c=(char)o;
			System.out.println(c); 
		}
	}
	
	}
	}	
