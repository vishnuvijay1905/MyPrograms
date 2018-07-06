package bubblesort;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
class myCOMPARE implements Comparator
{
public int compare(Object obj1,Object obj2) {
	Integer str1=(Integer)obj1;
	Integer str2=(Integer)obj2;
	return -str1.compareTo(str2);
}
}
public class TreeMap1 {
public static void main(String args[]) {
	TreeMap map=new TreeMap(new myCOMPARE());
	map.put(100, "xxx");
	map.put(200, "vvv");
	map.put(95, "zzz");
	System.out.println(map);
	Set s1=(Set)map.entrySet();
	Iterator itr=s1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
