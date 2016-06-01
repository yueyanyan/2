package util;

import java.sql.*;

public class DButil {  
  private static String driverName; 
  private static String dbURL;
  static{
	  driverName ="org.sqlite.JDBC";
	  dbURL="jdbc:sqlite:\\C:/Users/HP/github/aa.db";
	  }
      

	public static Connection open(){
		try {
				Class.forName(driverName);
			try {
				return DriverManager.getConnection(dbURL);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void close(Connection Conn){
		if(Conn != null){
			try {
				Conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}
}

