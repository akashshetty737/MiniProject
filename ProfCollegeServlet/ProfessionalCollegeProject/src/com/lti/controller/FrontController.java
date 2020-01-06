package com.lti.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.model.ProfessionalCollege;
import com.lti.services.DeleteService;
import com.lti.services.DeleteServiceImpl;
import com.lti.services.DisplayService;
import com.lti.services.DisplayServiceImpl;
import com.lti.services.RegisterService;
import com.lti.services.RegisterServiceImpl;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = (request.getServletPath());
		System.out.println(command);
		String jspName="";
		switch(command)
		{
		case "/register.do": 
		{
				
				int collegeId = Integer.parseInt(request.getParameter("collegeId"));
				String collegeName = request.getParameter("collegeName");
				String courseType = request.getParameter("courseType");
				String city = request.getParameter("city");
				double fees = Double.parseDouble(request.getParameter("fees"));
				int pincode = Integer.parseInt(request.getParameter("pincode"));
				
				RegisterService registerObj;
				try {
				
					registerObj = new RegisterServiceImpl();
					int i;
					i = registerObj.registerCollege(collegeId,collegeName,courseType,city,fees,pincode);
					System.out.println(i);
					request.getServletContext().setAttribute("register", i);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
					
			jspName = "/register.jsp";							
			break;
		}
		case "/delete.do":
		{
			int collegeId = Integer.parseInt(request.getParameter("collegeId"));
			DeleteService deleteObj;
			try {
				
				deleteObj = new DeleteServiceImpl();
				int i;
				i = deleteObj.deleteCollege(collegeId);
				System.out.println(i);
				request.getServletContext().setAttribute("delete", i);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jspName="/delete.jsp";
			break;
		}	
		
		case "/display.do":
		{
			String courseType = request.getParameter("courseType");
			String city = request.getParameter("city");
			DisplayService displayObj;
			try {
				
				displayObj = new DisplayServiceImpl();
				List<ProfessionalCollege> collegeList;
				collegeList = displayObj.viewCollege(city,courseType);
				System.out.println(collegeList);
				request.getServletContext().setAttribute("display", collegeList);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			jspName="/display.jsp";
			break;
		}	
		}
		RequestDispatcher dispatch = request.getRequestDispatcher(jspName);
		dispatch.forward(request, response);
	}
		
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
