package assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewDetailsDAO {
	ArrayList<UserBean>al =new ArrayList<>();
	public ArrayList<UserBean> retreive(){
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from users");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				UserBean ub= new UserBean();
			    ub.setId(rs.getInt(1));
				ub.setName(rs.getString(2));
				ub.setEmail(rs.getString(3));
				ub.setAge(rs.getInt(4));
				ub.setDate(rs.getDate(5));
				System.out.println("...print3333");		
				al.add(ub);		
		}		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return al;
	}
}
