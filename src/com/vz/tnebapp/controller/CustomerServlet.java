package com.vz.tnebapp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vz.tnebapp.model.Customer;
import com.vz.tnebapp.service.CustomerService;
import com.vz.tnebapp.service.impl.CustomerServiceImpl;

/**
 * Servlet implementation class CustomerServlet
 */
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String name = request.getParameter("name");
			String age = request.getParameter("age");
			String gender = request.getParameter("gender");
			String address = request.getParameter("address");
			String phoneNo = request.getParameter("phoneNo");
			String emailAddress = request.getParameter("email");
			Customer customer = new Customer(name, age, gender, address, phoneNo, emailAddress);
			CustomerService service = new CustomerServiceImpl();
			service.addCustomer(customer);
			response.sendRedirect("contact.html");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
