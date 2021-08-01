package Java.College.AppletAndAwt;

import java.awt.event.*;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;


public class CheckBoxing {
    CheckBoxing(){
        Frame f = new Frame("MCQS");
        Label l = new Label("Languages You Know Bitch: ");
        l.setBounds(10,50,150,20);
        Checkbox c1,c2,c3;
        c1 = new Checkbox("Java");
        c1.setBounds(200,50,40,20);
        c2 = new Checkbox("C++");
        c2.setBounds(260,50,40,20);
        c3 = new Checkbox("Python");
        c3.setBounds(310,50,50,20);
        f.add(l);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.setSize(400,400);
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
        new CheckBoxing();
    }
}
