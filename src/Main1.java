import java.util.*;
import java.util.stream.Collectors;


public class Student {                             //class Student

	public static void main(String[] args) {            //main method
		// TODO Auto-generated method stub
		 List<student> stud=new ArrayList();             //ArrayList object created
		 
		 //Add values in arraylist
	     stud.add(new student(1,"Radha",20,95));
	     stud.add(new student(2,"Kartik",21,68));
	     stud.add(new student(3,"Rajani",20,66.5));
	     stud.add(new student(4,"Sanjay",23,85));
	     stud.add(new student(5,"Kajal",22,76));
	     
	     //condition to filter marks b/w 60 to 80
	     List<Double> stud1=stud.stream().filter(x->x.marks>60&&x.marks<80).map(x->x.marks).collect(Collectors.toList());
	     
	     System.out.println("Student math marks: "+stud1);    //print maths marks
	     
	}//end of main

}//end of program
