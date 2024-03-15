package assignment;

import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddDetailsServlet extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		try {
			System.out.println("prinrting 1...");
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String aName=req.getParameter("name");
		String aEmail=req.getParameter("email");
		int aAge=Integer.parseInt(req.getParameter("age"));
		String dateString= req.getParameter("dob");
 	    Date dob = null;
         try {
             SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
             java.util.Date parsedDate = sdf.parse(dateString);
             dob = new Date(parsedDate.getTime());
         } 
         catch (Exception e) {
             e.printStackTrace();
             res.getWriter().println("Error parsing date: " + e.getMessage());
             return;
         }
        UserBean ub=new UserBean();
         ub.setName(aName);
         ub.setEmail(aEmail);
         ub.setAge(aAge);
         ub.setDate(dob);
         System.out.println("Pring2..");
        int k=new AddDetailsDAO().insert(ub);
        if(k>0) {
        	pw.println("Details added");
        }
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	

}
