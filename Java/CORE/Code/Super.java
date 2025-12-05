// Super:- Super is used when you are working with inheritance, it points to parent class.

class Super {
    public static void main(String[] args) {
        Student s = new Student("lakshya", 17);
        s.sayHello();
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("hello from person");
    }
}

class Student extends Person {
    int roll;

    Student(String name, int roll) {
        super(name);    // call Person constructor
        this.roll = roll;
    }

    void sayHello() {
        super.sayHello(); // call Person method
        System.out.println("hello from student");
    }
}