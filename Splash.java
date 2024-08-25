package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener{
    Splash() {
        getContentPane().setBackground(Color.black);
        setLayout(null);
       
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM OF 'BAT MAN' ");
        heading.setBounds(80, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 50));
        heading.setForeground(Color.WHITE);
        add(heading);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 100, 1070, 550);
        add(image);
        
        JButton clickhere = new JButton("CLICK HERE TO SAVE THE WORLD");
        clickhere.setBounds(350, 400, 400, 90);
        clickhere.setFont(new Font("serif", Font.PLAIN, 20));
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);
         
        setSize(1300, 700);
        setLocation(200, 50);
        setVisible(true);
    }
     
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    
    }
    
    public static void main(String args[]) {
        new Splash();
    }
}