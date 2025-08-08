package JDBC;
/*import java.util.Scanner;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DBConnect
{
public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter patient Name: ");
     String name = sc.nextLine();

     System.out.print("Enter Age: ");
     int age = Integer.parseInt(sc.nextLine());
     
     System.out.print("Enter Course: ");
     String course = sc.nextLine();

    // System.out.print("Enter Admission Date (yyyy-mm-dd): ");
    // String date = sc.nextLine();
     
     String sql = "INSERT INTO student (name, age, course) VALUES (?, ?, ?)";
	
	
	try {
		//Load JDBC Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish connection
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Manisha@123");
	//String sql="UPDATE student SET name=? WHERE name=? ";
	
	
	PreparedStatement pstmt=con.prepareStatement(sql);
	
	pstmt.setString(1, name);
    pstmt.setInt(2, age);
    pstmt.setString(3, course);
    //pstmt.setDate(4, Date.valueOf(date));

	//pstmt.setString(1, "Sai Manjeera");
	//pstmt.setString(2, "Oli");
	
	int rows=pstmt.executeUpdate();
	
	System.out.println("Student details entered successfully");
	
    }
   catch (Exception e)
  {
   e.printStackTrace();
		
 }
 }
 }*/

	/*String sql="INSERT INTO student(name, age, course) VALUES(?, ?, ?)";
	PreparedStatement pstmt=con.prepareStatement(sql);
	String[][] data=
	{
			{"Shreya", "22", "CSE"},
			{"Riya", "23", "Civil"},
			{"Manisha", "22", "Mechanical"},
			{"Oli", "22", "IT"}
	};
		for(String[] row : data)
	{
		pstmt.setString(1, row[0]);
		pstmt.setInt(2, Integer.parseInt(row[1]));
		pstmt.setString(3, row[2]);
		pstmt.executeUpdate();
	}
	System.out.println(" All students inserted successfully");
	con.close();
    }
catch (Exception e)
{
e.printStackTrace();
		
}
}
}*/

import java.sql.*;
 
public class DBConnect
{
public static void main(String[] args)
	{
 
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Manisha@123");
		
		String sql="INSERT INTO patient(name, age, disease) VALUES(?, ?, ?)";
		
		PreparedStatement pstmt=connection.prepareStatement(sql);
		//Statement statement=connection.createStatement();
		String[][] data=
		{
				{"Rahul", "22", "Fever"},
				{"Rohit", "23", "Cold"},
				{"Kuru", "22", "headche"},
				{"Sunil", "22", "Pain"}
		};
			for(String[] row : data)
		{
			pstmt.setString(1, row[0]);
			pstmt.setInt(2, Integer.parseInt(row[1]));
			pstmt.setString(3, row[2]);
			pstmt.executeUpdate();
		}
		System.out.println(" All patients inserted successfully");
		connection.close();
	    }
	catch (Exception e)
	{
	e.printStackTrace(); 
	//System.out.println(e.getMessage());
			
	}
	}
}