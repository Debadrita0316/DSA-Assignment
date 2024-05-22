/*
Write a menu driven Java Program using class, methods and reference variables, to construct a doubly linked list consisting of the following information in each  node: student regd_no (int), mark secured in a subject (float).
 The class definition should be as follows:
 class Node
 {
 protected int regd_no;
 protected float mark;
 protected Node  next;
 protected Node prev;
 }
 The prototype of the create method should be as follows.
 public static Node create(Node start, Node end)
 Define the methods for each of the following operations to be supported by the above-linked list:
 a) The insertion operation
 i. At the beginning of the list
 Method Prototype: public static Node insBeg(Node start, Node end)
 ii. At the end of the list
 Method Prototype: public static Node insEnd(Node start, Node end)
 iii. At any position in the list
 Method Prototype: public static Node insAny(Node start, Node end)
b) The deletion operation
 i. From the beginning of the list
 Method Prototype: public static Node delBeg(Node start, Node end)
 ii. From the end of the list
 Method Prototype: public static Node delEnd(Node start, Node end)
 iii. From any position in the list
 Method Prototype: public static Node delAny(Node start, Node end)
 c)Search a node based on student regd_no and update the mark of the student. If the
 specified node is not present in the list an error message should be displayed.
 Method Prototype: public static void search(Node start)
d) Displaying all the nodes in the list
 The prototype of the display method should be as follows.
 public static void display(Node start, Node end)
The template for menu menu-driven java program to use the above list and invoke the required methods to perform different operations is given below.
 public class DLinkedList {
 public static Node create(Node start, Node end)
        {
        ...
        }
 public static void display(Node start, Node end)
     {
        ...
     }
 public static Node insBeg(Node start, Node end)
    {
      ...
    }
  // Code for the remaining user-defined methods//
      public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      while(true)
         {
                  System.out.println("****MENU*****");
                  System.out.println("0: Exit");
                  System.out.println("1: Creation");
                 System.out.println("2: Display");
                 System.out.println("Enter your choice");
                 int choice=sc.nextInt();
                 switch(choice)
                {
                   case 0:
                   System.exit(0);
                   case 1:
                   end=create(start,end);
                   break;
                   case 2:
                   display(start,end);
                  break;
                  default:
                 System.out.println("Wrong choice");
             }
        }
    }
 }
*/
import java.util.*;

class Node {

    protected int regd_no;

    protected float mark;

    protected Node next;

    protected Node prev;

}



public class DoubleLinkedList {

    public static Node start = null;

    public static Node end = null;



    public static Node create(Node start, Node end) {

        Scanner sc = new Scanner(System.in);

        Node q = null;

        char ch;



        do {

            Node p = new Node();

            System.out.println("Enter the registration number:");

            p.regd_no = sc.nextInt();

            System.out.println("Enter your marks:");

            p.mark = sc.nextFloat();

            p.next = null;

            p.prev = null;



            if (start == null) {

                start = p;

                end = p;

            } else {

                end.next = p;

                p.prev = end;

                end = p;

            }



            System.out.println("Do you want to create another node in the linked list? (Y/N)");

            ch = sc.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');



        return end;

    }



    public static void display(Node start, Node end) {

        if (start == null) {

            System.out.println("Empty LinkedList");

        } else {

            System.out.println("Registration no\tMarks");

            Node p = start;

            while (p != null) {

                System.out.println(p.regd_no + "\t\t" + p.mark);

                p = p.next;

            }

        }

    }



    public static Node insBeg(Node start, Node end) {

        Scanner sc = new Scanner(System.in);

        Node p = new Node();

        System.out.println("Enter the registration number:");

        p.regd_no = sc.nextInt();

        System.out.println("Enter your marks:");

        p.mark = sc.nextFloat();

        p.next = start;

        p.prev = null;

        

        if (start != null) {

            start.prev = p;

        } else {

            end = p;

        }



        start = p;

        System.out.println("Node added at the beginning.");

        return start;

    }



    public static Node insEnd(Node start, Node end) {

        Scanner sc = new Scanner(System.in);

        Node p = new Node();

        System.out.println("Enter the registration number:");

        p.regd_no = sc.nextInt();

        System.out.println("Enter your marks:");

        p.mark = sc.nextFloat();

        p.next = null;

        p.prev = end;



        if (end != null) {

            end.next = p;

        } else {

            start = p;

        }



        end = p;

        System.out.println("Node added at the end.");

        return end;

    }



    public static Node insAny(Node start, Node end) {

        Scanner sc = new Scanner(System.in);

        Node p = new Node();

        System.out.println("Enter the registration number:");

        p.regd_no = sc.nextInt();

        System.out.println("Enter your marks:");

        p.mark = sc.nextFloat();

        System.out.println("Enter position of new Node:");

        int pos = sc.nextInt();



        if (pos <= 0) {

            System.out.println("Position does not exist");

        } else if (start == null || pos == 1) {

            p.next = start;

            p.prev = null;

            if (start != null) {

                start.prev = p;

            } else {

                end = p;

            }

            start = p;

            System.out.println("Node added at first position");

        } else {

            Node q = start;

            for (int i = 1; i < pos - 1 && q.next != null; i++) {

                q = q.next;

            }

            if (q.next == null) {

                q.next = p;

                p.prev = q;

                p.next = null;

                end = p;

                System.out.println("Position not found, so new Node is added to last");

            } else {

                p.next = q.next;

                p.prev = q;

                q.next.prev = p;

                q.next = p;

                System.out.println("New Node added to position " + pos);

            }

        }

        return start;

    }



    public static Node delBeg(Node start, Node end) {

        if (start == null) {

            System.out.println("Empty LinkedList");

        } else {

            start = start.next;

            if (start != null) {

                start.prev = null;

            } else {

                end = null;

            }

            System.out.println("Node deleted from the beginning");

        }

        return start;

    }



    public static Node delEnd(Node start, Node end) {

        if (start == null) {

            System.out.println("Empty LinkedList");

        } else if (start.next == null) {

            start = null;

            end = null;

            System.out.println("Last Node deleted");

        } else {

            end = end.prev;

            end.next = null;

            System.out.println("Last Node deleted");

        }

        return start;

    }



    public static Node delAny(Node start, Node end) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter position you want to delete: ");

        int pos = sc.nextInt();



        if (start == null) {

            System.out.println("Empty LinkedList");

        } else if (pos == 1) {

            start = delBeg(start, end);

        } else {

            Node p = start;

            for (int i = 1; i < pos - 1 && p != null; i++) {

                p = p.next;

            }



            if (p != null && p.next != null) {

                p.next = p.next.next;

                if (p.next != null) {

                    p.next.prev = p;

                } else {

                    end = p;

                }

                System.out.println("Node deleted from position " + pos);

            } else {

                System.out.println("Position out of range");

            }

        }

        return start;

    }



