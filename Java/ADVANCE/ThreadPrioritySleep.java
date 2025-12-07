class ThreadsPrioritySleep {
    public static void main(String[] args) {

        // Creating thread using Runnable + Lambda
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 50; i++) {
                System.out.println("THREAD ONE");
                try {
                    // sleep(): pauses current thread for given milliseconds
                    // Scheduler can give time to other threads meanwhile
                    Thread.sleep(100); // helping t2 get priority
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 50; i++) {
                System.out.println("THREAD TWO");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.err.println(e.getMessage());
                }
            }
        });

        // setPriority():
        // Suggests Scheduler which thread should get more attention
        // Range: 1 (MIN) to 10 (MAX)
        t1.setPriority(Thread.MIN_PRIORITY);  // lowest priority
        t2.setPriority(Thread.MAX_PRIORITY);  // highest priority

        // Actually start both threads
        t1.start();
        t2.start();
    }
}