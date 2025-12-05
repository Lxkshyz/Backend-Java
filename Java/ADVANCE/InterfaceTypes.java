// Interface types in Java

public class InterfaceTypes {
    public static void main(String[] args) {
        System.out.println("Interface types");
    }
}

// Normal Interface
// - Variables are public static final
// - Methods are public abstract by default
interface A {
    int a = 5;
    int b = -2;
    void hello();
    void show();
    void task();
}

// Functional Interface
// - Exactly one abstract method
// - Useful for lambda expressions (future topic)
@FunctionalInterface
interface B {
    void task();
    // default or static methods allowed
}

// Marker Interface
// - Empty interface used for tagging metadata
interface C {}