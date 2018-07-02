package bubblesort;

import java.util.Scanner;
import java.util.Stack;

class Stack1 {
	 int convert_offset_to_index(int offset,int size) {
		int index;
		index=size-offset;
		return index;
	}
public static void main(String args[]) {
	Stack1 s1=new Stack1();
	Stack<Integer>v1=new Stack<>();
	int i;
	for(i=0;i<10;i++) {
		v1.push(i);
	}
	System.out.println(v1);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the element to be searched");
	int element=sc.nextInt();
	int offset=v1.search(element);
	if(offset!=-1) {
	int size=v1.size();
	System.out.println(offset+"     "+size);
	int index=s1.convert_offset_to_index(offset, size);
	System.out.println("the element "+element +" is found at position "+index);
	}
	else {
		System.out.println("element not found");
	}
}
}
