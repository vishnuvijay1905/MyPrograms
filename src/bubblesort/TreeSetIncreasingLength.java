package bubblesort;

import java.util.Comparator;
import java.util.TreeSet;

class myComp implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		Integer l1=s1.length();
		Integer l2=s2.length();
		if(l1==l2)
			return s1.compareTo(s2);
		return l1.compareTo(l2);
	}
}
public class TreeSetIncreasingLength {
	public static void main(String args[]) {
		TreeSet t1=new TreeSet(new myComp());
		t1.add("A");
		t1.add(new StringBuffer("ABC"));
		t1.add(new StringBuffer("AA"));
		t1.add("XX");
		t1.add("ABCD");
		t1.add("A");
		System.out.println(t1);
	}
}
