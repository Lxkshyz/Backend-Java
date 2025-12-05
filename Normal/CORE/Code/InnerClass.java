package Project;

// inner class: Classes declared inside another class.
// If it's not static, you need an instance of the outer class.

class InnerClass {
    public static void main(String[] args) {
        // Way 1: Non-static inner class
        Outer objOut = new Outer();
        Outer.Inner objIn = objOut.new Inner();
        objIn.show();
        objOut.show();

        // Way 2: Static nested class
        Outer2.Inner2 objIn2 = new Outer2.Inner2();
        objIn2.show();
    }
}

class Outer {
    class Inner {
        public void show() {
            System.out.println("Inner show");
        }
    }

    public void show() {
        System.out.println("Outer show");
    }
}

class Outer2 {
    public void show() {
        System.out.println("Outer2 show");
    }

    static class Inner2 {
        public void show() {
            System.out.println("Inner2 show");
        }
    }
}