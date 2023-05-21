package GUI.Panels;

import javax.swing.*;
import java.awt.*;

public class Panel_East extends JPanel {

    public static JLabel SECOND_LABEL = new JLabel();

    public Panel_East(){

        SECOND_LABEL = new JLabel();
        SECOND_LABEL.setPreferredSize(new Dimension(600, 600));
        SECOND_LABEL.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));


        add(SECOND_LABEL);

    }

}
