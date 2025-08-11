class SampleThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("SampleThread\t" + i);
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("SampleThread interrupted");
            }
        }
    }
}

public class DemoThread {
    public static void main(String[] args) {
        SampleThread thread = new SampleThread();
        thread.start(); // Start the custom thread

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("MainThread\t" + i);
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("MainThread interrupted");
            }
        }
    }
}
