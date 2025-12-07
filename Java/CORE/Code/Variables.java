package CORE.Code;

public class Variables {
    public static void main(String args[]) {

        // <===== Primitive =====>
        // Integer types
        byte a = 0;
        short b = 1;
        int c = 2;
        long d = 3;

        // Decimal types
        float e = 1.2f;        // must end with f
        double f = 3.4;

        // Extras
        char g = 'i';          // must use single quotes
        boolean h = true;

        // <===== Non primitive =====>
        String abc = "Hello world !";
        int[] arr = new int[]{1, 2, 3, 4, 5};

        // Printing all values using printf for better performance
        System.out.printf("byte: %d%n", a);
        System.out.printf("short: %d%n", b);
        System.out.printf("int: %d%n", c);
        System.out.printf("long: %d%n", d);
        System.out.printf("float: %.1f%n", e);
        System.out.printf("double: %.1f%n", f);
        System.out.printf("char: %c%n", g);
        System.out.printf("boolean: %b%n", h);
        System.out.printf("String: %s%n", abc);

        // Print array using StringBuilder for efficiency
        StringBuilder arrayOutput = new StringBuilder("Array: ");
        for (int num : arr) {
            arrayOutput.append(num).append(" ");
        }
        System.out.println(arrayOutput.toString());
    }
}