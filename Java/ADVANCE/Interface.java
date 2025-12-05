class Interface {
    public static void main(String[] args) {

        // Anonymous class implementing A
        A obj = new A() {
            @Override
            public void display() {
                System.out.println("display A");
            }
        };
        obj.display();

        // Polymorphism using interface reference
        A obj2 = new B();
        obj2.display();   // display B
        obj2.display2();  // default method from A
        System.out.println(A.name);  // using interface constant properly
    }
}

interface A {
    String name = "A"; // public static final variable by default

    void display();  // "public abstract" by default in interface

    default void display2() {  // default method can be overridden, have body and non-static, public.
        System.out.println("display 2 FROM A");
    }
}

class B implements A {
    @Override
    public void display() {
        System.out.println("display B");
    }
}

class C implements A {
    @Override
    public void display() {
        System.out.println("display C");
    }

    @Override
    public void display2() {
        System.out.println("display 2 FROM C");
    }
}