    public static void search(Node start) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Registration No: ");

        int regNo = sc.nextInt();



        if (start == null) {

            System.out.println("Empty linkedList");

        } else {

            Node p = start;

            boolean found = false;

            while (p != null) {

                if (p.regd_no == regNo) {

                    System.out.println("Registration Found, Enter the updated Marks: ");

                    p.mark = sc.nextFloat();

                    found = true;

                    break;

                }

                p = p.next;

            }

            if (found) {

                System.out.println("Marks updated!");

            } else {

                System.out.println("Registration number not found.");

            }

        }

    }



    public static int count(Node start) {

        int c = 0;

        Node p = start;

        while (p != null) {

            c++;

            p = p.next;

        }

        return c;

    }



    public static Node reverse(Node start, Node end) {

        Node temp = null;

        Node current = start;



        while (current != null) {

            temp = current.prev;

            current.prev = current.next;

            current.next = temp;

            current = current.prev;

        }



        if (temp != null) {

            start = temp.prev;

        }



        System.out.println("Linked list reversed.");

        return start;

    }



    public static void sort(Node start) {

        if (start == null) {

            System.out.println("Empty linked list");

            return;

        }



        Node m = start;

        while (m.next != null) {

            Node q = start;

            while (q.next != null) {

                Node p = q.next;

                if (q.mark > p.mark) {

                    // Swap registration numbers

                    int reg = q.regd_no;

                    q.regd_no = p.regd_no;

                    p.regd_no = reg;



                    // Swap marks

                    float mark = q.mark;

                    q.mark = p.mark;

                    p.mark = mark;

                }

                q = q.next;

            }

            m = m.next;

        }

        System.out.println("Linked list sorted based on marks.");

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        Node start = null;

        Node end = null;



        while (true) {

            System.out.println("\nMenu:");

            System.out.println("0: Exit");

            System.out.println("1. Create");

            System.out.println("2. Display");

            System.out.println("3. Insert at Beginning");

            System.out.println("4. Insert at End");

            System.out.println("5. Insert at Any Position");

            System.out.println("6. Delete from Beginning");

            System.out.println("7. Delete from End");

            System.out.println("8. Delete from Any Position");

            System.out.println("9. Search and Update by Registration Number");

            System.out.println("10. Count Nodes in the Linked List");

            System.out.println("11. Sort the Linked List based on Marks");

            System.out.println("12. Reverse the Linked List");

            System.out.println("Enter your choice:");

            choice = sc.nextInt();



            switch (choice) {

                case 0:

                    System.exit(0);

                    break;

                case 1:

                    end = create(start, end);

                    if (start == null) {

                        start = end;

                    }

                    break;

                case 2:

                    display(start, end);

                    break;

                case 3:

                    start = insBeg(start, end);

                    break;

                case 4:

                    end = insEnd(start, end);

                    if (start == null) {

                        start = end;

                    }

                    break;

                case 5:

                    start = insAny(start, end);

                    break;

                case 6:

                    start = delBeg(start, end);

                    if (start == null) {

                        end = null;

                    }

                    break;

                case 7:

                    start = delEnd(start, end);

                    if (start == null) {

                        end = null;

                    }

                    break;

                case 8:

                    start = delAny(start, end);

                    if (start == null) {

                        end = null;

                    }

                    break;

                case 9:

                    search(start);

                    break;

                case 10:

                    System.out.println("Number of nodes: " + count(start));

                    break;

                case 11:

                    sort(start);

                    break;

                case 12:

                    start = reverse(start, end);

                    break;

                default:

                    System.out.println("Wrong Choice");

            }

        }

    }

}