class Loops {
    public static void main(String[] args) {

        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

        System.out.println("\nNested Loops:");
        // Using StringBuilder to avoid repeated string concatenation in nested loops
        StringBuilder nestedOutput = new StringBuilder();
        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 3; y++) {
                nestedOutput.append("x = ").append(x).append(", y = ").append(y).append("\n");
            }
        }
        System.out.print(nestedOutput.toString());

        System.out.println("\nEnhanced For Loop:");
        int arr[] = {10, 20, 30, 40};
        for (int val : arr) {
            System.out.println(val);
        }
    }
}