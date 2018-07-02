package bubblesort;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorConcept {
public static void main(String args[]) {
	LinkedList<String> arr=new LinkedList<>();
	arr.add("balakrishna");
	arr.add("venkatesh");
	arr.add("nagarjuna");
	arr.add("chiranjivi");
	System.out.println(arr);
	String actor1="venkatesh";
	ListIterator<String> itr1=arr.listIterator();
	while(itr1.hasNext()) {
		String actor=itr1.next();
		System.out.println(actor);
		if(actor.equals(actor1)) {
			itr1.remove();
		}
	}
	System.out.println(arr);
    }
}
