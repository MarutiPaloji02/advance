package com.xworkz.sendDetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {
	
	public ContactServlet() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost method in ContactServlet...");
	}
	
	String name = req.getParameter("name");
	String email = req.getParameter("email");
	String mobileNo = req.getParameter("mobileNo");
	String comments =req.getParameter("comments");
	
	System.out.println(name);
	System.out.println(email);
	System.out.println(mobileNo);
	System.out.println(comments);
	

	PrintWriter writer = resp = resp.getWriter();
	writer.print("<html>");
	writer.print("<h1>");
	
	if(name.length() > 3) {
		writer.print("<span style = 'color:green';>");
		writer.print("Sign up successfull");
	}
	else {
		writer.print("<span style='color:red';>");
		writer.print("Invalid name:" + name);
	}
	
	writer.print("<pre>");
	writer.print("<a href = 'contact.html'>Send again<a/>");
	writer.print("<pre/>");
	
	writer.print("<pre>");
	writer.print("<a href = 'index.html'>Home Page<a/>");
	writer.print("<pre/>");
	writer.print("</span>");
	writer.print("</h1>");
	writer.print("</body");
	writer.print("</html");
	
	resp.setContentType("text/html");
	
}

