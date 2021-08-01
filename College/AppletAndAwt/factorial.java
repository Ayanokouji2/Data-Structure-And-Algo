package Java.College.AppletAndAwt;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class factorial {
    factorial(int f){
        Frame frame=new Frame("Calculate Factorial");
        frame.setSize(400,400);
        Label label=new Label("Factorial");
        label.setBounds(10,80,60,30);
        TextField txt=new TextField();
        txt.setBounds(80, 80, 150, 20);
        Button b=new Button("Answer");
        b.setBounds(80,100,80,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("Factorial of the no is:"+f);
            }
        });
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent x){
                System.exit(0);
            }
        });
        // frame.setLocation(500,100);
        frame.add(label);
        frame.add(txt);
        frame.add(b);
        frame.setVisible(true);
        frame.setLayout(null);
    
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any no");
        int n=in.nextInt();
        int f=1;
        for(int i=n; i>0; i--){
            f*=f=i;
        }
        in.close();
        new factorial(f); 
    }
}
