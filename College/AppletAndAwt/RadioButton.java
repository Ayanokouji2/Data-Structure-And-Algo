package Java.College.AppletAndAwt;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.*;


// Also Known as CheckboxGroup
public class RadioButton {
    RadioButton(){

        Frame f = new Frame("Selecting");
        Label l = new Label("Which Language You Have Perfecto: ");
        l.setBounds(10,50,200,20);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c1,c2,c3;
        c1 = new Checkbox("Java",cbg,false);
        c1.setBounds(210,50,40,20);
        c2 = new Checkbox("C++",cbg,false);
        c2.setBounds(260,50,40,20);
        c3 = new Checkbox("Python",cbg,false);
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
        new RadioButton();
    }
}
