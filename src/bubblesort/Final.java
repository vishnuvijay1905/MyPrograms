package bubblesort;
 final class hello{
	 final int a=13;
    void hello() {
    	
		System.out.println("hello");
	}
}
//class welcome extends hello{//this is not possible because class is final so when class is final inheritance
                              //concept is not supported
class welcome{
	void welcome() {
		hello hi=new hello();
		hi.hello();
		System.out.println("welcome");
	}
}
public class Final {
	public static void main(String args[]) {
		welcome wel=new welcome();
		wel.welcome();
	}

}
