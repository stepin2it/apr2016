package com.stepin2it.dynamicweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo
 */
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	/* 
    public ServletDemo() {
        super();
      
    }
	*/
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
	   	 
		out.println("This is a Servlet");
		
		// request object is examined to check for null case
		if ((request.getParameter("firstname") == null)
	  			 || (request.getParameter("lastname") == null))
	  	 {
	  		 
	  		String firstName = request.getParameter("firstname");
	  		String lastName = request.getParameter("lastname");
			request.setAttribute("firstname", firstName);
	  		request.setAttribute("lastname", lastName);	 
	  		getServletContext().getRequestDispatcher("/output.jsp").forward(request, response);

	  	 }

	}

}
