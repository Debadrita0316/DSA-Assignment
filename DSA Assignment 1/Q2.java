/*
The body mass index [BMI) is commonly used by health and nutrition professiomals to estimate human body
fat in populations. It is computed by taking the individual's weight [mass) in kilograms and dividing it
by the square of thetr height in neters. i.e.
Metric: BMI = Weight (kg)(Height)^2 (m^2)
Write a java program by using conditional statement to show the category for a given BMI.
 */


 import java.util.Scanner;
 public class Q2 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the weight of the person in kg : ");
         double  w = sc.nextDouble();
         System.out.println("Enter the height of the person in meter: ");
         double  h = sc.nextDouble();
         double  BMI =  w/(h*h);
         if(BMI<18.5){
             System.out.println("The person is underwight.");
         }else if(BMI<=24.9){
             System.out.println("The person is normal weight.");
         }else if (BMI<=29.9){
             System.out.println("The person is overweight.");
         }else{
             System.out.println("The person is obese.");
         }
         sc.close();
     }
     
 }