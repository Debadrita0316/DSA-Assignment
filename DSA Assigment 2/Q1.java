import java.util.*;

class person{

	   String name;

	   int age;

	   public void setData()

	   {

		   Scanner sc=new Scanner(System.in);

		   System.out.print("Enter name : ");

		   this.name=sc.nextLine();

		   System.out.print("\nEnter Age: ");

		   this.age=sc.nextInt();

		   sc.close();

	   }

	   public void displayData()

	   {

		   System.out.println(this.name+"\t"+this.age);

	   }

}

public class Q1 {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

        person ob1=new person();

        person ob2=new person();

        ob1.name="Rohan";

        ob1.age=20;

        ob2.setData();

        System.out.println("Personal information- \nName:  \tAge:");

        ob1.displayData();

        ob2.displayData();

        if(ob1.age<ob2.age)

        	{System.out.println(ob1.name+" is younger than "+ob2.name);}

        else

        	{System.out.println(ob2.name+" is younger than "+ob1.name);  }

	}



}
