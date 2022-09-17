public class Employee implements Comparable<Employee> {		// implementing the Comparable class to  use compareTo method 

	String name;
	int age;
	double salary;
	int id;
	
	Employee(int id, String name, int age, double salary){	// Constructor of Employee class
		this.name = name;
		this.age = age;
		this.id = id;
		this.salary = salary;
	}

	@Override	
	public int compareTo(Employee emp) {					// overriding the compareTo method of Comparable class
		if(salary == emp.salary)
			return 0;
		else if(salary > emp.salary)
			return 1;
		else
			return -1;
	}
}