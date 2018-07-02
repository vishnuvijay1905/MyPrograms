package bubblesort;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {
public static void main(String args[]) {
	HashSet<String> hash1=new HashSet<>();
	String item=null;
	int choice=1;
	Scanner sc=new Scanner(System.in);
	//Boolean val=true;
	while(choice!=0)
	{
		System.out.println("enter the choice 0 to quit");
		choice=sc.nextInt();
		if(choice==0) {
			break;
		}
		System.out.println("enter the string");
		item=sc.next();
		 if(hash1.add(item)==true)
	    {
	    	System.out.println("element added");
	    }
	    else {
	    	System.out.println("duplicates are not allowed");
	    }
	}
	System.out.println(hash1);
	System.out.println(hash1);
	HashSet<Integer>h2=new HashSet<>();
	int i;
	System.out.println("capacity="+h2.size());
	for(i=0;i<12;i++) {
		h2.add(i);
	}
	System.out.println(h2);
	System.out.println("capacity="+h2.size());
}
}
