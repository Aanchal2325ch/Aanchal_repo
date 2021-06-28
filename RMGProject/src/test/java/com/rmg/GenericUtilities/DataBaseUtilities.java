package com.rmg.GenericUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;
public class DataBaseUtilities {
	static Driver driver;
	static Connection con=null;
	static ResultSet result;
	
	/**
	 * This methodwill do the database connection
	 */
	public void connectDB() {
		  try {
		   driver=new Driver();
		   DriverManager.registerDriver(driver);
		   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
		  } catch (SQLException e) {
		   e.printStackTrace();
		  }

		 }

	/**
	 * this will execute query
	 * @param query
	 * @param col
	 * @param expectedData
	 * @return
	 * @throws SQLException
	 */
	
	public String executeQueryAndGetData(String query,int col, String expectedData) throws SQLException {
		
		boolean flag=false;
		result=con.createStatement().executeQuery(query);
		while (result.next()) {
			if (result.getString(col).equals(expectedData)) {
				flag=true;
				break;
				
			}
			
		}
		if (flag) {
			System.out.println(expectedData+"data is verified");
			return expectedData;
		}
		else {
			System.out.println(col+"data is not verified");
			return expectedData;
		}
		
	}
	/**
	 * this will close connection
	 * @throws SQLException
	 */
	public void closeDb() throws SQLException {
		con.close();
	}
	
	public ResultSet executeQuery(String query) {
		try {
			result=con.createStatement().executeQuery(query);
			return result;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	
	

}
