import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class UpdateData 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentList","root","");
		Statement st = con.createStatement();
		
		String query = "UPDATE studentdata SET Name = 'Aman', Address = 'Lakeside' WHERE Id = 1";
		st.executeUpdate(query);
		System.out.println("Data is updated.");
		
		st.close();
		con.close();
	}
}
