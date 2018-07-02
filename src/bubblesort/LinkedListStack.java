package bubblesort;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListStack {
public static void main(String args[]) {
	LinkedList<String> l1=new LinkedList<>();
	l1.add("i");
	l1.add(" love");
	l1.add(" india");
	l1.add(" 005");
	System.out.println(l1);
	//stack implementation
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string to be added");
	String item=sc.next();
	l1.addLast(item);
	System.out.println(l1);
	String removed=l1.removeLast();
	System.out.println("removed is "+removed);
	System.out.println(l1);
	//queue implementation
	System.out.println("enter the string to be added");
    item=sc.next();
	l1.addLast(item);
	System.out.println(l1);
    removed=l1.removeFirst();
	System.out.println("removed is "+removed);
	System.out.println(l1);

}
}
