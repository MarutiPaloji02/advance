package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/mywish")
public class TubelightServlet extends HttpServlet {
	
	public TubelightServlet() {
	System.out.println("created tubelight..");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Created doGet method in tubelight");
	}
	

}
