// Anonymous Inner classes:- these are the classes which are only created for one use purpose and are not declared with any name or class keyword

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Car BMW = new Car(){ // This is anonymous class
            public void drive(){
                System.out.println("BMW Drive");
            }
        };
        BMW.drive();

        Outer out = new Outer(){
            public void show(){
                System.out.println("Anonymouse class override");
            }
        };
        out.show();
    }
}

// They can also be used to declare abstract classes as their object are not possible to be declared.
abstract class Car{
    public abstract void drive();
    public void turn(){
        System.out.println("Turning");
    };
}

// They can also be used to override a function in our class.
class Outer{
    public void show(){
        System.out.println("Outer");
    }
}