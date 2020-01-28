package com.sss.seatmgmt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.sss.seatmgmt.dao.EmployeeDAO;
import com.sss.seatmgmt.model.Employee;
import com.sss.seatmgmt.model.Location;
import com.sss.seatmgmt.util.HibernateUtil;

public class EmployeeServlet extends HttpServlet {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4628979845846502209L;

	public void init() {
		HibernateUtil.loadSessionFactory();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		System.out.println("doGet");
		EmployeeDAO empDao = new EmployeeDAO();
		List<Employee> employees = empDao.getAllEmployees();
		ObjectMapper mapper = new ObjectMapper();
		try {
			String jsonStrRes = mapper.writeValueAsString(employees);
			System.out.println(jsonStrRes);
			response.setContentType("application/json");
			PrintWriter out = response.getWriter();
			out.write(jsonStrRes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		System.out.println("doPost");
		
		String jsonLocations = request.getParameter("locations");
		System.out.println(jsonLocations);
		ObjectMapper mapper = new ObjectMapper();
		try {
			List<Location> locations = mapper.readValue(jsonLocations, TypeFactory.defaultInstance().constructCollectionType(List.class, Location.class));
			EmployeeDAO empDao = new EmployeeDAO();
			empDao.saveEmployeeLocations(locations);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
