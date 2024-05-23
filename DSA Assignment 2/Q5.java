/*Define a base class Person with instance variable name, age. The instance variables are initialized through constructors. The prototype of constructor is as below. 
                                                          Person (string, int) 
Define a derived class Employee with instance variables Eid, salary. The instance variables are initialized through constructors. The prototype of the constructor is as below. 
                                                Employee (string, int, int, double)
Another instance method of Employee class is empDisplay() to display the information of employee details.
*/

import java.util.*;

class Person{

	  String name;

	  int age;

	  public Person(String name,int age) {

		  this.name=name;

		  this.age=age;

	  }

}

class Employee extends Person{

	  int Eid;

	  double salary;

	  public Employee(String name,int age,int Eid,double salary) {

		  super(name,age);

		  this.Eid=Eid;

		  this.salary=salary;

	  }

      public void empDisplay() {

           System.out.println("Employee ID: " + this.Eid);

           System.out.println("Name: " + this.name);

           System.out.println("Age: " + this.age);

           System.out.println("Salary: " + this.salary);

      }

}

public class Q5 {



	public static void main(String[] args) {

		

		Scanner sc=new Scanner(System.in);

	    System.out.println("Enter Employee Id: ");

		int eid=sc.nextInt();

		System.out.println("Enter Name: ");

		String Name=sc.next();

		System.out.println("Enter Age: ");

		int Age=sc.nextInt();

		System.out.println("Enter Salary: ");

		double Salary=sc.nextDouble();

		Employee ob=new Employee(Name,Age,eid,Salary);

		ob.empDisplay();

	}

}