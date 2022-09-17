import java.util.*;
public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();					// creating ArrayList of type Employee
		// Adding elements to ArrayList
		emp.add(new Employee(69,"Sanjay",41,60000));							
		emp.add(new Employee(109,"Ram",45,25000));
		emp.add(new Employee(526,"Shyam",21,28000));
		emp.add(new Employee(289,"Ravi",32,80000));
		emp.add(new Employee(105,"Anushka",53,100000));
		emp.add(new Employee(412,"Raj",38,55000));
		emp.add(new Employee(498,"Rohan",23,30000));
		
		
		// Using the Override method compareTo of Comparable class
		Collections.sort(emp);
		
		// Print using for each loop
		for(Employee e: emp) {													
			System.out.println(e.id+"\t"+ e.name+"\t"+e.age+"\t"+e.salary);
		}
	}

}