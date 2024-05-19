/*Define a class Deposit. The instance variable of the class Deposit are mentioned below.
Instance Variable              Data Type
 Principal                       Long
 Time                            Integer 
 Rate                            Double 
 TotalAmt                        Double

Initialize the instance variables Principal, Time, rate through constructors. Constructors are overloaded with the following prototypes. 
Constructor1: Deposit ( ) 
Constructor2: Deposit (long, int, double) 
Constructor3: Deposit (long, int) 
Constructor4: Deposit (long, double) 
Apart from constructor, the other instance methods are 
(i) display ( ): to display the value of instance variables, 
(ii) calcAmt( ): to calculate the total amount. 
      totalAmt = Principal + (Principal x Rate x Time)/100;
*/

class Deposit{

	  long principal;

	  int time;

	  double rate, totalAmt;

	  public Deposit()

	  {

		  this.principal = 0;

	      this.time = 0;

	      this.rate = 0.0;

	      this.totalAmt = 0.0;

	  }

	  public Deposit(long principal, int time, double rate) {

	        this.principal = principal;

	        this.time = time;

	        this.rate = rate;

	        calcAmt();

	    }

	    public Deposit(long principal, int time) {

	        this.principal = principal;

	        this.time = time;

	        this.rate=7.1; //own input

	        calcAmt();

	    }

	    public Deposit(long principal, double rate) {

	        this.principal = principal;

	        this.time=2; //own input

	        this.rate = rate;

	        calcAmt();

	    }



	    void display() {

	        System.out.println("Principal: " +principal);

	        System.out.println("Time: " + time + " years");

	        System.out.println("Rate: " + rate + "%");

	        System.out.println("Total Amount: " +totalAmt);

	    }

	    void calcAmt() {

	        this.totalAmt = principal+(principal * rate * time)/100;

	    }

}

public class Q4 {

	public static void main(String[] args) {

	   Deposit deposit1 = new Deposit(10000, 5,7.1);

       Deposit deposit2 = new Deposit(20000, 2);

       Deposit deposit3 = new Deposit(5000,5.3);



       System.out.println("Deposit 1:");

       deposit1.display();



       System.out.println("\nDeposit 2:");

       deposit2.display();



       System.out.println("\nDeposit 3:");

       deposit3.display();

	}



}
