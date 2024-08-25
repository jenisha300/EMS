package employee.management.system;

import javax .swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class AddComrade extends JFrame implements ActionListener {
    
    Random ran= new Random ();
    int number =ran.nextInt(999999);
    
    JTextField tfname, tffname,  tfreward, tfHideout, tfBATSignal, tfemail,tftask;
    JDateChooser dcdob;
    JComboBox cbfProfession;
    JComboBox cbshift ;
    JLabel lblBATMANid ;
    JButton add,back;
    
    
    AddComrade(){
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/add c.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1150, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1150, 700);
        add(image);
        
        JLabel heading = new JLabel("!**  NEW COMRADE DETAILS  **! ");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 30));
        heading.setForeground(Color.WHITE);
        image.add(heading);
        //name
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        labelname.setForeground(Color.white);
        image.add(labelname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        image.add(tfname);
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
        
        dcdob = new JDateChooser();
        dcdob.setBounds(200, 200, 150, 30);
        image.add(dcdob);
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
        //fake human designation
        JLabel labelfProfession = new JLabel("Fake Profession");
        labelfProfession.setBounds(400, 300, 150, 30);
        labelfProfession.setFont(new Font("serif", Font.PLAIN, 20));
        labelfProfession.setForeground(Color.WHITE);
        image.add(labelfProfession);
        
        String Profession[] = {"","BUSINESS","AUTHOR", "ACTOR", "ACCOUNTANT", "ARCHITECT", "BUS DRIVER", "CHEF", "FARMER", "EDITOR", "MANAGER", "PROFESSOR", "PROFESSOR", "ENGINEER","OTHERS"};
        cbfProfession = new JComboBox(Profession);
        cbfProfession.setBackground(Color.WHITE);
        cbfProfession.setBounds(600, 300, 150, 30);
        image.add(cbfProfession);
        //SHIFT
        JLabel labelshift = new JLabel("shift");
        labelshift.setBounds(50, 350, 150, 30);
        labelshift.setFont(new Font("serif", Font.PLAIN, 20));
        labelshift.setForeground(Color.WHITE);
        image.add(labelshift);
        
        String shift[] = {"","DAY","EVENING", "NIGHT", "ROTATING SHIFT", "FIXED SHIFT"};
        cbshift = new JComboBox(shift);
        cbshift.setBackground(Color.WHITE);
        cbshift.setBounds(200, 350, 150, 30);
        image.add(cbshift);
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
        JLabel labelBATMANid= new JLabel("Batman ID");
        labelBATMANid.setBounds(50, 400, 150, 30);
        labelBATMANid.setFont(new Font("serif", Font.PLAIN, 20));
        labelBATMANid.setForeground(Color.WHITE);
        image.add(labelBATMANid);
        
        lblBATMANid = new JLabel("" + number);
        lblBATMANid.setBounds(200, 400, 150, 30);
        lblBATMANid.setFont(new Font("serif", Font.PLAIN, 20));
        lblBATMANid.setForeground(Color.WHITE);
        image.add(lblBATMANid);
        //button
        add = new JButton("Add Details");
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
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String reward = tfreward.getText();
            String Hideout = tfHideout.getText();
            String BATSignal= tfBATSignal.getText();
            String email = tfemail.getText();
            String profession = (String) cbfProfession.getSelectedItem();
            String shift = (String) cbshift.getSelectedItem();
            String task = tftask.getText();
            String BATMANid = lblBATMANid.getText();
            
            try {
                JDBC JDBC = new JDBC();
                String query = "insert into employee values('"+name+"', '"+fname+"', '"+dob+"', '"+reward+"', '"+Hideout+"', '"+BATSignal+"', '"+email+"', '"+shift+"','"+profession+"' , '"+task+"', '"+BATMANid+"')";
                JDBC.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "COMRADE Details added successfully");
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
        new AddComrade();
    }
    
}
