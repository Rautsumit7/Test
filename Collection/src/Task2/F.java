package Task2;
import java.util.*;
public class F {
	public static void main(String[] args)
	{
		List list=new ArrayList();
		//add
		list.add("abc");  //0
		list.add("pqr");  //1
		list.add(12);     //2
		list.add(11);     //3
		list.add(12);
		list.add(3,1111);
		System.out.println("Original:------------- "+list +"-----------------------");
		
		
		/*//addAll
		List list2=new ArrayList();
		list2.add(list);
		list2.add(10);
		System.out.println("Using add: "+ list2);*/
		
		/*List list3=new ArrayList();
		list3.addAll(list);
		System.out.println("Using addAll: "+list3);*/
		
		
		//get
		//System.out.println("Using get at 2th index: "+list.get(2));
		
		
		/*//remove
		list.remove(2);
		System.out.println("Using remove at 2th index: "+list);*/
		
		
		/*//set
		list.set(1, 4500);
		System.out.println("Using set at 1st index: "+list);*/
		
		
		/*//indexOf
		System.out.print("index of 12: ");
		System.out.println(list.indexOf(12));
		
		//lastIndexOf
		System.out.print("lastindex of 12: ");
		System.out.println(list.lastIndexOf(12));*/
			
/*//contains
		System.out.print("contains of 12: ");
		System.out.println(list.contains(12));*/
		
		
		/*//size
		System.out.print("Size of original list: ");
		System.out.println(list.size());*/
		
		
		//toString
		//System.out.println(list.toString());
	}


}
