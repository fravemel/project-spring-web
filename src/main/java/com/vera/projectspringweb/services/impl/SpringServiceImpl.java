/**
 * 
 */
package com.vera.projectspringweb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vera.projectspringweb.dao.EmpleadoDAO;
import com.vera.projectspringweb.services.SpringService;

/**
 * @author usuario
 *
 */
@Service
public class SpringServiceImpl implements SpringService{
	
	@Autowired
	private EmpleadoDAO empleadoDAOImpl; 

	@Override
	public String mostrarNombreEmpresa() {
		return "Anotaciones con spring y JSF";
	}

	@Override
	public String mostrarNombreEmleado() {
		// TODO Auto-generated method stub
		return this.empleadoDAOImpl.consultarNombreEmpleado();
	}
	

}
