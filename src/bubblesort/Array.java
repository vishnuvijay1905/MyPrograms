package bubblesort;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
public static void main(String args[])
{
	int n,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of n");
	n=sc.nextInt();
	int arr[]=new int[n];
	for(i=0;i<n;i++) {
		System.out.println("enter the input");
		arr[i]=sc.nextInt();
	}
	System.out.println("the inserted elements are");
	for(i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
	ArrayList arr1=new ArrayList(); 
	int choice=1;
	String item;
	while(choice!=0) {
		System.out.println("enter the choice value 0 to stop");
		choice=sc.nextInt();
		if(choice==0) {
			break;
		}
		System.out.println("enter the input");
		item=sc.next();
		arr1.add(item);
	}
	n=arr1.size();
	for(i=0;i<n;i++)
	{
		System.out.println(arr1.get(i));
	}
}
}
