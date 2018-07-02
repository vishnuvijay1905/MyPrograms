package bubblesort;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
public static void main(String args[]) {
    LinkedList<Integer> l1=new LinkedList<>();
	//ArrayList<Integer> l1=new ArrayList<>();
	int element;
	for(int i=0;i<100;i++) {
		l1.add(i);
	}
	ListIterator<Integer> itr=l1.listIterator();
	while(itr.hasNext()) {
		element=itr.next();
		System.out.println(element);
		if(element==97)
		{
			long start=System.currentTimeMillis();
			itr.remove();
			itr.add(120);
			long end =System.currentTimeMillis();
			System.out.println(end-start);
		}
	}
	System.out.println(l1);
}
}
