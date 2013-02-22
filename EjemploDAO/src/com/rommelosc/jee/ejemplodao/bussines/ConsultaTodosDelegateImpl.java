package com.rommelosc.jee.ejemplodao.bussines;

import java.util.List;

import com.rommelosc.jee.ejemplodao.dao.EstudianteDAO;
import com.rommelosc.jee.ejemplodao.dto.EstudianteDTO;

public class ConsultaTodosDelegateImpl implements ConsultaTodosDelegate {

	@Override
	public List<EstudianteDTO> consultaTodos() {
		EstudianteDAO dao = new EstudianteDAO();
		List<EstudianteDTO> result = dao.consultaTodos();
		return result;
	}

}
