package bubblesort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
class apple{
	apple(int a,int b)
	{
		System.out.println(a+"    "+b);
	}
}
public class TreeSet1 {
public static void main(String args[]) {
	ArrayList<apple>tree1=new ArrayList<>();
	tree1.add(new apple(10,20));
	tree1.add(new apple(30,40));
	tree1.add(new apple(50,60));
	tree1.add(new apple(70,80));
	Iterator<apple>itr1=tree1.iterator();
	while(itr1.hasNext()) {
	itr1.next();
	}
	TreeSet<String> tree=new TreeSet<>();
	tree.add("a");
	tree.add("A");
	tree.add("Z");
	tree.add("K");
	tree.add("L");
	Iterator<String>itr=tree.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	//A K L Z a they are sorted in ascending order according to their unicode value
	System.out.println("A".compareTo("Z"));
	System.out.println("Z".compareTo("A"));
	System.out.println("A".compareTo("A"));
}
}
