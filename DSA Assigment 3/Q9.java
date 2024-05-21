/* 
The sequence of numbers 1, 1, 2, 3, 5, 8, 13 etc are called Fibonacci numbers, each is the sum of the
preceding two. Write a recursive method in Java which, given n, returns the nth Fibonacci number.
*/

import java.util .*;
public class Q9{

    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter one number");
        int n = obj.nextInt();
        System.out.println("Fibonacci number at position " + n + " is " + fibonacci(n));
    }    

    public static int fibonacci(int n){

        if (n <= 1)
            return n;
        else
            return (fibonacci(n-1)+fibonacci(n-2));
    }

}