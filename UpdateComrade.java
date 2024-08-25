package employee.management.system;

import javax .swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateComrade extends JFrame implements ActionListener {
    
 
    
    JTextField tfshift,tfProfession, tffname,tfdob,  tfreward, tfHideout, tfBATSignal, tfemail,tftask;
    JLabel lblBATMANid ;
    JButton add,back;
    String BATMANid;
    
    
    UpdateComrade(String BATMANid){
        this.BATMANid=BATMANid;
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/add c.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1150, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1150, 700);
        add(image);
        
        JLabel heading = new JLabel("!** UPDATE COMRADE DETAILS **! ");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 27));
        heading.setForeground(Color.WHITE);
        image.add(heading);
        //name
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        labelname.setForeground(Color.white);
        image.add(labelname);
        
        JLabel lblname = new JLabel();
        lblname.setBounds(200, 150, 150, 30);
        lblname.setForeground(Color.WHITE);
        image.add(lblname);
        //father name
        JLabel labelfname = new JLabel("Father's Name");
        labelfname.setBounds(400, 150, 150, 30);
        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
        labelfname.setForeground(Color.WHITE);
        image.add(labelfname);
        
        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        image.add(tffname);
        //DOB
        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        labeldob.setForeground(Color.WHITE);
        image.add(labeldob);
        
        tfdob = new JTextField();
        tfdob.setBounds(200, 200, 150, 30);
        image.add(tfdob);
        //reward
        JLabel labelreward = new JLabel("Reward");
        labelreward.setBounds(400, 200, 150, 30);
        labelreward.setFont(new Font("serif", Font.PLAIN, 20));
        labelreward.setForeground(Color.WHITE);
        image.add(labelreward);
        
        tfreward = new JTextField();
        tfreward.setBounds(600, 200, 150, 30);
        image.add(tfreward);
        //hideout
        JLabel labelHideout = new JLabel("Hideout");
        labelHideout.setBounds(50, 250, 150, 30);
        labelHideout.setFont(new Font("serif", Font.PLAIN, 20));
        labelHideout.setForeground(Color.WHITE);
        image.add(labelHideout);
        
        tfHideout = new JTextField();
        tfHideout.setBounds(200, 250, 150, 30);
        image.add(tfHideout); 
        //ph=bat-signal
        JLabel labelBATSignal = new JLabel("BAT-Signal");
        labelBATSignal.setBounds(400, 250, 150, 30);
        labelBATSignal.setFont(new Font("serif", Font.PLAIN, 20));
        labelBATSignal.setForeground(Color.WHITE);
        image.add(labelBATSignal);
        
        tfBATSignal = new JTextField();
        tfBATSignal.setBounds(600, 250, 150, 30);
        image.add(tfBATSignal);
        //email
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        labelemail.setForeground(Color.WHITE);
        image.add(labelemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        image.add(tfemail);
        //fake human PROFESSION
        JLabel labelfProfession = new JLabel("Fake Profession");
        labelfProfession.setBounds(400, 300, 150, 30);
        labelfProfession.setFont(new Font("serif", Font.PLAIN, 20));
        labelfProfession.setForeground(Color.WHITE);
        image.add(labelfProfession);
        
        tfProfession= new JTextField();
        tfProfession.setBounds(600, 300, 150, 30);
        tfProfession.setBackground(Color.white);
        image.add(tfProfession);
        //SHIFT
        JLabel labelshift = new JLabel("shift");
        labelshift.setBounds(50, 350, 150, 30);
        labelshift.setFont(new Font("serif", Font.PLAIN, 20));
        labelshift.setForeground(Color.WHITE);
        image.add(labelshift);
        
        tfshift= new JTextField();
        tfshift.setBounds(200, 350, 150, 30);
        image.add(tfshift);
        
        //task completed
        JLabel labeltask = new JLabel("Task completed");
        labeltask.setBounds(400, 350, 150, 30);
        labeltask.setFont(new Font("serif", Font.PLAIN, 20));
        labeltask.setForeground(Color.WHITE);
        image.add(labeltask);
        
        tftask = new JTextField();
        tftask.setBounds(600, 350, 150, 30);
        image.add(tftask);
        //id
        JLabel labelBATMANid = new JLabel("Batman ID");
        labelBATMANid.setBounds(50, 400, 150, 30);
        labelBATMANid.setFont(new Font("serif", Font.PLAIN, 20));
        labelBATMANid.setForeground(Color.WHITE);
        image.add(labelBATMANid);
        
        JLabel lblBATMANid = new JLabel();
        lblBATMANid.setBounds(200, 400, 150, 30);
        lblBATMANid.setFont(new Font("serif", Font.PLAIN, 20));
        lblBATMANid.setForeground(Color.WHITE);
        image.add(lblBATMANid);
        
        try {
            JDBC c = new JDBC();
            String query = "select * from employee where BATMANid= '"+BATMANid +"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                lblname.setText(rs.getString("name"));
                tffname.setText(rs.getString("fname"));
                tfdob.setText(rs.getString("dob"));
                tfreward.setText(rs.getString("reward"));
                tfHideout.setText(rs.getString("Hideout"));
                tfBATSignal.setText(rs.getString("BATSignal"));
                tfemail.setText(rs.getString("email"));
                tfshift.setText(rs.getString("shift"));
                tfProfession.setText(rs.getString("fakeprofession"));
                tftask.setText(rs.getString("taskcompleted"));
                lblBATMANid.setText(rs.getString("BATMANid"));
                
                
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //button
        add = new JButton("Update Details");
        add.setBounds(250, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.gray);
        add.setForeground(Color.black);
        image.add(add);
        
        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.gray);
        back.setForeground(Color.BLACK);
        image.add(back);
      
        
        
        setSize(1150,700);
        setLocation(200,50);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== add){
            
            String fname = tffname.getText();
            String dob = tfdob.getText();
            String reward = tfreward.getText();
            String Hideout = tfHideout.getText();
            String BATSignal= tfBATSignal.getText();
            String email = tfemail.getText();
            String profession = tfProfession.getText();
            String shift = tfshift.getText();
            String task = tftask.getText();
            
            
            try {
                JDBC JDBC = new JDBC();
                String query = "update employee set fname = '"+fname+"',dob = '"+dob+"', reward = '"+reward+"', Hideout = '"+Hideout+"', batsignal = '"+BATSignal+"', email =  '"+email+"',  shift = '"+shift+"',fakeprofession = '"+profession+"'  ,taskcompleted = '"+task+"' where BATMANid= '"+BATMANid+"'";
                JDBC.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "COMRADE Details updated successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }else{
            setVisible(false);
            new Home();
        }
    }
    public static void main (String [] args) {
        new UpdateComrade("");
    }
    
}
