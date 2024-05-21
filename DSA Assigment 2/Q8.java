import P1.*;

import P2.*;

//Separate class to Find grand total mark & score

public class Q8 extends Test implements Sports{



	public static void main(String[] args) {

		// Create a Test object

        Test ob= new Test();

        ob.inputDetails("Surajit Sahoo", 38); // Set student details

        ob.inputDetails(90, 95); // Set test marks

        ob.showDetails(); // Display student details and test marks

       // Calculate total marks

        int Totalmarks=ob.mark1+ob.mark2;

        System.out.println("Total Marks: " +Totalmarks);



        // Calculate total scores (from Sports interface)

        int Totalscores = score1 + score2;

        System.out.println("Total Scores: " +Totalscores);

	}



}