package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton r1, r2,r3, r4;
    
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;
    
    
    SignupThree(String formno){
        
        this.formno = formno;
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3 :  Account Details ");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);
        
        JLabel acc_type = new JLabel("Account Type ");
        acc_type.setFont(new Font("Raleway", Font.BOLD, 22));
        acc_type.setBounds(100, 140, 200, 30);
        add(acc_type);
        
        r1 = new JRadioButton("Saving Account ");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 180, 160, 20);
        add(r1);
        
        r2 = new JRadioButton("Fixed deposit Account ");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 180, 230, 20);
        add(r2);
        
        r3 = new JRadioButton("Current Account ");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 220, 160, 20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 220, 230, 20);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        
        JLabel card_title = new JLabel("Card Number :");
        card_title.setFont(new Font("Raleway", Font.BOLD, 22));
        card_title.setBounds(100, 300, 200, 30);
        add(card_title);
        
        JLabel card_number = new JLabel("XXXX-XXXX-XXXX-4134");
        card_number.setFont(new Font("Raleway", Font.BOLD, 22));
        card_number.setBounds(330, 300, 300, 30);
        add(card_number);
        
        JLabel card_detail = new JLabel("Your 16 Digit Card Number");
        card_detail.setFont(new Font("Raleway", Font.BOLD, 12));
        card_detail.setBounds(100, 330, 300, 20);
        add(card_detail);
        
        
        JLabel pin_title = new JLabel("PIN   :");
        pin_title.setFont(new Font("Raleway", Font.BOLD, 22));
        pin_title.setBounds(100, 370, 200, 30);
        add(pin_title);
        
        
        
        JLabel pin_number = new JLabel("XXXX");
        pin_number.setFont(new Font("Raleway", Font.BOLD, 22));
        pin_number.setBounds(330, 370, 300, 30);
        add(pin_number);
        
        JLabel pin_detail = new JLabel("Your 4 Digit Pin");
        pin_detail.setFont(new Font("Raleway", Font.BOLD, 12));
        pin_detail.setBounds(100, 400, 200, 20);
        add(pin_detail);
        
         JLabel services = new JLabel("Services Required :");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 450, 250, 30);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD,16));
        c1.setBounds(100, 500, 200, 30);
        add(c1);
        
        c2 = new JCheckBox("INTERNET BANKING");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD,16));
        c2.setBounds(350, 500, 200, 30);
        add(c2);
        
        c3 = new JCheckBox("MOBILE BANKING");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD,16));
        c3.setBounds(100, 550, 200, 30);
        add(c3);
        
        c4 = new JCheckBox("EMAIL & SMS ALERTS");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD,16));
        c4.setBounds(350, 550, 200, 30);
        add(c4);
        
        c5 = new JCheckBox("CHEQUE BOOK");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD,16));
        c5.setBounds(100, 600, 200, 30);
        add(c5);
        
        c6 = new JCheckBox("E-STATEMENT");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD,16));
        c6.setBounds(350, 600, 200, 30);
        add(c6);
        
       
        
        c7 = new JCheckBox("I hereby declares that the above entered etails are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD,12));
        c7.setBounds(100, 680, 600, 30);
        add(c7);
        
        
        
        submit= new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(220, 720, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        
        cancel= new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 720, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
        
        
        
    }
    
    
    @Override
    @SuppressWarnings("null")
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accountType=null;
            if(r1.isSelected()){
                accountType = "Saving Account";
            }else if(r2.isSelected()){
                accountType = "Fixed Deposit Account";
            }else if(r3.isSelected()){
                accountType = "Current Account";
            }else if(r4.isSelected()){
                accountType = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber = ""+ Math.abs((random.nextLong()% 9000000L))+5040936000000000L;
            
            String pinnumber = ""+Math.abs(random.nextInt()% 9000L)+1000L;
            
            String facility ="";
            if(c1.isSelected()){
                facility = facility +"ATM CARD";
            }else if(c2.isSelected()){
                facility = facility +"INTERNET BANKING";
            }else if(c3.isSelected()){
                facility = facility +"MOBILE BANKING";
            }else if(c4.isSelected()){
                facility = facility +"EMAIL & SMS ALERTS";
            }else if(c5.isSelected()){
                facility = facility +"CHEQUE BOOK";
            }else if(c6.isSelected()){
                facility = facility +"E-STATEMENT";
            }
            
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,  "Account tpye is Required");  
                     
                }
                else if(c7.equals("")){
                    JOptionPane.showMessageDialog(null,  "Tick declaration button");  
                     
                }
                else{
                  
                    Conn conn =new Conn();
                    
                    String query1 = "insert into login values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                    
                    String query2 = "insert into signupthree values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null, "Card Number :"+cardnumber+ "\n Pin :"+pinnumber);
                    
                }   
                
            }catch(Exception e){
                System.out.println(e);
            }
            
        }else if(ae.getSource()==cancel){
            
        }
    }
    
    public static void main(String args[]){
        new SignupThree("");
    }
    
}
