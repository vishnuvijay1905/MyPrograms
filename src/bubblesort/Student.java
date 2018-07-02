package bubblesort;

public class Student {
public int id;
public String name;
Student(int id,String name)
{
	System.out.println(id+"   "+name);
}
class apple{
	void hi()
	{
		System.out.println("hi");
	}
}
public static void main(String args[]) {
	Student s=new Student(1,"vishnu");
	apple a=s.new apple();
	a.hi();
}
}
