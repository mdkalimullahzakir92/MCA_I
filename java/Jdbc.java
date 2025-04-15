
//import java.sql.*;

import java.sql.*;

public class Jdbc {
    public static void main(String[] args) {
        System.out.println("Abdullah");
//        String driver = "oracle.jdbc.driver.OracleDriver";
        String driver = "com.mysql.jdbc.Driver";
//        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String url = "jdbc:mysql://localhost:3306/mysql";
//        String user = "system";
        String user = "Kalim";
//        String password = "student";
        String password = "OraclE@121";

        try {
//            DriverManager.registerDriver(Driver);     --ignore it

            // loading driver
//           Class.forName(driver);
            System.out.println("loaded successfully!");

            // connection to db
            Connection con = DriverManager.getConnection(url, user, password);


            Statement st = con.createStatement();
            String name = "Md_Kalimullah";
            String mobile = "9087654321";
            String email = "kalimemail@gmail.com";
//            boolean n= st.execute("insert into newStudent values( " +name+ "," + mobile+ ","+  email + ");");
//            boolean n= st.execute("insert into student values( '" +name+ "','" + mobile+ "','"+  email+ "');");
//            if (n)
//                System.out.println("data added successfully");

            String q= "select * from bookDB where author=?";
            PreparedStatement pst = con.prepareStatement(q);
            pst.setString(1,"James Gosling");
            ResultSet rs= pst.executeQuery();
//            System.out.println(rs.getArray(0));
            int i=1;
            while (rs.next()) {
                    System.out.print(rs.getString(i) + "\t");
                }

            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
