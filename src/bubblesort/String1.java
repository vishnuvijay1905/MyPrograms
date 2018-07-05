package bubblesort;

public class String1 {
public static void main(String args[]) {
	String s1=new String("vishnu");
	s1.concat("vijay");
	System.out.println("output from string is : "+s1);
	StringBuffer s=new StringBuffer("vishnu");
	s.append("vijay");
	System.out.println("output from string buffer : "+s);
	String a1=new String("vishnu");
	String a2=new String("vishnu");
	System.out.println(a1==a2);
	System.out.println(a1.equals(a2));
	}
}
