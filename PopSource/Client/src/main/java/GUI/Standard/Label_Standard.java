package GUI.Standard;

import GUI.Global;

import javax.swing.*;

public class Label_Standard extends JLabel {

    public Label_Standard(){
        init();
    }

    public Label_Standard(String text) {
        super(text);
        init();
    }

    private void init(){
        setBackground(Global.BACKGROUND_2);
        setForeground(Global.FOREGROUND);
        setBorder(BorderFactory.createLineBorder(Global.LINES, 2));
        setFocusable(false);
    }

}
