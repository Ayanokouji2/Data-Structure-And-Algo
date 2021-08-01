package Java.College.AppletAndAwt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;

public class Labael {
    public static void main(String[] args) {
        Frame f = new Frame("Labelling");
        // Label l1,l2;
        final TextField tf = new TextField();
        tf.setBounds(90,50,100,20);
        tf.setText("");
        Label l1 = new Label("Genders");
        l1.setBounds(10,50,100,10);
        Label l2 = new Label("Cast");
        l2.setBounds(10,80,100,10);
        final TextField tf2 = new TextField();
        tf2.setBounds(90,80,100,20);
        tf2.setText("");
        f.add(tf);
        f.add(tf2);
        f.add(l1);
        f.add(l2);
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
}
