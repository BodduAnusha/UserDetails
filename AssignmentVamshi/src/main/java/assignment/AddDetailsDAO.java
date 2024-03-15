package assignment;
import java.sql.*;
import java.util.Date;
public class AddDetailsDAO {
public int k=0;
public int insert(UserBean ub) {
	try {
		Connection con=DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement("insert into users(name,email,age,dob) values(?,?,?,?)");
		ps.setString(1, ub.getName());
		ps.setString(2, ub.getEmail());
		ps.setInt(3, ub.getAge());
		ps.setDate(4, ub.getDate());
		k=ps.executeUpdate();
		System.out.println("Proing3..");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return k;
}
}
