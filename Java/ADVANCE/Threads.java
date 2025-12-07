// Threads in Java:
// A thread is the smallest unit of execution inside a program.
// Threads allow programs to run multiple tasks simultaneously (or appear to).

class Threads {
    public static void main(String args[]) {

        // Thread(Runnable target):
        // Runnable is a Functional Interface with only one abstract method: run()
        // So lambda can be used to define the run() method behavior.
        Thread Th1 = new Thread(() -> {
            // Using StringBuilder for efficient string concatenation in loop
            StringBuilder output = new StringBuilder();
            for (int i = 0; i <= 100; i++) {
                output.append("THREAD ONE\n");
            }
            System.out.print(output.toString());
        });

        Thread Th2 = new Thread(() -> {
            // Using StringBuilder for efficient string concatenation in loop
            StringBuilder output = new StringBuilder();
            for (int i = 0; i <= 100; i++) {
                output.append("THREAD TWO\n");
            }
            System.out.print(output.toString());
        });

        // Creating a thread by extending Thread class
        Th3 obj = new Th3();

        // start() actually creates a new thread and calls run() internally
        Th1.start();
        Th2.start();
        obj.start();
    }
}

// Another way to create threads is by extending Thread class
class Th3 extends Thread {
    // Must override run() method, otherwise nothing runs in this thread
    public void run() {
        // Using StringBuilder for efficient string concatenation in loop
        StringBuilder output = new StringBuilder();
        for (int i = 0; i <= 100; i++) {
            output.append("THREAD THREE\n");
        }
        System.out.print(output.toString());
    }
}