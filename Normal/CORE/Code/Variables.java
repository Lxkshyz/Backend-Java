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

        // Printing all values
        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);

        System.out.println("float: " + e);
        System.out.println("double: " + f);

        System.out.println("char: " + g);
        System.out.println("boolean: " + h);

        System.out.println("String: " + abc);

        // Print array
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}