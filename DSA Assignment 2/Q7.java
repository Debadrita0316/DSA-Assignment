/* 
Define an interface DetailInfo to declare methods display( ) & count(). Another class Person contains a 
static data member maxcount, instance member name & method display( ) to display name of a person, count 
the no. of characters present in the name of the person.
*/

interface DetailInfo{

	      void display();

	      void count();

}

class Person3 implements DetailInfo

{

	String name;

	static int maxCount;

	public Person3(String name)

	{

		this.name=name;

	}

	public void count()

	{

		maxCount=this.name.length();

	}

	public void display()

	{

		System.out.println("Name: "+name+"\nNumber of characters present in the name= "+maxCount);

	}

}

public class Q7 {



	public static void main(String[] args) {

        Person3 ob=new Person3("Surajit");

        ob.count();

        ob.display();

	}



}