package lesson6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(80);
        Socket con = server.accept();
        System.out.println("Connected " + con.getInetAddress());
        DataInputStream in = new DataInputStream(con.getInputStream());
        DataOutputStream out = new DataOutputStream(con.getOutputStream());
        Scanner input = new Scanner(System.in);
        Thread receiveClientMessageThread = new Thread(() -> {
            while (true) {
                try {
                    String clientMessage = in.readUTF();
                    if (clientMessage.equals("quit")) {
                        System.out.println("Shut down");
                        return;
                    }
                    System.out.println("Message from client: " + clientMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        receiveClientMessageThread.start();

        while (true) {
            String serverMessage = input.nextLine();
            out.writeUTF(serverMessage);
            out.flush();
        }
    }
}
