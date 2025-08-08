package dd;


//import java.sql.DriverManager;

import java.sql.*;

public class DBConnect
{
public static void main(String[] args)
	{

	try {
		//Load JDBC Driver
		
		Class.forName("");
		
		//Establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Manisha@123");
		
		System.out.println("Connected Successsfully");
		con.close();
	}
		catch (Exception e)
	{
			e.printStackTrace();
			
		}
	}
}

