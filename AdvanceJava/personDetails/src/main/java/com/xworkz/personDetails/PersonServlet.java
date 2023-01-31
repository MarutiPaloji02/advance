package com.xworkz.personDetails;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,name="PersonServlet",urlPatterns="/pers")
public class PersonServlet extends HttpServlet {
	
	public PersonServlet() {
		System.out.println("created PersonServlet......");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPst in PersonServlet...");
		
		String firstName=req.getParameter("fName");
		String lastName=req.getParameter("lName");
		String gender=req.getParameter("gender");
		String reason=req.getParameter("reason");
		String address=req.getParameter("address");
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(gender);
		System.out.println(reason);
		System.out.println(address);
		
		RequestDispatcher dispatcher= req.getRequestDispatcher("Display.jsp");
		req.setAttribute("fName",firstName);
		req.setAttribute("lName",lastName);
		req.setAttribute("gender",gender);
		req.setAttribute("reason",reason);
		req.setAttribute("address",address);
		
	    dispatcher.forward(req, resp);

	}

}
