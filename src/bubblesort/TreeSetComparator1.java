package bubblesort;

import java.util.Comparator;
import java.util.TreeSet;

class myComparator implements Comparator{
 public int compare(Object obj1,Object obj2) {
	 Integer var1=(int)obj1;
	 Integer var2=(int)obj2;
	 //descending order
	 if(var1<var2)
		 return +1;
	 else if(var1>var2)
		 return -1;
	 else 
		 return 0;
	  
	 //ascending order
	 //return var1.compareTo(var2);
	 
	 //decending order
	 //return -var1.compareTo(var2);
	 //return var2.compareTo(var1);
	 
	 //insertion order preserved and duplicates are allowed
	 //return +1;
	 
	 //reverse of insertion order
	 //return -1;
	 
	 //only first element
	 //return 0;
 }
}
public class TreeSetComparator1 {
	public static void main(String args[]) {
        TreeSet<Integer> tree1=new TreeSet(new myComparator());
        tree1.add(10);
        tree1.add(0);
        tree1.add(100);
        tree1.add(50);
        tree1.add(10);
        System.out.println(tree1);
	}
}
