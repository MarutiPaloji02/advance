package com.xworkz.servletMethod;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/sports" )
public class Badminton extends HttpServlet {
	
	public Badminton() {
		System.out.println("Created Badminton...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Created doGet method in in Badminton ");
		String data="Car race";
		PrintWriter Writer = resp.getWriter();
		Writer.print(data);
		resp.setContentType("text/plain");  //browser
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Created doPost method in Badminton");
		String data="Curd rice";
		PrintWriter Writer = resp.getWriter();
		Writer.print(data);
		resp.setContentType("text/plain");  //browser
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Created doPut method in Badminton");
		String data="Ghost";
		PrintWriter Writer = resp.getWriter();
		Writer.print(data);
		resp.setContentType("text/plain");  //browser
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Created doDelete method in Badminton");
	String data="Birthday";
	PrintWriter Writer = resp.getWriter();
	Writer.print(data);
	resp.setContentType("text/plain");  //browser
	}
	
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Created doOptions method in Badminton");
	String data="Good Night";
	PrintWriter Writer = resp.getWriter();
	Writer.print(data);
	resp.setContentType("text/plain");  //browser
	}
	
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Created doTrace method in Badminton");
		String data="Good Afternoon";
		PrintWriter Writer = resp.getWriter();
		Writer.print(data);
		resp.setContentType("text/plain");  //browser
	}
	

}
