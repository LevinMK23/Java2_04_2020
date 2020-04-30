package lesson6.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    static boolean flag = true;

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(87);
        // 127.0.0.1
        Socket con = server.accept();
        System.out.println("Connected " + con.getInetAddress());
        DataInputStream in = new DataInputStream(con.getInputStream());
        DataOutputStream out = new DataOutputStream(con.getOutputStream());
        Scanner input = new Scanner(System.in);
        Thread inputService = new Thread(() -> {
            while (flag) {

                String command = input.nextLine();
                if (flag) {
                    try {
                        out.writeUTF("Command from server: " + command);
                        out.flush();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        inputService.start();

        while (true) {
            String clientMessage = in.readUTF();
            if (clientMessage.equals("send")){
                String name = in.readUTF();
                System.out.println("fileName = " + name);
                int len = in.readInt();
                System.out.println("len = " + len);
                File file = new File(name);
                file.createNewFile();
                FileOutputStream os = new FileOutputStream(file);
                for (int i = 0; i < len; i++) {
                    os.write(in.read());
                }
                os.close();
                out.writeUTF("File uploaded!");
                out.flush();
            }
            else {
                if (clientMessage.equals("quit")) {
                    System.out.println("Shut down");
                    flag = false;
                    return;
                }
                System.out.println("Message from client: " + clientMessage);
                if (clientMessage.contains("Hello")) {
                    out.writeUTF("Hello " + con.getInetAddress() + ", know all about you)");
                    out.flush();
                } else {
                    out.writeUTF("Message from server: " + clientMessage);
                    out.flush();
                }
            }
        }
    }
}
