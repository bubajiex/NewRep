package Less4;

public class PrintC implements Runnable {

    private Words words;

    public PrintC(Words c) {
        words = c;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                while (!Thread.interrupted()) {
                    words.printingC();
                    System.out.println("C!");
                    words.waitForPrintingAB();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done C");
    }
}