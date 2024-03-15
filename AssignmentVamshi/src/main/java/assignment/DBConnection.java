package assignment;
import java.sql.Connection;
import java.sql.DriverManager;
import static assignment.DBInfo.driver;
import static assignment.DBInfo.url;
import static assignment.DBInfo.name;
import static assignment.DBInfo.pwd;

public class DBConnection {
	public static Connection con;
	private DBConnection() {}
	static{
	try {
	 Class.forName(driver);
	 con=DriverManager.getConnection(url,name,pwd);
	 
	}
	catch(Exception e) {
		e.printStackTrace();
	}}
	public static Connection getCon() {
		return con;	
	}
}
