package bubblesort;

import java.util.*;

public class Hashmap {
public static void main(String args[]) {
	HashMap<Integer,String>map=new HashMap<>();
	map.put(2,"vijay");
	map.put(3,"surya");
	map.put(1, "vishnu");
	System.out.println(map);
	System.out.println(map.put(1, "VISHNU"));
	System.out.println(map);
	Set l1=map.entrySet();
	System.out.println(l1);
	Iterator itr=l1.iterator();
	while(itr.hasNext()) {
		Map.Entry a=(Map.Entry)itr.next();
		System.out.println("the id is "+a.getKey()+" the value is "+a.getValue());
		if(a.getKey().equals(1)) {
			a.setValue("vishnu");
		}
	}
	System.out.println(map);
}
}
