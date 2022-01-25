import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData {

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentList","root","");
		Statement st = con.createStatement();
		
		String query = "SELECT * from studentdata";		
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println("ID = " + rs.getInt(1));
			System.out.println("Name = " + rs.getString(2));
			System.out.println("Roll no = " + rs.getInt(3));
			System.out.println("Address = " + rs.getString(4));
			System.out.println("--------------");
		}
		st.close();
		con.close();

	}

}
