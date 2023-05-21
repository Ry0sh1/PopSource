package GUI.Panels;

import javax.swing.*;
import java.awt.*;

public class Panel_West extends JPanel {

    public Panel_West(){

        setLayout(new FlowLayout());

        JButton button = new JButton("Get First");
        button.setName("first");
        button.setFocusable(false);
        button.addActionListener(new Listener_Action(button.getName()));

        JButton button2 = new JButton("Get second");
        button2.setName("second");
        button2.setFocusable(false);
        button2.addActionListener(new Listener_Action(button2.getName()));

        add(button);
        add(button2);

    }

}
