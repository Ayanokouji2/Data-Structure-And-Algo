package Java.College.AppletAndAwt;

import java.awt.*;
import java.awt.event.*;


public class ButtonEx {
    public static void main(String[] args) {
        Frame f = new Frame("Shivam");
        final TextField tf= new TextField();
        tf.setBounds(50,50,200,200);
        Button b = new Button("click Me");
        b.setBounds(50, 250, 80, 30);
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome to my world of Harem");
            }
        });
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent x){
                System.exit(0);
            }
        });
        f.setBackground(Color.black);
        tf.setBackground(Color.red);
        b.setBackground(Color.yellow);
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
    }
}
