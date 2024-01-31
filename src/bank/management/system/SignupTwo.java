package bank.management.system;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupTwo extends JFrame implements ActionListener {
    JComboBox occupationcombo,educationcombo,incomecombo,categorycombo,religioncombo;
    JTextField panTextField,aadharTextField;
    JRadioButton yes, no,accyes,accno;
    String formno;
    SignupTwo(String formno){
        this.formno= formno;
//        formno = this.formno; XXXXX
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionaldetails =new JLabel("Page 2: Additional Details" );
        additionaldetails.setFont(new Font("raleway",Font.BOLD,32));
        additionaldetails.setBounds(170,20,600,40);
        add(additionaldetails);

        JLabel religion =new JLabel("Religion:" );
        religion.setFont(new Font("raleway",Font.BOLD,20));
        religion.setBounds(100,80,100,100);
        add(religion);

        String [] valreligion= { "Hindu", "Muslim", "Sikh", "christian", "Other"};
        religioncombo = new JComboBox(valreligion);
        religioncombo.setBounds(300,112,306,30);
        religioncombo.setBackground(Color.white);
        add(religioncombo);

        JLabel  category = new JLabel("category:");
        category.setFont(new Font("raleway",Font.BOLD,20));
        category.setBounds(100,140,100,100);
        add(category);

        String [] valcategory= { "General", "OBC", "SC", "ST", "Other"};
        categorycombo = new JComboBox(valcategory);
        categorycombo.setBounds(300,173,306,30);
        categorycombo.setBackground(Color.white);
        add(categorycombo);

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("raleway",Font.BOLD,20));
        income.setBounds(100,200,100,100);
        add(income);

        String [] valincome= { "Null", "< 1,50,000", "< 2,50,0000", "Upto 10,00,000"};
        incomecombo = new JComboBox(valincome);
        incomecombo.setBounds(300,235,306,30);
        incomecombo.setBackground(Color.white);
        add(incomecombo);

        JLabel education = new JLabel("Educational");
        education.setFont(new Font("raleway",Font.BOLD,20));
        education.setBounds(100,260,300,100);
        add(education);

        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("raleway",Font.BOLD,20));
        qualification.setBounds(100,290,300,100);
        add(qualification);

        String [] valeducation= { "Non-Graduation", "Graduate", "Post-Graduation", "Doctrate","Others"};
        educationcombo = new JComboBox(valeducation);
        educationcombo.setBounds(300,323,308,30);
        educationcombo.setBackground(Color.white);
        add(educationcombo);

        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("raleway",Font.BOLD,20));
        occupation.setBounds(100,350,300,100);
        add(occupation);

        String [] valeoccupation= { "Self-Employed", "Bussiness", "Student", "Retired","Others"};
        occupationcombo = new JComboBox(valeoccupation);
        occupationcombo.setBounds(300,385,308,30);
        occupationcombo.setBackground(Color.white);
        add(occupationcombo);

        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("raleway",Font.BOLD,20));
        pan.setBounds(100,410,300,100);
        add(pan);

        panTextField = new JTextField(10);
        panTextField.setFont(new Font("raleway",Font.BOLD,14));
        panTextField.setBounds(300,445,308,30);
        add(panTextField);

        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("raleway",Font.BOLD,20));
        aadhar.setBounds(100,470,300,100);
        add(aadhar);

        aadharTextField = new JTextField(10);
        aadharTextField.setFont(new Font("raleway",Font.BOLD,14));
        aadharTextField.setBounds(300,507,308,30);
        add(aadharTextField);

        JLabel senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("raleway",Font.BOLD,20));
        senior.setBounds(100,530,300,100);
        add(senior);

        yes = new JRadioButton("Yes");
        yes.setFont(new Font("raleway",Font.BOLD,14));
        yes.setBackground(Color.white);
        yes.setBounds(300,567,100,30);
        add(yes);

        no = new JRadioButton("No");
        no.setFont(new Font("raleway",Font.BOLD,14));
        no.setBackground(Color.white);
        no.setBounds(410,568,308,30);
        add(no);

        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(yes);
        seniorgroup.add(no);

        JLabel Existing = new JLabel("Existing Account:");
        Existing.setFont(new Font("raleway",Font.BOLD,20));
        Existing.setBounds(100,590,300,100);
        add(Existing);

        accyes = new JRadioButton("Yes");
        accyes.setFont(new Font("raleway",Font.BOLD,14));
        accyes.setBackground(Color.white);
        accyes.setBounds(300,627,100,30);
        add(accyes);

        accno = new JRadioButton("No");
        accno.setFont(new Font("raleway",Font.BOLD,14));
        accno.setBackground(Color.white);
        accno.setBounds(410,627,308,30);
        add(accno);

        ButtonGroup accountgroup = new ButtonGroup();
        accountgroup.add(accyes);
        accountgroup.add(accno);


        JButton next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(510,700,100,30);
        next.setFont(new Font("raleway",Font.BOLD,14));
        next.addActionListener(this);
        add(next);

        setSize(760,820);
        setVisible(true);
//        setLocation(60,5);
        setLocation(1960,15);

        getContentPane().setBackground(Color.white);
    }


    public void actionPerformed(ActionEvent ae){

        String religion = (String) religioncombo.getSelectedItem();
        String category = (String) categorycombo.getSelectedItem();
        String income = (String) incomecombo.getSelectedItem();
        String education = (String) educationcombo.getSelectedItem();
        String occupation = (String) occupationcombo.getSelectedItem();
        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();
        String senior = null;
        if(yes.isSelected()){
            senior = "Yes";
        } else if (no.isSelected()) {
            senior = "No";
        }
        String existacc = null;
        if(accyes.isSelected()){
            existacc = "Yes";
        } else if (accno.isSelected()) {
            existacc = "No";
        }

        try {

            if (pan.equals("")) {
                JOptionPane.showMessageDialog(null , "PAN is Required");
            }
            if (aadhar.equals("")) {
                JOptionPane.showMessageDialog(null , "Adhar Number is Required");
            }
            if (senior == null){
                JOptionPane.showMessageDialog(null,"Choose any one","Senior Citizen ?", JOptionPane.INFORMATION_MESSAGE);
            }
            if (existacc==null){
                JOptionPane.showMessageDialog(null,"Choose any one","Having existing account?", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                conn c = new conn();
                String query = "insert into signuptwo values('"+formno+"' ,'"+religion+"' , '"+category+"' , '"+income+"', '"+education+"','"+occupation+"','"+pan+"' ,'"+aadhar+"' ,'"+senior+"' ,'"+existacc+"')";

//                    conn se s ko acces kiya
                c.s.executeUpdate(query);

//                signuthree object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        new SignupTwo("");
    }
}
