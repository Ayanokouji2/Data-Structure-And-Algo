package Java.College.AppletAndAwt;

import java.awt.*;
import java.awt.event.*;

public class TextAreas {
    TextAreas(){
        Frame f = new Frame("Texting");
        Label l = new Label("Describe Yorself:");
        l.setBounds(10,40,100,10);
        TextArea area = new TextArea("Enter The Text");
        area.setBounds(10,60,400,350);
        // area.setBackground(Color.GRAY);
        f.add(l);
        f.add(area);
        f.setSize(400,400);
        f.setBackground(Color.DARK_GRAY);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent x){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new TextAreas();
    }
}
