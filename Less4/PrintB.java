package Less4;

public class PrintB implements Runnable {

    private Words words;

    public PrintB(Words c) {
        words = c;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {

                while (!Thread.interrupted()) {
                    words.printingB();
                    System.out.println("B!");
                    words.waitForPrintingAC();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done B");
    }
}
