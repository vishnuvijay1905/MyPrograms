package bubblesort;

import java.util.HashSet;
import java.util.Set;

class author{
	int id;
	String name="vishnu",title;
	public author(int id, String name, String title) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
	}
	public String toString() {
		return "author [id=" + id + ", name=" + name + ", title=" + title + "]";
	}
	
}
public class HashMap1 {
public static void main(String args[]) {
	author a=new author(1,"vishnu","the world");
	author b=new author(2,"vijay","the universe");
	HashSet<author> hash=new HashSet<>();
	 hash.add(a);
	 hash.add(b);
	 System.out.println(hash.toString());
	
}
}
