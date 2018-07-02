package bubblesort;

public class ConceptUnderstanding {
	static int a=1;
	int b=1;
	void print()
	{
		System.out.println("hi");
	}
	void print1()
	{
		print();
		System.out.println("hello");
	}
static void add()
{
	a=a+1;
	System.out.println(a);
}
void add1()
{
	b=b+1;
	System.out.println(b);
}
public static void main(String args[]) {
	a=10;
	add();
	add();
	add();
	ConceptUnderstanding a=new ConceptUnderstanding();
	a.b=10;
	a.add1();
	a.add1();
	a.add1();
	add();
	a.add1();
	a.print1();
}
}
