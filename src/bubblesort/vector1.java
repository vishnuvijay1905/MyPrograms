package bubblesort;

import java.util.Vector;

public class vector1 {
public static void main(String args[]) {
	Vector<Integer>v1=new Vector<>();
	int i;
	for(i=0;i<10;i++) {
		v1.addElement(i);
	}
	System.out.println(v1);
	System.out.println(v1.capacity());
	v1.addElement(11);
	System.out.println(v1.capacity());
	System.out.println(v1);
	v1.removeElement(11);
	System.out.println(v1.capacity());
	System.out.println(v1);
}
}
