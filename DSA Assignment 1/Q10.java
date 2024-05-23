/*
 Write a method that returns the sum of all the elements in a specified column in a matrix
using the following header:
public static double sumColumn(double[][] m, int columnIndex)
Write a java program that reads a 3-by-4 matrix and displays the sum of each column.

Sample Run:
Enter a 3-by-4 matrix row by row:
1.5 2 3 4
5.5 6 7 8
9.5 1 3 1
Sum of the elements at column 0 is 16.5
Sum of the elements at column 1 is 9.0
Sum of the elements at column 2 is 13.0
Sum of the elements at column 3 is 13.0
*/

import java.util.*;
public class Q10 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double arr[][] = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                arr[i][j] = obj.nextDouble();

            }

        }
        System.out.println("3-by-4 matrix:");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

        }
        for(int k=0; k<4; k++)
            System.out.println("Sum of the elements at column "+ k+ " is "+ sumColumn(arr, k));
        obj.close();
    }

    public static double sumColumn(double[][] m, int columnIndex){
        double sum=0;
        for (int i=0; i<3; i++)
            for(int j=0; j<4; j++)
                if (j == columnIndex) {
                    sum += m[i][j];
                }
        return sum;        
    }   
}