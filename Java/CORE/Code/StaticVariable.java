// Static Variables, methods, blocks

class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p = new Person();
        p = new Person();
        p = new Person();
        System.out.println(Person.population);
    }
}
// These variables are basically static and hence they belong to the class and due to constructor each time object is created
// population get increment and its same value for all instances because same reference
class Person{
    String name;
    int age;
    static int population = 0;

    Person(){
        population++;
    }
}