package bubblesort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class iteratorConcept{
	public static void main(String args[]) {
		ArrayList <Integer> arr=new ArrayList<>(); 
		for(int i=0;i<10;i++)
			arr.add(i);
		System.out.println("enter the element");
		Scanner sc=new Scanner(System.in);
		int element=sc.nextInt();
		System.out.println("choose an index from 0 to 9");
		int index=sc.nextInt();
		arr.add(index, element);
		System.out.println(arr);
		Iterator<Integer> itr =arr.iterator();
		while(itr.hasNext())
		{
			int next_element=itr.next();
			System.out.println(next_element);
			if(element==next_element) {
				itr.remove();
			}
		
			
		}
		System.out.println(arr);
	}
}
