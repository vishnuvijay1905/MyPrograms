package bubblesort;
abstract class print{
	abstract void print1();
   void print() {
	   System.out.println("abstract hello");
   }
   int a;
	int b;
	print(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println(a);
		System.out.println(b);
	}
}
class new1 extends print{
	int c;
	new1(int a,int b,int c){
		super(a,b);
		this.c=c;
		System.out.println(c);
	}
	void print1()
	{
		System.out.println("abstarct methods");
	}
}
public class Abstract {
public static void main(String args[]) {
	new1 a=new new1(10,20,30);
	a.print();
	a.print1();
}
}
