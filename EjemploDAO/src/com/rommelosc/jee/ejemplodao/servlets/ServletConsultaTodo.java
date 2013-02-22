package com.rommelosc.jee.ejemplodao.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rommelosc.jee.ejemplodao.bussines.ConsultaTodosDelegate;
import com.rommelosc.jee.ejemplodao.bussines.ConsultaTodosDelegateImpl;
import com.rommelosc.jee.ejemplodao.dto.EstudianteDTO;

/**
 * Servlet implementation class ServletConsultaTodo
 */
@WebServlet("/ServletConsultaTodo")
public class ServletConsultaTodo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Bussines Delegate
		ConsultaTodosDelegate consultaTodosDelegate = new ConsultaTodosDelegateImpl();
		List<EstudianteDTO> estudiantes = consultaTodosDelegate.consultaTodos();
		
		request.setAttribute("listaEstudiantes", estudiantes);
		
		// Vista
		RequestDispatcher dispatcher = request.getRequestDispatcher("listaEstudiantes.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
