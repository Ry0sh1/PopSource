package GUI.Panels;

import javax.swing.*;
import java.awt.*;

public class Panel_All extends JPanel {

    public Panel_All(){

        add(new Panel_West(), BorderLayout.NORTH);
        add(new Panel_East(), BorderLayout.CENTER);

    }

}
