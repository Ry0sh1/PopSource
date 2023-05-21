package GUI;

import GUI.Panels.Panel_All;

import javax.swing.*;
import java.io.IOException;
import java.net.Socket;

public class Frame_Test extends JFrame {

    public Frame_Test(){

        add(new Panel_All());
        pack();
        setVisible(true);

    }

}
