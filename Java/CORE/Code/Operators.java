class Operators {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        System.out.println("\nRelational Operators:");
        System.out.println("== : " + (a == b));
        System.out.println("!= : " + (a != b));
        System.out.println(">  : " + (a > b));
        System.out.println("<  : " + (a < b));
        System.out.println(">= : " + (a >= b));
        System.out.println("<= : " + (a <= b));

        System.out.println("\nLogical Operators:");
        boolean x = true, y = false;
        System.out.println("AND: " + (x && y));
        System.out.println("OR: " + (x || y));
        System.out.println("NOT x: " + (!x));
        System.out.println("XOR: " + (x ^ y));

        System.out.println("\nAssignment Operators:");
        int z = 5;
        z += 2;
        System.out.println("z += 2 => " + z);
        z -= 1;
        System.out.println("z -= 1 => " + z);
        z *= 3;
        System.out.println("z *= 3 => " + z);
        z /= 2;
        System.out.println("z /= 2 => " + z);
        z %= 4;
        System.out.println("z %= 4 => " + z);
    }
}