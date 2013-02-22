package com.rommelosc.jee.ejemplodao.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rommelosc.jee.ejemplodao.bean.RegistroBean;
import com.rommelosc.jee.ejemplodao.bussines.RegistroDelegate;
import com.rommelosc.jee.ejemplodao.bussines.RegistroDelegateImpl;

/**
 * Servlet implementation class ServletRegistro
 */
@WebServlet("/ServletRegistro")
public class ServletRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RegistroBean bean = new RegistroBean();
		bean.setMatricula((String)request.getParameter("matricula"));
		bean.setNombre((String)request.getParameter("nombre"));
		bean.setCurso((String)request.getParameter("curso"));
		bean.setDireccion((String)request.getParameter("direccion"));

		// Bussines delegate
		RegistroDelegate registroDelegate = new RegistroDelegateImpl();
		registroDelegate.registro(bean);
		
		// Vista
		response.sendRedirect("index.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
