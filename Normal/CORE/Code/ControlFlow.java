class ControlFlow {
    public static void main(String[] args) {
        int num = 10;

        System.out.println("If Statement:");
        if (num > 5) {
            System.out.println("num is greater than 5");
        }
        System.out.println("\nIf-Else:");
        if (num % 2 == 0) {
            System.out.println("num is even");
        } else {
            System.out.println("num is odd");
        }

        System.out.println("\nElse-If Ladder:");
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        System.out.println("\nSwitch Case:");
        int day = 2;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Unknown");
        }

        System.out.println("\nBreak and Continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            if (i == 5) break;
            System.out.println(i);
        }

        System.out.println("\nReturn Demo:");
        System.out.println("Returned: " + getNumber());
    }

    static int getNumber() {
        return 42;
    }
}