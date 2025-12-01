class Operators{
    public static void main(String args[]){
        int add = 1 + 1;
        int sub = 1 - 1;
        int divide = 2 / 2;
        float remainder = 2 % 3;

        boolean condition_1 = add == sub;
        boolean condition_2 = add >= sub;
        boolean condition_3 = add <= sub;
        boolean condition_4 = divide != remainder;

        boolean andCond = condition_1 && condition_2;
        boolean orCond = condition_2 || condition_3;
        boolean notCond = !condition_3;
        boolean xorCond = condition_1 ^ condition_4;

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Division: " + divide);
        System.out.println("Remainder: " + remainder);

        System.out.println("== : " + condition_1);
        System.out.println(">= : " + condition_2);
        System.out.println("<= : " + condition_3);
        System.out.println("!= : " + condition_4);

        System.out.println("AND: " + andCond);
        System.out.println("OR: " + orCond);
        System.out.println("NOT: " + notCond);
        System.out.println("XOR: " + xorCond);
    }
}