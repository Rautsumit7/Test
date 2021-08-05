package Task2;
import java.util.*;


	public class B {
		public static void main(String[] args) {
			List al=new ArrayList();
			al.add(33.3);
			al.add(22.39d);
			al.add(19.03);
			al.add(97.23d);
			al.add(78.1);
			al.add(16d);
			
			Iterator itr=al.iterator();
			while(itr.hasNext())
			{
				double d=(double)itr.next();
				System.out.println(d);
			}
		}

}
