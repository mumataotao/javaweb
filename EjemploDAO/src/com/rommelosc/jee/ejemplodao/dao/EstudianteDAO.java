package com.rommelosc.jee.ejemplodao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rommelosc.jee.ejemplodao.dto.EstudianteDTO;
import com.rommelosc.jee.ejemplodao.util.DataBase;

public class EstudianteDAO extends DAO {

	public EstudianteDAO() {
		
		try {
			connection = getConnection(DataBase.MYSQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertar(EstudianteDTO dto) {

		try {

			ps = connection.prepareStatement(INSERTA);
			ps.setString(1, dto.getMatricula());
			ps.setString(2, dto.getNombre());
			ps.setString(3, dto.getCurso());
			ps.setString(4, dto.getDireccion());
			ps.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		} 

	}
	
	public List<EstudianteDTO> consultaTodos(){
		
		List<EstudianteDTO>estudiantes = new ArrayList<EstudianteDTO>();
		
		try {

			ps = connection.prepareStatement(CONSULTA_TODOS);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				estudiantes.add( getDTO(rs) );
			}
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return estudiantes;
	}
	
	public List<EstudianteDTO> consultaPorCurso(String curso) {

		List<EstudianteDTO> estudiantes = new ArrayList<EstudianteDTO>();

		try {

			ps = connection.prepareStatement(CONSULTA_POR_CURSO);
			ps.setString(1, curso);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				estudiantes.add(getDTO(rs));
			}
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return estudiantes;
	}
	
	private EstudianteDTO getDTO(ResultSet rs) throws SQLException{
		EstudianteDTO dto = new EstudianteDTO();
		dto.setMatricula( rs.getString(CAMPO_MATRICULA) );
		dto.setNombre( rs.getString(CAMPO_NOMBRE) );
		dto.setCurso( rs.getString(CAMPO_CURSO) );
		dto.setDireccion( rs.getString(CAMPO_DIRECCION) );
		return dto;
	}
	
	/* Variables */
	private Connection 			connection = null;
	private PreparedStatement 	ps 		   = null;
		
	/* Tablas */
	private static final String TABLA = "estudiante";
	
	/* Campos */
	private static final String CAMPO_MATRICULA = "matricula"	;
	private static final String CAMPO_NOMBRE 	= "nombre"		;
	private static final String CAMPO_CURSO 	= "curso"		;
	private static final String CAMPO_DIRECCION = "direccion"	;
	
	/*Queries  */
	private static final String INSERTA			= 		"INSERT INTO " 		+ 
													  	TABLA 				+ 	" ("	+ 
													  	CAMPO_MATRICULA 	+ 	", "    + 
													  	CAMPO_NOMBRE 		+ 	", "	+ 
													  	CAMPO_CURSO 		+  	", "    + 
													  	CAMPO_DIRECCION 	+ 	")"		+
													  	"VALUES(?,?,?,?)";
	
	private static final String CONSULTA_TODOS	= 		"SELECT "			+
													  	CAMPO_MATRICULA		+	","		+
													  	CAMPO_NOMBRE		+	","		+
													  	CAMPO_CURSO			+	","		+
													  	CAMPO_DIRECCION		+
													  	" FROM "			+
													  	TABLA;
	
	private static final String CONSULTA_POR_CURSO	= 	"SELECT "			+
														CAMPO_MATRICULA		+	","		+
														CAMPO_NOMBRE		+	","		+
														CAMPO_DIRECCION		+
														" FROM "			+
														TABLA				+
														" WHERE "			+
														CAMPO_CURSO			+	"=?"	;
}
