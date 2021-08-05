package CoolectionDay2;
import java.util.*;
public class A {
  public static void main(String[] args) {
	List l=new ArrayList();
	l.add(5);
	l.add("aaa");
	l.add(20);
	l.add("bbb");
	l.add(40);
	
	Iterator itr=l.iterator();
	
	while(itr.hasNext())
	{
		Object o=itr.next();
	
	if(o instanceof Integer)    
	{
		int x=(int)o;
		System.out.println(x);  //5   20     40
	}
	else if(o instanceof String)
	{
		String s=(String)o;
		System.out.println(s); //  aaa   bbb
	}
	}	
}
}
