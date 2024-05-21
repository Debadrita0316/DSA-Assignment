package P1;



public class Test extends Student{

	 public int mark1;

     public int mark2;



    public void inputDetails(int m1, int m2) {

        this.mark1 = m1;

        this.mark2 = m2;

    }



    public void showDetails() {

        super.showDetails();

        System.out.println("Test Marks: \nMark 1= " + mark1 + ", Mark 2= " + mark2);

    }

}