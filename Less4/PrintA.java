package Less4;

class PrintA implements Runnable {

    private Words words;

    public PrintA(Words t) {
        words = t;
    }

    public void run() {
        for (int i = 0; i < 5; i++){
            try {
                while (!Thread.interrupted()) {
                    words.printingA();
                    System.out.println("A!");
                    words.waitForPrintingBC();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done A");
    }
}
