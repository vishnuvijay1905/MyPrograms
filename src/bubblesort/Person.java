package bubblesort;
class persons{
	int age;
	String name;
	persons(int age,String name){
		this.age=age;
		this.name=name;
	}
	 void show1()
	{
		System.out.println(age);
	}
	}
class student extends persons{
	int id;
	int marks;
	student(int age,String name,int id,int marks){
		super(age,name);
		this.id=id;
		this.marks=marks;
	}
	void show()
	{
		System.out.println(id+"  "+name+"   "+age+"   "+marks);
	}
	
}
public class Person {
	void hi(){
		System.out.println("hi");
	}
	public static void main(String args[]) {
		Person p=new Person();
		p.hi();
	student s=new student(22,"vishnu",124,76);
	s.show();
	s.show1();
}
}
