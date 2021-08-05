package Task4;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		List<String>mh=new ArrayList<>();
		mh.add("pune");
		mh.add("mumbai");
		
		List<String>jh=new ArrayList<>();
		jh.add("Ranchi");
		jh.add("Ludhiyana");
		
		List<List<String>> india=new ArrayList<>();
		india.add(mh);
		india.add(jh);
		
		List<String>State1=new ArrayList<>();
		State1.add("City1");
		State1.add("City2");
		
		List<String>State2=new ArrayList<>();
		State2.add("City3");
		State2.add("City4");
		
		List<List<String>>USA=new ArrayList<>();
		USA.add(State1);
		USA.add(State2);
		
	   List<List<List<String>>>World=new ArrayList<>();
	   World.add(india);
	   World.add(USA);
	   
	   for(List<List<String>>country:World) //india USA
	   {
		 for(List<String>State:country)  //mh jh state1 stae2
		 {
			for(String City:State)
			{
				System.out.println(City); //
			}
		 }
	   }
		
		
		
		
		
		
	}

}
