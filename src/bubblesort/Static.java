package bubblesort;
class A
{
	static int a=5;
	int b=10;
	  static void withStaticClass() {
		  //b=20 we cannot call non static member inside a static method
		System.out.println("with the use of static at class name");
	}
}
class B {
	void withOutStaticClass()
	{
		System.out.println("without use of static for class name");
	}
}
public class Static {
public static void main(String args[]) {
    A.withStaticClass();
    B a=new B();
    a.withOutStaticClass();
    System.out.println(A.a);
    A.a=10;
    System.out.println(A.a);
}
}
