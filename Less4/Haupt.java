package Less4;

public class Haupt {


        public static void main(String[] args) throws Exception {

            Words words = new Words();


            Print print = new Print();
            new Thread(() -> print.printing_a()).start();
            new Thread(() -> print.printing_b()).start();
            new Thread(() -> print.printing_c()).start();
        }
    }

