package assignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/view")
public class ViewDetailsServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		ArrayList<UserBean> al=new ViewDetailsDAO().retreive();
		if(al.size()==0) {
			pw.println("No details");
		}
		else {
			pw.println(" Details....");
			Iterator it=al.iterator();
			while(it.hasNext()) {
				UserBean ub=(UserBean)it.next();
		//		pw.println(ub.getName()+"<br>"+ub.getEmail()+"<br>"+ub.getAge()+"<br>"+ub.getDate()+"<br>");
				ServletContext sct=req.getServletContext();
				req.setAttribute("User", al);
				RequestDispatcher rd=req.getRequestDispatcher("view.jsp");
				rd.forward(req, res);	
				
			
			}
		}
	}
	

}
