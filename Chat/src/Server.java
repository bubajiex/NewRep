import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        Server server = new Server();
    }

    public Server() {


        ServerSocket server = null;
        Socket socket = null;

        try {

            server = new ServerSocket(3443);
            System.out.println("Сервер запущен...");
            socket = server.accept();
            System.out.println("Клиент подключился");

            Scanner in =  new Scanner(socket.getInputStream());

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);


            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        System.out.println("СЕРВЕР : Напишите сообщение ");
                        String msg = sc.nextLine();
                        System.out.println("отправлено: ");
                        out.println(msg);
                    }
                }
            }).start();

            while (true) {
                String msg = in.nextLine();
                if (msg.equals("/end")) break;
                System.out.println("Клиент: " + msg);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                server.close();
                System.out.println("Сервер закрыт");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
