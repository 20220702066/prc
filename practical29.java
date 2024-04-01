public class practical29 {
    public static void main(String[] args) {
        // Create and start a new thread
        Thread thread = new Thread(new CountTask());
        thread.start();

        // Continue executing other tasks in the main thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Runnable task to count from 1 to 5
    static class CountTask implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child Thread: " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}