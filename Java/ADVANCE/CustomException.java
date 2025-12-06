// Custom exceptions in Java:
// - We create our own exception class to represent specific error cases in our application.
// - Custom exceptions help provide clearer and more meaningful error messages,
//   instead of using only built-in exceptions like NullPointerException or ArithmeticException.
// - A custom exception class generally extends Exception (checked exception) or RuntimeException (unchecked exception).

class CustomException {
    public static void main(String[] args) {
        try {
            int age = 0;

            // If age does not satisfy a condition, we manually throw our custom exception.
            if (age < 18) {
                throw new AgeException("Not 18+");  // throwing custom exception with a message
            }

            System.out.println("Age verified!");
        }
        // We catch our custom exception specifically so we can handle it and show a clear message
        catch (AgeException e) {
            System.out.println(e);  // prints the exception object along with the message
        }
    }
}

// Creating a custom exception by extending Exception class
// This makes AgeException a checked exception that must be handled using try-catch or declared using 'throws'
class AgeException extends Exception {
    // Constructor that calls parent class constructor to store our custom message
    AgeException(String message) {
        super(message);
    }
}