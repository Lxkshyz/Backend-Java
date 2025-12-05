// Static Variables, methods, blocks

class StaticMethods {
    public static void main(String[] args) {
        Person p = new Person();
        Person.info(p);

        // Static methods also belong to the class we cannot directly access non static variables until we give them reference inside of method of which instance they will be using then only they can be accessed and static methods are directly available since they both belong to the class.
    }
}

class Person{
    String name;
    int age;
    static int population = 0;
    Person(){
        population++;
    }

    // Cannot access non - static variable inside static method.

    // public static void info(){
    //     System.out.println(this.name + " : " + this.age + " : " + population);
    // }

    // But can pass the reference of object and then access these non-static variables inside static method
    public static void info(Person obj){
        System.out.println(obj.name + " : " + obj.age + " : " + population);
    }
}
