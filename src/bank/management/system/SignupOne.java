package bank.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.security.SecureRandom;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener {

    Long random;
    JTextField nameTextField,fnameTextField ,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JDateChooser dateChooser;
    JRadioButton male,female ,married, unmarried, other;
    JButton next;

        SignupOne(){
            setLayout(null);
    //        Random ran = new Random(); System.out.println(ran.nextLong(9000)+1000);
            setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 1");

            SecureRandom sran = new SecureRandom();
            random = sran.nextLong(9000)+1000;

            JLabel formno =new JLabel("APPLICATION FORM NO. " + random );
            formno.setBounds(170,20,600,40);
            formno.setFont(new Font("raleway",Font.BOLD,32));
            add(formno);

            JLabel personaldetails =new JLabel("Page 1: Personal Details" );
            personaldetails.setBounds(260,70,600,40);
            personaldetails.setFont(new Font("raleway",Font.BOLD,22));
            add(personaldetails);

            JLabel  name = new JLabel("Name:");
            name.setFont(new Font("raleway",Font.BOLD,20));
            name.setBounds(100,120,100,100);
            add(name);

            nameTextField = new JTextField(20);
            nameTextField.setBounds(300,155,300,30);
            nameTextField.setFont(new Font("raleway",Font.BOLD,15));
            add(nameTextField);

            JLabel  fname = new JLabel("Father's Name:");
            fname.setFont(new Font("raleway",Font.BOLD,20));
            fname.setBounds(100,175,200,100);
            add(fname);

            fnameTextField = new JTextField(20);
            fnameTextField.setBounds(300,210,300,30);
            fnameTextField.setFont(new Font("raleway",Font.BOLD,15));
            add(fnameTextField);

            JLabel dob = new JLabel("Date of Birth:");
            dob.setFont(new Font("raleway",Font.BOLD,20));
            dob.setBounds(100,230,200,100);
            add(dob);

            dateChooser = new JDateChooser();
            dateChooser.setBounds(300,266,300,30);
            dateChooser.setFont(new Font("raleway",Font.BOLD,15));
            dateChooser.setForeground(Color.yellow);
            add(dateChooser);

            JLabel gender = new JLabel("Gender:");
            gender.setFont(new Font("raleway",Font.BOLD,20));
            gender.setBounds(100,286,200,100);
            add(gender);

            male = new JRadioButton("Male");
            male.setBounds(300,320,60,30);
            male.setBackground(Color.white);
            add(male);

            female = new JRadioButton("Female");
            female.setBounds(410,320,70,30);
            female.setBackground(Color.white);
            add(female);

            ButtonGroup gendergroup = new ButtonGroup(); // M/f ko group kardiya
            gendergroup.add(male);
            gendergroup.add(female);

            JLabel email = new JLabel("Email Address:");
            email.setFont(new Font("raleway",Font.BOLD,20));
            email.setBounds(100,340,200,100);
            add(email);

            emailTextField = new JTextField(20);
            emailTextField.setBounds(300,375,300,30);
            emailTextField.setFont(new Font("raleway",Font.BOLD,15));
            add(emailTextField);

            JLabel marital = new JLabel("Marital Status:");
            marital.setFont(new Font("raleway",Font.BOLD,20));
            marital.setBounds(100,395,200,100);
            add(marital);

            married = new JRadioButton("Married");
            married.setBounds(300,430,80,30);
            married.setBackground(Color.white);
            add(married);

            unmarried = new JRadioButton("Unmarried");
            unmarried.setBounds(410,430,100,30);
            unmarried.setBackground(Color.white);
            add(unmarried);

            other = new JRadioButton("Other");
            other.setBounds(525,430,100,30);
            other.setBackground(Color.white);
            add(other);

            ButtonGroup maritalgroup = new ButtonGroup(); // M/f ko group kardiya
            maritalgroup.add(married);
            maritalgroup.add(unmarried);
            maritalgroup.add(other);


            JLabel address = new JLabel("Address:");
            address.setFont(new Font("raleway",Font.BOLD,20));
            address.setBounds(100,450,200,100);
            add(address);

            addressTextField = new JTextField(20);
            addressTextField.setBounds(300,482,300,30);
            addressTextField.setFont(new Font("raleway",Font.BOLD,15));
            add(addressTextField);

            JLabel city = new JLabel("City:");
            city.setFont(new Font("raleway",Font.BOLD,20));
            city.setBounds(100,510,200,100);
            add(city);

            cityTextField = new JTextField(20);
            cityTextField.setBounds(300,545,300,30);
            cityTextField.setFont(new Font("raleway",Font.BOLD,15));
            add(cityTextField);

            JLabel state = new JLabel("State:");
            state.setFont(new Font("raleway",Font.BOLD,20));
            state.setBounds(100,565,200,100);
            add(state);

            stateTextField = new JTextField(20);
            stateTextField.setBounds(300,597,300,30);
            stateTextField.setFont(new Font("raleway",Font.BOLD,15));
            add(stateTextField);

            JLabel pincode = new JLabel("Pin Code:");
            pincode.setFont(new Font("raleway",Font.BOLD,20));
            pincode.setBounds(100,618,200,100);
            add(pincode);

            pinTextField = new JTextField(20);
            pinTextField.setBounds(300,655,300,30);
            pinTextField.setFont(new Font("raleway",Font.BOLD,14));
            add(pinTextField);

            next = new JButton("Next");
            next.setBackground(Color.black);
            next.setForeground(Color.white);
            next.setBounds(500,720,100,30);
            next.setFont(new Font("raleway",Font.BOLD,18));
            next.addActionListener(this);
            add(next);

            setSize(760,820);
            setVisible(true);
//            setLocation(60,5);
            setLocation(1960,15);
            getContentPane().setBackground(Color.white);
        }

        public void actionPerformed(ActionEvent ae){
            String formno = ""+ random;
            String name =nameTextField.getText();
            String fname =fnameTextField.getText();
            String dob =((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
            String gender = " ";
            if (male.isSelected()){
                gender = "Male";
            } else if (female.isSelected()) {
                gender= "Female";
            }
            String email = emailTextField.getText();
            String marital = " ";
            if (married.isSelected()){
                marital= "Married";
            } else if (unmarried.isSelected()) {
                marital= "Unmarried";
            } else if (other.isSelected()) {
                marital="other";
            }
            String address = addressTextField.getText();
            String city = cityTextField.getText();
            String state = stateTextField.getText();

            String pin = pinTextField.getText();

            try {
                if (name.equals("")) {
                    JOptionPane.showMessageDialog(null , "Name is Required");
                }                if (fname.equals("")) {
                    JOptionPane.showMessageDialog(null , "Father's name is Required");
                }                if (dob.equals("")) {
                    JOptionPane.showMessageDialog(null , "Date of birth is Required");
                }
                if (gender.equals("")) {
                    JOptionPane.showMessageDialog(null,"Choose any one","Gender", JOptionPane.INFORMATION_MESSAGE);
                }
                if (email.equals("")) {
                    JOptionPane.showMessageDialog(null , "Email is Required");
                }
                if (marital.equals("")) {
                    JOptionPane.showMessageDialog(null,"Choose any one","Marital Status", JOptionPane.INFORMATION_MESSAGE);
                }
                if (address.equals("")) {
                    JOptionPane.showMessageDialog(null , "Address is Required");
                }
                if (city.equals("")) {
                    JOptionPane.showMessageDialog(null , "City is Required");
                }if (state.equals("")) {
                    JOptionPane.showMessageDialog(null , "State is Required");
                }if (pin.equals("")) {
                    JOptionPane.showMessageDialog(null , "Pin Code is Required");
                }
                else {
                    conn c = new conn();
                    String query = "insert into signup values('"+formno+"' , '"+name+"' , '"+fname+"', '"+dob+"','"+gender+"','"+email+"' ,'"+marital+"' ,'"+address+"' ,'"+city+"' ,'"+state+"' ,'"+pin+"' )";

//                    conn se s ko acces kiya
                    c.s.executeUpdate(query);
                    setVisible(false);
                    new SignupTwo(formno).setVisible(true);
                }
            }catch (Exception e){
                System.out.println(e);
            }

        }
    public static void main(String[] args) {
        new SignupOne();
    }
}
