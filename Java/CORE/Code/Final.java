// Final class: cannot be inherited
final class FinalClass {
    // Final variable: acts like a constant, must be initialized once
    final int VALUE = 100;

    // Final method: cannot be overridden
    final void showValue() {
        System.out.println("Final variable VALUE = " + VALUE);
    }
}

// Since FinalClass is final, this would be illegal:
// class Child extends FinalClass {}   // Not allowed

public class Final {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.showValue();
    }
}