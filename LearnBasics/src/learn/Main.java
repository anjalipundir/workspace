package learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		HDTV tv1 = new HDTV(55, "Samsung");
		HDTV tv2 = new HDTV(60, "Sony Vaio");
 
		//Use of Comparable - Compare object of itself with some other object
		//Method - compareTo()
		if (tv1.compareTo(tv2) > 0) {
			System.out.println(tv1.getBrand() + " is better.");
		} else {
			System.out.println(tv2.getBrand() + " is better.");
		}
		
		
		//Use of Comparator - Compare object of itself with some other object
		//Method - compare()
		HDTV tvb1 = new HDTV(55, "Samsung");
		HDTV tvb2 = new HDTV(60, "Sony");
		HDTV tvb3 = new HDTV(42, "Panasonic");
 
		ArrayList<HDTV> al = new ArrayList<HDTV>();
		al.add(tvb1);
		al.add(tvb2);
		al.add(tvb3);
 
		Collections.sort(al, new SizeComparator());
		for (HDTV a : al) {
			System.out.println("comparator :"+a.getBrand());
		}
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(3);
		al1.add(1);
		al1.add(2);
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);
		
		Comparator<Integer> comparator = Collections.reverseOrder();
		Collections.sort(al1,comparator);
		System.out.println(al1);
		
		
		//Use of comparator :
		// With treeSet
		TreeSet<HDTV> d = new TreeSet<HDTV>(new SizeComparator()); // pass comparator
		d.add(new HDTV(1,"Samsung"));
		d.add(new HDTV(2,"Sony"));
		d.add(new HDTV(1,"Samsung"));
		
		//Use of Comparable - compareTo()
		TreeSet<HDTV> d1 = new TreeSet<HDTV>(); //Will sort acc to compareTo()
		d1.add(new HDTV(1,"Samsung"));
		d1.add(new HDTV(2,"Sony"));
		d1.add(new HDTV(1,"Samsung"));
				
	}
	
}