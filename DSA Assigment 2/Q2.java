/*
Define a class called Complex with instance variables real, imag and instance methods
void setData(),
void display(),
public Complex add(Complex, Complex)
Write the main method in a separate class to implement the addition of two complex numbers with the given method signature as above. 
*/

import java.util.*;

class Complex {

    int real;int imag;

    void setData() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the real value: ");

        this.real = sc.nextInt();

        System.out.print("\nEnter the imaginary value: ");

        this.imag = sc.nextInt();

    }



    void display() 

    {

        System.out.println(this.real+"+"+this.imag+"i");

    }



    public Complex add(Complex c1, Complex c2) {

        Complex sum = new Complex();

        sum.real = c1.real + c2.real;

        sum.imag = c1.imag + c2.imag;

        return sum;

    }

}

public class Q2 {

    public static void main(String[] args) {

        Complex c1 = new Complex(); 

        c1.setData();

        Complex c2 = new Complex(); 

        c2.setData();

        System.out.print("First Number: ");

        c1.display();

        System.out.print("\nSecond Number: ");

        c2.display();

        System.out.print("Sum: ");

        Complex sum=c1.add(c1, c2);

        sum.display();

    }

}