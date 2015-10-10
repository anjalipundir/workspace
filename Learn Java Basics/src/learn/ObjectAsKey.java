package learn;

import java.util.HashMap;


public class ObjectAsKey {

	public static void main(String args[]){
		
		HashMap<Employee, Employee> h = new HashMap<>(); 
		Employee e = new Employee(12,"Anjali","Pune","23");
		h.put(e,e);
		e = new Employee(14,"Anita","Chamba","45");
		h.put(e,e);
		e = new Employee(21,"Anita","Chamba","2323");
		h.put(e,e);
		e = new Employee(15,"Abhi","Dun","123");
		h.put(e,e); 
		
		//I want to say new ObjectAsKey(2) = new ObjectAsKey(2)  
		//Then I require to override hashcode and equals method
		System.out.println(h.get(new Employee("Anita","Chamba")).equals(new Employee("Anita","Chamba")));
		
		System.out.println((h.get(new Employee("Anita","Chamba")).getID()));
		
	}
	
	
}
