package importantJavaProgramms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistTraverse {

	public static void main(String[] args) {
		
		
		ArrayList<String> books=new ArrayList<String>();
		books.add("Math");
		books.add("Science");
		books.add("History");
		books.add("English");
		books.add("Geography");
		
		System.out.println("*****For Loop*****");
		
		for(int i=0;i<books.size();i++) {
			
			System.out.println(books.get(i));
		}
		
		
		System.out.println("*****Enhance For Loop*****");
		
		for(String eachbook:books) {
			
			System.out.println(eachbook);
		}
		
		System.out.println("*****Iterator*****");
		
		Iterator<String>itr=books.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		System.out.println("*****List Iterator******");
		
		ListIterator<String>Listitr=books.listIterator(books.size());
		
		while(Listitr.hasPrevious()) {
			
			System.out.println(Listitr.previous());
		}
		
		System.out.println("*****Java 8 lamda concept and for each remaining******");
		
		Iterator<String>itr1=books.iterator();
		itr1.forEachRemaining(eachbook ->{
			System.out.println(eachbook);
		});
		
		System.out.println("***** java 8 lamda concept and foreach******");
		books.forEach(each ->{
			System.out.println(each);
		});
		
	}

}
