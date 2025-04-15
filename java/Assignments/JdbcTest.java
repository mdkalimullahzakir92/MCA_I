package Assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcTest {
    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mysql";

        String user = "Kalim";
        String password = "OraclE@121";

        try {

            // loading driver
            Class.forName(driver);

            // connection to db
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("connected successfully!");

            Statement st = con.createStatement();
            String name = "Abid";
            String mobile = "9087654321";
            String email = "abid@gmail.com";

            boolean n= st.execute("insert into Student values( '" +name+ "','" + mobile+ "','"+  email+ "');");

//            if (!n)
//                System.out.println("data added successfully");
            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
