import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args){
        String URL="jdbc:mysql://localhost:3306/Students";
        String USER="root";
        String PASSWORD="sharmi";
        try{
            Connection con=DriverManager.getConnection(URL,USER,PASSWORD);
            String insertSQL = "INSERT INTO Person(RenewalId,F_name,L_name,Email,Renewal_date)VALUES(?,?,?,?,?)";

            PreparedStatement insertStatement = con.prepareStatement(insertSQL);
            insertStatement.setInt(1,121);//RenewalId
            insertStatement.setString(2,"Sharmila");
            insertStatement.setString(3,"Manikkam");
            insertStatement.setString(4,"sharmi@gmail.com");
            insertStatement.setString(5,"2024-08-19");
            insertStatement.executeUpdate();
            System.out.println("Insert operation Completed");
            insertStatement.executeUpdate();
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
    }
}
