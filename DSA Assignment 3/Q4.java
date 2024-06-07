/* Write a simple main class in Java that contains an experiment that uses the generic Box<T>
class to build boxes with different types and that verifies that this class works as advertised.
Your experiment should include the following:
 Create a boxed String object and two variables that refer to that box. Change the contents
of one and determine the effect on the other.
 Create a boxed Integer object and two variables that refer to that box. Change the
contents of one and determine the effect on the other.
 Create a boxed Object object and two variables that refer to that box. Determine what
happens if you put a string in the box. Determine what happens if you put an integer in
the box.
*/
class Box <T>{
    private T t ;
    Box(T a ) {
        t = a;
    }
    public void set(T t ){
        this.t =t ;
    }
    public T get(){
        return t;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Box <String> sB1 = new Box <> ("Welcome");
        Box <String> sB2 = sB1;
        System.out.println("Before: "+ sB1.get());
        System.out.println("Before: "+ sB2.get());
        sB1.set("Hello");
        System.out.println("After: "+ sB1.get());
        System.out.println("After: "+ sB2.get());

        Box<Integer> iB1 = new Box<>(10);
        Box <Integer> iB2 = iB1;
        System.out.println("Before: "+ iB1.get());
        System.out.println("Before: "+ iB2.get());
        iB1.set(20);
        System.out.println("After: "+ iB1.get());
        System.out.println("After: "+ iB2.get());

        Box <Object> obj1 = new Box <> ("Hi");
        Box <Object> obj2 = obj1 ;
        System.out.println("Before: "+ obj1.get());
        System.out.println("Before: "+ obj2.get());
        obj1.set(15);
        System.out.println("After: "+ obj1.get());
        System.out.println("After: "+ obj2.get());
        obj1.set("Hello");
        System.out.println("After: "+ obj1.get());
        System.out.println("After: "+ obj2.get());    }
}