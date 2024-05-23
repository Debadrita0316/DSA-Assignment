
package P1;



class Student {

    private String name;

        int roll;



    public void inputDetails(String Name, int Roll) 

    {

        this.name = Name;

        this.roll = Roll;

    }



   public void showDetails() 

    {

        System.out.println("Student Name: " + name);

        System.out.println("Roll Number: " + roll);

    }

}