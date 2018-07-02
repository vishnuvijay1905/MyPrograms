package bubblesort;
class newCalci{
public void div(int a, int b) {
		float res=a/b;
		System.out.println(res);
	}
}
class calci extends newCalci implements Interface{
int res;
	public void add(int a, int b) {
		res=a+b;
		System.out.println(res);
	}

	public void sub(int a, int b) {
		res=a-b;
		System.out.println(res);
	}
	public void mul(int a, int b) {
		res=a*b;
		System.out.println(res);
	}
	
}
public class Calculator {
public static void main(String args[]) {
	calci c=new calci();
	c.add(10, 20);
	c.sub(30, 10);
	c.mul(10, 20);
	c.div(30, 3);
}
}
