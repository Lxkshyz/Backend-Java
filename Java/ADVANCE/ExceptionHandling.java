// Exception is an object that represents an error event.
// When something bad happens, Java throws an exception.
// If it is not handled, the program will crash.

// Checked exceptions: must be handled, otherwise code won't compile.
// Examples: IOException, SQLException, ClassNotFoundException

// Unchecked exceptions: caused by programming errors, occur at runtime.
// Handling is optional.
// Examples: NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException, NumberFormatException

class ExceptionHandling {
    public static void main(String[] args) {

        // Basic try-catch example
        try {
            String s = null;
            System.out.println(s.length());
        }
        catch (Exception e) {
            System.out.println("String is null!");
        }

        // Multiple specific catch blocks
        try {
            int i = 5;
            int j = 1;
            System.out.println(i / j);

            String d = null;
            System.out.println(d.length());
        }
        catch (ArithmeticException e) { // handles arithmetic errors
            System.out.println("Fix j value!");
        }
        catch (NullPointerException e) { // handles null access
            System.out.println("Fix string value!");
        }
        catch (Exception e) { // catches all other remaining exceptions
            System.out.println("Some other problem!");
        }
    }
}