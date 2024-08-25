package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{
    
    JButton VIEW,ADD,UPDATE,REMOVE;
    
    Home () {
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1100, 630);
        add(image);
        
        JLabel heading = new JLabel("MANAGEMENT SYSTEM OF ");
        heading.setBounds(650, 20, 400, 40);
        heading.setFont(new Font("TAHOMA", Font.BOLD, 28));    
        heading.setForeground(Color.WHITE);
        image.add(heading);
        
        JLabel lblname = new JLabel("''BATMAN''");
        lblname.setBounds(750, 60, 300, 30);
        lblname.setFont(new Font("TAHOMA", Font.BOLD, 28));
        lblname.setForeground(Color.WHITE);
        image.add(lblname);
        
        ADD = new JButton("ADD COMRADE");
        ADD.setBounds(650, 160, 150, 40);
        ADD.setBackground(Color.WHITE);
        ADD.setForeground(Color.BLACK);
        ADD.addActionListener(this);
        image.add(ADD);
        
        VIEW = new JButton("VIEW COMRADES");
        VIEW.setBounds(830, 160, 150, 40);
        VIEW.setBackground(Color.WHITE);
        VIEW.setForeground(Color.BLACK);
        VIEW.addActionListener(this);
        image.add(VIEW);
        
        UPDATE = new JButton("UPDATE COMRADE");
        UPDATE.setBounds(650, 235, 150, 40);
        UPDATE.setBackground(Color.WHITE);
        UPDATE.setForeground(Color.BLACK);
        UPDATE.addActionListener(this);
        image.add(UPDATE);
        
        REMOVE= new JButton("REMOVE TRAITOR");
        REMOVE.setBounds(830, 235, 150, 40);
        REMOVE.setBackground(Color.WHITE);
        REMOVE.setForeground(Color.BLACK);
        REMOVE.addActionListener(this);
        image.add(REMOVE);
        
        
        
        
        setSize(1100,630);
        setLocation(250,100);
        setVisible(true);
    
    }
    
     public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == ADD) {
            setVisible(false);
            new AddComrade();
        } else if (ae.getSource() == VIEW) {
            setVisible(false);
            new ViewComrade();
        } else if (ae.getSource() == UPDATE) {
            setVisible(false);
            new ViewComrade();
        } else {
            setVisible(false);
            new RemoveTraitor();
        }
        
     }
     
    public static void main(String[] args){
        new Home();
    }
}

