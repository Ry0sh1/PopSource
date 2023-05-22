package GUI.Panels;

import GUI.Standard.Panel_Standard;

import javax.swing.*;
import java.awt.*;

public class Panel_All extends Panel_Standard {

    public Panel_All(){
        add(new Panel_West(), BorderLayout.NORTH);
        add(new Panel_East(), BorderLayout.CENTER);
    }

}
