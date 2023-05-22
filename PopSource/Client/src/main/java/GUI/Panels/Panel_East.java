package GUI.Panels;

import GUI.Standard.Label_Standard;
import GUI.Standard.Panel_Standard;

import javax.swing.*;
import java.awt.*;

public class Panel_East extends Panel_Standard {

    public static Label_Standard SECOND_LABEL;

    public Panel_East(){

        SECOND_LABEL = new Label_Standard();
        SECOND_LABEL.setPreferredSize(new Dimension(600, 600));


        add(SECOND_LABEL);

    }

}
