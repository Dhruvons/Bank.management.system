package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.security.SecureRandom;

public class SignupThree extends JFrame implements ActionListener {
    JRadioButton saving,fixed,current,recurring;
    JButton cancel,submit;
    JCheckBox desclaimer,atm,internet,mobile,cheque,email,estatement;
    String formno;
    SignupThree(String formno){
        this.formno =formno;
        setLayout(null);
        setTitle("ACCOUNT DETAILS - PAGE 3");

        JLabel accountdetails =new JLabel("Page 3: Account Details" );
        accountdetails.setFont(new Font("raleway",Font.BOLD,32));
        accountdetails.setBounds(170,20,600,40);
        add(accountdetails);

        JLabel accounttype =new JLabel("Account Type" );
        accounttype.setFont(new Font("raleway",Font.BOLD,28));
        accounttype.setBounds(100,80,200,100);
        add(accounttype);

        saving = new JRadioButton("Saving Account");
        saving.setFont(new Font("raleway",Font.BOLD,14));
        saving.setBounds(105,150,150,30);
        saving.setBackground(Color.white);
        add(saving);
        fixed = new JRadioButton("Fixed Deposit Account");
        fixed.setBackground(Color.white);
        fixed.setFont(new Font("raleway",Font.BOLD,14));
        fixed.setBounds(400,150,200,30);
        add(fixed);
        current = new JRadioButton("Current Account");
        current.setBackground(Color.white);
        current.setFont(new Font("raleway",Font.BOLD,14));
        current.setBounds(105,190,150,30);
        add(current);
        recurring = new JRadioButton("Recuring Deposit Account");
        recurring.setBackground(Color.white);
        recurring.setFont(new Font("raleway",Font.BOLD,14));
        recurring.setBounds(400,190,250,32);
        add(recurring);

        ButtonGroup accountgroup = new ButtonGroup();
        accountgroup.add(saving);
        accountgroup.add(recurring);
        accountgroup.add(fixed);
        accountgroup.add(current);

        JLabel  card = new JLabel("Card Number");
        card.setFont(new Font("raleway",Font.BOLD,28));
        card.setBounds(100,230,230,100);
        add(card);

        JLabel cardno = new JLabel("XXXX-XXXX-XXXX-4184");
        cardno.setFont(new Font("raleway",Font.BOLD,20));
        cardno.setBounds(400,233,250,100);
        add(cardno);

        JLabel  cardnodigit = new JLabel("Your 16 Digit card Number");
        cardnodigit.setFont(new Font("raleway",Font.BOLD,12));
        cardnodigit.setBounds(103,253,290,100);
        add(cardnodigit);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("raleway",Font.BOLD,28));
        pin.setBounds(100,320,100,100);
        add(pin);

        JLabel pinno = new JLabel("XXXX");
        pinno.setFont(new Font("raleway",Font.BOLD,20));
        pinno.setBounds(400,318,250,100);
        add(pinno);

        JLabel pindigit = new JLabel("Your 4 Digit Passward:");
        pindigit.setFont(new Font("raleway",Font.BOLD,12));
        pindigit.setBounds(100,345,150,100);
        add(pindigit);
//
//
        JLabel services = new JLabel("Services Required");
        services.setFont(new Font("raleway",Font.BOLD,28));
        services.setBounds(100,410,250,100);
        add(services);
//
        atm = new JCheckBox("ATM CARD");
        atm.setFont(new Font("raleway",Font.BOLD,14));
        atm.setBackground(Color.white);
        atm.setBounds(107,480,120,30);
        add(atm);

        internet = new JCheckBox("Internet Banking");
        internet.setFont(new Font("raleway",Font.BOLD,14));
        internet.setBackground(Color.white);
        internet.setBounds(400,480,200,30);
        add(internet);

        mobile = new JCheckBox("Mobile Banking");
        mobile.setFont(new Font("raleway",Font.BOLD,14));
        mobile.setBackground(Color.WHITE);
        mobile.setBounds(107,525,150,28);
        add(mobile);
         cheque = new JCheckBox("Cheque Book");
        cheque.setFont(new Font("raleway",Font.BOLD,14));
        cheque.setBackground(Color.white);
        cheque.setBounds(107,570,170,30);
        cheque.setBackground(Color.white);
        add(cheque);
        email = new JCheckBox("EMAIL & SMS Alert");
        email.setFont(new Font("raleway",Font.BOLD,14));
        email.setBackground(Color.white);
        email.setBounds(400,525,170,30);
        add(email);
        estatement = new JCheckBox("E-Statement");
        estatement.setFont(new Font("raleway",Font.BOLD,14));
        estatement.setBackground(Color.white);
        estatement.setBounds(400,570,170,30);
        add(estatement);
//
        desclaimer = new JCheckBox("<html> I hereby declares that the above entered details are correct to the <br> best of knowledge</html> ");
        desclaimer.setFont(new Font("raleway",Font.BOLD,14));
        desclaimer.setBounds(107,650,700,33);
        desclaimer.setBackground(Color.white);
        add(desclaimer);

        submit = new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setBounds(230,725,100,30);
        submit.setFont(new Font("raleway",Font.BOLD,14));
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setBounds(410,725,100,30);
        cancel.setFont(new Font("raleway",Font.BOLD,14));
        cancel.addActionListener(this);
        add(cancel);

        setSize(760,820);
        setVisible(true);

//        setLocation(60,5);
        setLocation(1960,15);
        getContentPane().setBackground(Color.white);


    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== submit){

            String accounttype = " ";
            if(saving.isSelected()){
                accounttype = "Saving Account";
            } else if (current.isSelected()) {
                accounttype = "Current Account";
            } else if (recurring.isSelected()) {
                accounttype = "Recuring Deposit Account";
            } else if (fixed.isSelected()) {
                accounttype = "Fixed deposit Account";
            }

            SecureRandom securandom = new SecureRandom();
            String cardnumber = " "  + Math.abs ((securandom.nextLong() %900000000L) +31785600000000L);

            String pinnumber = " "+ Math.abs ((securandom.nextLong() %9000L)+1000L);

            String facility = " ";
            if(atm.isSelected()){
                facility = facility + "ATM CARD";
            } else if (cheque.isSelected()) {
                facility = facility + "Cheque Book";
            }
            else if (mobile.isSelected()) {
                facility = facility + "Mobile Banking";
            }
            else if (internet.isSelected()) {
                facility = facility + "Internet Banking";
            } else if (email.isSelected()) {
                facility = facility + "EMAIL&SMS Alert";
            } else if (estatement.isSelected()) {
                facility = facility + "E-Statementg";
            }
            String desclaim = " ";
            if (desclaimer.isSelected()){
                desclaim = "Checked";
            }

            try {

            if (accounttype.equals(" ")) {
                JOptionPane.showMessageDialog(null , "Account type is Required");
            }
            if (desclaim.equals(" ")) {
                JOptionPane.showMessageDialog(null , "Please check Disclaimer");
            }

            else {
                conn c = new conn();
                String query1 = "insert into signupthree values('"+formno+"','"+accounttype+"','"+cardnumber+"','"+pinnumber+"' ,'"+facility+"' , '"+desclaim+"')";

                String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";

//                    conn se s ko acces kiya
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);

                JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: "+ pinnumber,"Successfully Generated",JOptionPane.INFORMATION_MESSAGE);

//                System.exit(0);
            }
        }catch (Exception e){
            System.out.println(e);
        }

        } else if (ae.getSource() == cancel) {
            
        }


//

    }

    public static void main(String[] args) {
        new SignupThree(" ");
    }
}
