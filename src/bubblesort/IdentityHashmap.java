package bubblesort;

import java.util.*;

public class IdentityHashmap {
public static void main(String args[])
{
	Integer i1=new Integer(10);
	Integer i2=new Integer(10);
	//HashMap m=new HashMap();
	IdentityHashMap m=new IdentityHashMap();
	m.put(i1, "vishnu");
	m.put(i2, "vijay");
	System.out.println(m);
}
}
