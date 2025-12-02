// A class named 'Class'
class Class {
    public static void main(String args[]) {
        // 'new Person()' creates a new object of the Person class (object instantiation)
        Person a = new Person();

        // Calling 'Person' class methods
        System.out.println(a.retName());
        System.out.println(a.retAge());
    }
}

// A class or Blueprint for creating Person objects
class Person {

    // Attributes (also called fields or properties) that store object data
    String name = "Lakshya";   // Attribute storing the person's name
    int age = 18;              // Attribute storing the person's age

    // Method that returns the 'name' attribute
    // 'this.name' refers to the current object's name field
    public String retName() {
        return this.name;
    }

    // Method that returns the 'age' attribute
    // 'this.age' refers to the current object's age field
    public int retAge() {
        return this.age;
    }
}