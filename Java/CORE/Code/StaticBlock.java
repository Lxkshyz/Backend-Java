// Static Variables, methods, blocks

class StaticBlock{
    public static void main(String[] args) {
        Person a = new Person();
        Person b = new Person();

        System.out.println("Class type:"  + Person.type);
        System.out.println("A person type:" + a.type);
        System.out.println("B person type:" + b.type);

        // So basically static blocks are only executed once, note how when b was created it didn't execute again and print "inside static block" because they only execute once when the class is first created and these can be useful and more efficient for assignment to static variable rather than calling and putting same value inside of new object each time constructor calls we can use this static block too.
    }
}

class Person{
    String name;
    int age;
    //static variable
    static String type;

    //static block
    static{
        System.out.println("inside static block !");
        type = "Homosapiens";
    }
    Person(){
        System.out.println("inside constructor block !");
    }
}
