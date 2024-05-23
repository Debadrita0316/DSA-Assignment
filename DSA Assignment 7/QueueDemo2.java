/*A Queue is implemented dynamically by using a Linked list where each node in the linked list has
two parts, the data element and the reference to the next element of the queue.

The class definition of Node is given below.

class Node
{
int info;
Node next;
}

The Queue elements can be integers, characters, strings or user defined types. There is no restriction
on how big the Queue can grow.

The operations to be performed on a Queue:

public static Node insert (Node rear, Node front) - adding an element x to the queue
Q requires creation of node containing x and putting it next to the rear and rear points to the newly
added element.
public static Node delete (Node rear, Node front) - deletes the front node from the
queue Q
public static void display (Node rear, Node front)-display all the elements of
the queue Q.

Write a menu driven Java Program using class, methods and list, to construct a Queue and
implement the above three operations.

The code template for constructing the above Queue and performing the required operation is
given below.

import java.util.Scanner;
public class QueueDemo2 {
public static Node insert(Node rear, Node front)
{
----
----

}
// Write the code for remaining user defined methods //
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Node rear,front;
    ---
    ---
    
    while(true)
    {
    System.out.println("****MENU****");
    System.out.println("0:Exit");
    System.out.println("1:Insert");
    System.out.println("2:Delete");
    System.out.println("3:Display");
    System.out.println("Enter your choice");
    int choice=sc.nextInt();
    switch(choice)
    {
    case 0:
    System.exit(0);
    case 1:
    front=insert(rear,front);
    ---
    break;
    case 2:
    front=delete(rear,front);
    ---
    break;
    
    ---
    default:
    System.out.println("Wrong choice");
    }
    }
    }
    } 
*/


import java.util.*;
class Node<T> 
{
	T info;
	Node<T> next;
	Node(T info)
	{
		this.info=info;
		this.next=null;
	}
}
public class QueueDemo2<T> 
{
	public static <T> Node<T> insert(Node<T> rear, Node<T> front)
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the value to insert in Queue : ");
        T element=(T) obj.next();
		Node n = new Node<T>(element);
		if(rear==null || front==null)
        {
			front =n;
            rear= n;
        }
		else
		{
			rear.next=n;
			rear=n;
		}
		return front;        
	}
	public static <T> Node<T> delete(Node<T> rear, Node<T> front)
	{
		if(front==null)
			System.out.println("Empty Queue,Nothing to Delete...");
		else
		{
            System.out.println(front.info+" is deleted...");
			front=front.next;
		}
		return front;
	}
	public static <T> void display(Node<T> rear, Node<T> front)
	{
		Node<T> n = front;
		if(n==null)
			System.out.println("Queue is Empty...");
		else
		{
			System.out.println("Elements of Queue are : ");
			while(n!=null)
			{
				System.out.print(n.info+" <- ");
				n=n.next;
			}
            System.out.println();
		}
	}
	public static<T> Node<T> getRear(Node<T> front)
	{
		if(front==null)
		{
			return null;
		}
		else
		{
			Node<T> n = front;
			while(n.next!=null)
			{
				n=n.next;
            }
			return n;
		}
	}
    public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		Node<Object> front=null, rear=null;
		
		while(true)
		{
			System.out.println("****MENU****");
			System.out.println("0 : Exit");
			System.out.println("1 : Insert");
			System.out.println("2 : Delete");
			System.out.println("3 : Display");
			System.out.println("Enter your Choice: ");
			int choice=obj.nextInt();
			switch(choice)
			{
				case 0:
					System.exit(0);
                    System.out.println("Thank you...");
					break;
				case 1:
					front=insert(rear, front);
					rear=getRear(front);
					break;
				case 2:
					front=delete(rear, front);
					break;
				case 3:
					display(rear, front);
					break;
				default:
					System.out.println("Wrong Choice");
			}
		}
	}
}