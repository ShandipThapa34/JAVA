import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//1. Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentlist","root","");
		
		//3. Create Statement
		Statement st = con.createStatement();
		
		//4. Send and Execute sql query
		String query = "INSERT INTO studentdata (`Name`, `Roll no.`, `Address`) VALUES (`Arjun`, 1, `Lamachaur`";
		
		int rows = st.executeUpdate(query);
		System.out.println("No. of rows affected:" + rows);
		
		st.close();
		con.close();
	}

}