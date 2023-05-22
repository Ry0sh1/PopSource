package GUI;

import GUI.Panels.Panel_All;

import javax.swing.*;

public class Frame_Test extends JFrame {

    public Frame_Test(){
        setBackground(Global.BACKGROUND_1);
        setForeground(Global.FOREGROUND);
        add(new Panel_All());
        pack();
        setVisible(true);
    }

}
