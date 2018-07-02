package bubblesort;

import java.util.Scanner;

public class Leader {
public static void main(String args[]) {
	int n,i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of n");
	n=sc.nextInt();
	int arr[]=new int[n];
	for(i=0;i<n;i++) {
		System.out.println("enter the input");
		arr[i]=sc.nextInt();
		for(j=0;j<i;j++) {
			if(arr[j]==arr[i]) {
				System.out.println("element "+arr[i]+" has been repeated");
				i=i-1;
			}
		}
	}
	float res;
	int count=0;
	int temp;
	//bubble sort logic
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-1;j++)
		{
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	for(i=0;i<n;i++)
	{
		System.out.println(arr[i]);
	}
	//leader logic
	for(i=0;i<n;i++)
	{
		count=0;
		for(j=0;j<n;j++) {
			res=arr[i]%arr[j];
			System.out.println(arr[i]+"  "+arr[j]+"   "+res);
			if(res==0)
			{
				count++;
			}
		}
		if(count>1) {
			System.out.println(arr[i]+" "+"is a leader");
		}
		else {
			System.out.println(arr[i]+" "+"is not a leader");
		}
	}
}
}
