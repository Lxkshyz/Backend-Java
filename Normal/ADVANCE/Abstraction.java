class Abstraction {
    public static void main(String[] args) {
        BMW a = new BMW();
        a.drive();
        a.playMusic();
    }
}

// Abstraction:
// A class that provides a structure but hides the actual implementation details.
// It cannot be instantiated directly. Only its subclasses bring the missing pieces.

// Abstract Class
abstract class Car {

    // Abstract method: Only a declaration, no body.
    // Any class that extends Car MUST provide its own implementation for drive().
    public abstract void drive();

    // Normal method with implementation.
    public void playMusic() {
        System.out.println("Playing Music !");
    }
}

// BMW implements the abstract method from Car
class BMW extends Car {
    public void drive() {
        System.out.println("driving");
    }
}