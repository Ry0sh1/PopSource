package GUI.Standard;

import GUI.Global;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Button_Standard extends JButton {

    public Button_Standard(){
        init();
    }

    public Button_Standard(String text) {
        super(text);
        init();
    }

    private void init(){
        setPreferredSize(new Dimension(120,80));
        setBackground(Global.BACKGROUND_1);
        setForeground(Global.FOREGROUND);
        setBorder(BorderFactory.createLineBorder(Global.LINES,2));
        setFocusable(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JButton b = (JButton) e.getComponent();
                b.setBackground(Global.BACKGROUND_2);
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                JButton b = (JButton) e.getComponent();
                b.setBackground(Global.BACKGROUND_1);
            }
        });
    }

}
