package GUI.Panels;

import GUI.Standard.Button_Standard;
import GUI.Standard.Panel_Standard;

import java.awt.*;

public class Panel_West extends Panel_Standard {

    public Panel_West(){

        setLayout(new FlowLayout());

        Button_Standard button = new Button_Standard("Get First");
        button.setName("first");
        button.addActionListener(new Listener_Action(button.getName()));

        Button_Standard button2 = new Button_Standard("Get second");
        button2.setName("second");
        button2.addActionListener(new Listener_Action(button2.getName()));

        add(button);
        add(button2);

    }

}
