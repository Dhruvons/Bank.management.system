package bank.management.system;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.sql.*;

// to aply action implement an interface
public class Login extends JFrame implements ActionListener {

JButton login, clear, signup; // assign localy taki me bhar bhi use kar pau
JTextField cardTextField;
JPasswordField pinTextField; // ******* ayega
Login(){
    //FOR IMG
    setLayout(null); //jo jaga peheles e dine h use null karna h

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
//        to chg size make obj of img class
    Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2); // me resize seedha label me nahi dal sakta, usko imagicon bana diya
//        to paste img on frame
    JLabel label = new JLabel(i3);
    label.setBounds(70,10,100,100); // 100 means img ko w/h 100 ki hi do jitna 100 me ajaye bhoot h
    add(label);

    JLabel text= new JLabel("Welcome to ATM ");
    text.setBounds(200, 40,800,40);// set karna pade ga coz layout upper null kardiy
    text.setFont(new Font("Osward",Font.BOLD,38));
    add(text);

    JLabel cardno = new JLabel("Card No:");
    cardno.setBounds(120, 150,800,40);
    cardno.setFont(new Font("Raleway",Font.BOLD,28));
    add(cardno);

    cardTextField = new JTextField();
    cardTextField.setBounds(280, 155,270,30);
    cardTextField.setFont(new Font("Arial",Font.BOLD,15));
    add(cardTextField);


    JLabel pin = new JLabel("PIN:");
    pin.setBounds(120, 230,800,40);
    pin.setFont(new Font("Raleway",Font.BOLD,28));
    add(pin);

    pinTextField = new JPasswordField();
    pinTextField.setBounds(280, 235,270,30);
    pinTextField.setFont(new Font("Arial",Font.BOLD,15));
    add(pinTextField);

     login = new JButton("SIGN IN");
    login.setBounds(280, 320,100,30);
    login.setBackground(Color.black);
    login.setForeground(Color.white);
    login.addActionListener(this); // its tell that button pe hal chal hui h
    add(login);

     clear = new JButton("CLEAR");
    clear.setBounds(450, 320,100,30);
    clear.setBackground(Color.black);
    clear.setForeground(Color.white);
    clear.addActionListener(this);
    add(clear);

     signup = new JButton("SIGN UP");
    signup.setBounds(280, 375,270,30);
    signup.setBackground(Color.black);
    signup.setForeground(Color.white)  ;
    signup.addActionListener(this);
    add(signup);


    setTitle("ATOMATED TELLR MACHINE");
    setSize(700 , 500);
    setVisible(true);
        setLocation(60,5); // kahn pe frame open hoga
//    setLocation(1960,15);
//        to chg color of frame
    getContentPane().setBackground(Color.white); // color ek class h
}


public void  actionPerformed(ActionEvent ae) { // jab bhi button   pe hal chal hue to ye jag jaye
    if (ae.getSource() == clear) { // if clear click hua h to ye
        cardTextField.setText("");
        pinTextField.setText("");
    }
    else if (ae.getSource() == login) {
        conn c = new conn();
        String formno = "9551";
        String cardnumberr = cardTextField.getText().trim();
        System.out.println(cardnumberr);
        String pinn = pinTextField.getText().trim();
        System.out.println(pinn);
        String query =
//                "Select * from login where cardnumber = '" + cardnumberr + "' and pinnumber = '" + pinn + "'";
                "Select * from login where  pinnumber = '" + pinn + "'";
//        String query2 ="SELECT * FROM login WHERE cardnumber = 31784964152653  AND pinnumber = 7635";
//        "SELECT * FROM login WHERE formno = '" + formno + "'";

        try {
            ResultSet rs = c.s.executeQuery(query); // return type eska jese int , String hota vese resultset hota h
            if (rs.next()) {
                setVisible(false);
                new Transaction().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "NO ACCOUNT FOUND", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    else if (ae.getSource() == signup) {
        setVisible(false);
        SignupOne si = new SignupOne();
        si.setVisible(true);
    }
}
public static void main(String[] args) {
    new Login();


}
}
