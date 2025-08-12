class Speaker extends Thread {
    private String name;

    public Speaker(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + ": message " + i);
            Thread.yield(); // Hint to let the other thread speak
            try {
                Thread.sleep(100); // Pause to allow interleaving
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
            }
        }
    }
}

public class yield_ex {
    public static void main(String[] args) {
        Speaker alice = new Speaker("Alice");
        Speaker bob = new Speaker("Bob");

        alice.start();
        bob.start();
    }
}
