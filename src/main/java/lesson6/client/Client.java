package lesson6.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    volatile int lol;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.100.7", 87);
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        Scanner input = new Scanner(System.in);

        while (true) {
            String message = input.nextLine();
            if (message.equals("send")) {
                FileInputStream is = new FileInputStream("src/main/java/lesson6/client/file.txt");
                String name = "file.txt";
                int length = is.available();
                System.out.println("length = " + length);
                out.writeUTF("send");
                out.writeUTF(name);
                out.writeInt(length);
                for (int i = 0; i < length; i++) {
                    out.write(is.read());
                }
                out.flush();
            } else {
                if (message.equals("quit")) {
                    System.out.println("Finished!");
                    out.writeUTF(message);
                    out.flush();
                    break;
                }
                out.writeUTF(message);
                out.flush();
                String messageFromServer = in.readUTF();
                System.out.println(messageFromServer);
            }
        }

    }
}
