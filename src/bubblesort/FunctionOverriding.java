package bubblesort;

class p 
{
	//final void print()
    void print()
	{
		System.out.println("parent class");
	}
}
class c extends p
{
	 void print()
		{
		 super.print();
			System.out.println("child class");
		}		
}
public class FunctionOverriding {
	public static void main(String args[]) {
		c obj=new c();
		obj.print();
	}
}
//to prevent it we make use of final keyword