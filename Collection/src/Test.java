import java.util.*;

public class Test {
	public static void main(String[] args) {
		
		List al=new ArrayList();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		al.add("ddd");
		System.out.println(al);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			System.out.println(s);
		}
		
	}
	

}
