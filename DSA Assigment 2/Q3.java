/*
In a super market each product is having minimum details like prodId, price, quantity that is used during 
the biling process. Keeping this in mind prepare a class named as Product having the member variables
    prodId, price, quantity
a static variable totalPrice
Initialize the value of product through parameterized constructor. It consists of a display() method to 
display the value of instance variables. A person went to market and purchase 5 different products. 
Using the above mentioned class, display the details of products that the person has purchased. Also, 
determine how much total amount the person will pay for the purchase of 5 products. 
*/

import java.util.*;

class Product {

      int prodId,price,quantity;

      static int totalPrice;

      public Product(int pId, int P, int Q) {

    	  this.prodId=pId;

    	  this.price=P;

    	  this.quantity=Q;

    	  this.totalPrice += this.price;

      }

     public void display() 

     {

        System.out.println(prodId+"\t    "+price+"\t   "+quantity);

     }

}

public class Q3 {

    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);

       System.out.print("Enter quantity of product : ");

       int n=sc.nextInt();

       Product P[]=new Product[n];

       for(int i=0;i<n;i++) {

    	   System.out.println("Enter Product ID, price and Quantity");

    	   int pid=sc.nextInt();

    	   int p=sc.nextInt();

    	   int q=sc.nextInt();

    	   P[i]=new Product(pid,p,q);

       }

       System.out.println("Product Id\tprice\tquantity ");

       for(int i=0;i<n;i++) {

    	   P[i].display();

       }

       System.out.println("Total Price: "+Product.totalPrice);

       sc.close();

    }

}

    