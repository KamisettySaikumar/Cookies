package com.sai.Sarvlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("./Cookies")
public class Cookies extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   //get the requested form data
		 String username=request.getParameter("username");
		 String age=request.getParameter("age");
		 //create cookie object
		 Cookie cookie1=new Cookie("username","username");
		 Cookie cookie2=new Cookie("age","age");
		 //add cookie into response object
		 response.addCookie(cookie1);
		 response.addCookie(cookie2);
		 RequestDispatcher dispatcher=request.getRequestDispatcher("Form2.html");
		 dispatcher.forward(request, response);
	}
		
	}