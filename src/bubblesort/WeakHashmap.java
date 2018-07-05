package bubblesort;

import java.util.*;

class temp{
	public String toString()
	{
		return "HI";
	}
	public void finalize()
	{
		System.out.println("do some operation before death");
	}
}
public class WeakHashmap {
public static void main(String args[]) throws InterruptedException {
	temp t=new temp();
	//HashMap m=new HashMap(); //remove comments to notice the difference
	WeakHashMap m=new WeakHashMap();
    m.put(t, "vishnu");
    System.out.println(m);
    t=null;
    System.gc();
    Thread.sleep(5000);
    System.out.println(m);
}
}
