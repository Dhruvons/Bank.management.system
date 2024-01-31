package bank.management.system;
import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    //dusri class me eska obj bana k call karenge conn ko
    public conn(){
        try {
//         1-->   to register driver
//            Class. forName(com.mysql.cj.jdbc.Driver);// driver name jo library me hota h (no need)

//         2--> create connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","bholenathji");
            System.out.println(c);
//            3--> create statement
            s = c.createStatement();


        }
        //kyu try cacth use kar rhae coz sql ek external entity h to errror ane k chances jada h
        catch (Exception e){
            System.out.println(e);
        }
    }
}
