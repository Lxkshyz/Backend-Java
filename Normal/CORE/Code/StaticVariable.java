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

class Person{
    String name;
    int age;
    static int population = 0;

    Person(){
        population++;
    }
}


how is population 4 isn't the reference changing so objects get autodeleted