package bubblesort;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
public static void main(String args[]) {
	Volume v1=new Volume(1,2,3);
	Volume v2=new Volume(4,5,6);
	v1.toString();
	System.out.println(v1);
	ArrayList<Volume>arr2=new ArrayList<Volume>();
	arr2.add(v1);
	arr2.add(v2);
	System.out.println(arr2.toString());
	ArrayList<Integer> arr=new ArrayList<Integer>();
	int i;
	arr.add(10);
	arr.add(15);
	arr.add(20);
	arr.add(25);
	arr.add(30);
	int n=arr.size();
	System.out.println(arr);
	arr.remove(3);
	System.out.println(arr);
	arr.remove(3);
	System.out.println(arr);
	//bulk operations
	ArrayList<Integer> arr1=new ArrayList<Integer>();
	arr1.add(10);
	arr1.add(15);
	arr1.add(35);
	System.out.println("arr1="+arr1);
	arr.removeAll(arr1);
	System.out.println("arr="+arr);
	System.out.println("arr1="+arr1);
	arr1.add(20);
	System.out.println("arr1="+arr1);
	arr.addAll(arr1);
	System.out.println("arr="+arr);
	System.out.println("arr1="+arr1);
	Iterator<Integer> iterator=arr1.iterator();
	while(iterator.hasNext()) {
		int element=iterator.next();
		System.out.println(element);
		if(element==35) {
			iterator.remove();
		}
	}
	System.out.println(arr1);
}
}
