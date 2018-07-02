package bubblesort;

import java.util.Comparator;
import java.util.TreeSet;

class employee implements Comparable{
	int id;
	String name;
	public String toString()
	{
		return id+"    "+name;
	}
	employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	public int compareTo(Object obj) {
		employee e1=(employee)obj;
		int id1=e1.id;
		 int id2=this.id;//obj1.compareTo(obj2);  obj2 is obj which is already inserted
		 //obj1 is is reffered through this.id which is current object
		 if(id1>id2)
			 return -1;
		 else if(id1<id2)
			 return +1;
		 else
		return 0;
	}
}
class comp implements Comparator{
	public int compare(Object obj1,Object obj2) {
		employee e1=(employee)obj1;
		employee e2=(employee)obj2;
		Integer id1=e1.id;
		Integer id2=e2.id;
		return -id1.compareTo(id2);
	}
}
public class TreeSetClasses {
	public static void main(String args[]) {
		employee e1=new employee(10,"vishnu");
		employee e2=new employee(1,"vijay");
		employee e3=new employee(15,"venkatesh");
		//default natural sorting order
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		System.out.println(t);
		//customized sorting order based on id in descending order
		TreeSet t1=new TreeSet(new comp());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		System.out.println(t1);
	}

}
