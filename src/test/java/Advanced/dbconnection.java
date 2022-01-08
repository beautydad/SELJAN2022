package Advanced;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class dbconnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String dburl = "jdbc:mysql://localhost:3306/joshi";
	String username = "root";
	String password = "root";
	String query = "Select username from login";
	Class.forName("con.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(dburl, username, password);
	Statement stmt =con.createStatement();
	ResultSet rs =stmt.executeQuery(query);
	 rs.next();
	{
	String name = rs.getString("name");
	String rollno = rs.getString("rollno");
	String sal= rs.getString("sal");
	System.out.println(name);
	System.out.println(rollno);
	System.out.println(sal);
	con.close();
	}
	
	}
}


