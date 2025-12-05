class Constructors{
    public static void main(String args[]){
        Person a = new Person("Yash", 19);
        System.out.println(a.name + " : " + a.age);
        Person b = new Person();
        System.out.println(b.name + " : " + b.age);

        // Constructors are basically specialised function which are called themselves when the object is being instantiated and this makes them really useful when we want initial initialization of any instance scope variables or perform some task when the new object is created they are of two type parameterized and non parameterized.

        // default constructor: when you provide no constructor java automatically provide no arguement, no parameter empty constructor that's why we use () parathesis with new obj().
    }
}

class Person{
    String name = "Lakshya";
    int age = 18;

    // No parameters normal constructor.
    Person(){
        System.out.println("Hello world! This is non- parameterized constructor");
    }
    // With parameters parameterised constructor.
    Person(String name, int age){
        System.out.println("Hello world! This is parameterized constructor");
        this.name = name;
        this.age = age;
    }
}