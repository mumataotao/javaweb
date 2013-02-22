package com.rommelosc.jee.ejemplodao.bussines;

import com.rommelosc.jee.ejemplodao.bean.RegistroBean;
import com.rommelosc.jee.ejemplodao.dao.EstudianteDAO;
import com.rommelosc.jee.ejemplodao.dto.EstudianteDTO;

public class RegistroDelegateImpl implements RegistroDelegate{

	@Override
	public void registro(RegistroBean bean) {
		
		
		EstudianteDAO estudianteDAO = new EstudianteDAO();
		EstudianteDTO estudianteDTO = new EstudianteDTO();
		
		estudianteDTO.setMatricula(bean.getMatricula());
		estudianteDTO.setNombre(bean.getNombre());
		estudianteDTO.setCurso(bean.getCurso());
		estudianteDTO.setDireccion(bean.getDireccion());
		
		estudianteDAO.insertar(estudianteDTO);
		
	}

}
