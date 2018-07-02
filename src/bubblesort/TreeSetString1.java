package bubblesort;

import java.util.Comparator;
import java.util.TreeSet;

class myComparator1 implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String var1=obj1.toString();
		String var2=obj2.toString();
		return -var1.compareTo(var2);
	}
}
public class TreeSetString1 {
public static void main(String args[]) {
	TreeSet<String> t=new TreeSet<>(new myComparator1());
	t.add("hello");
	t.add("apple");
	t.add("i");
	t.add("love");
    t.add("india");
    System.out.println(t);
    //for string buffer
    TreeSet<StringBuffer> t1=new TreeSet<>(new myComparator1());
	t1.add(new StringBuffer("hello"));
	t1.add(new StringBuffer("apple"));
	t1.add(new StringBuffer("i"));
	t1.add(new StringBuffer("love"));
    t1.add(new StringBuffer("india"));
    System.out.println("for string buffer the value is "+t1);
}
}
