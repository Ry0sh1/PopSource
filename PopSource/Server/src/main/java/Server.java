import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server implements Runnable{

    private ArrayList<ConnectionHandler> connections;

    public Server(){

        connections = new ArrayList<>();

    }
    @Override
    public void run() {

        try {

            ServerSocket serverSocket = new ServerSocket(8888);

            System.out.println("Waiting for connections");
            while (true) {

                Socket client = serverSocket.accept();
                ConnectionHandler conn = new ConnectionHandler(client);
                connections.add(conn);

            }

        }catch (IOException e){

            System.out.println("Error");

        }

    }

    class ConnectionHandler implements Runnable{

        private Socket client;
        private BufferedReader in;


        public ConnectionHandler(Socket client) {

            try {

                this.client = client;
                in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                run();

            }catch (IOException e){

                System.out.println("Something went wrong");

            }

        }

        @Override
        public void run() {

            try {

                String message;
                OutputStream outputStream = client.getOutputStream();
                BufferedOutputStream out = new BufferedOutputStream(outputStream);

                while ((message = in.readLine()) != null) {

                    ImageIcon imageIcon = null;

                    if (message.equals("first")){

                        imageIcon = new ImageIcon("D:\\Dominik\\Desktop\\Ryoshi\\Programming\\New\\Learning\\Projects\\PopSource\\Server\\src\\main\\resources\\AnimeQuiz\\Attack on Titan Easy.jpg");

                    } else if (message.equals("second")) {

                        imageIcon = new ImageIcon("D:\\Dominik\\Desktop\\Ryoshi\\Programming\\New\\Learning\\Projects\\PopSource\\Server\\src\\main\\resources\\AnimeQuiz\\Attack on Titan Hard.jpg");

                    }

                    Image image = imageIcon.getImage();
                    BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null),BufferedImage.TYPE_INT_RGB);
                    Graphics graphics = bufferedImage.createGraphics();
                    graphics.drawImage(image,0,0,null);
                    ImageIO.write(bufferedImage, "jpg", out);
                    client.close();

                }

            }catch (IOException e){

                //TODO:SOCKET CLOSED

            }

        }

    }

    public static void main(String[] args) throws IOException {

        Server server = new Server();
        server.run();

    }

}