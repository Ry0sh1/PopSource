package GUI.Panels;

import GUI.Frame_Test;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Listener_Action implements ActionListener {

    private String buttonName;

    public Listener_Action(String buttonName){
        this.buttonName = buttonName;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Socket client = new Socket("localhost",8888);

            PrintWriter out = new PrintWriter(client.getOutputStream(),true);
            InputStream inputStream = client.getInputStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

            if (buttonName.equals("first")) {
                out.println("first");
            } else if (buttonName.equals("second")) {
                out.println("second");
            }

            BufferedImage bufferedImage = ImageIO.read(bufferedInputStream);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            Panel_East.SECOND_LABEL.setIcon(imageIcon);
        }catch (IOException i){
            System.out.println("Something went wrong");
        }
    }

}
