package lesson6;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 80);
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        Scanner input = new Scanner(System.in);

        Thread receiveServerMessageThread = new Thread(() -> {
            while (true) {
                try {
                    String serverMessage = in.readUTF();
                    System.out.println("Message from server: " + serverMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        receiveServerMessageThread.start();

        while (true) {
            String message = input.nextLine();
            if (message.equals("quit")) {
                System.out.println("Finished!");
                out.writeUTF(message);
                out.flush();
                break;
            }
            out.writeUTF(message);
            out.flush();
        }

    }
}