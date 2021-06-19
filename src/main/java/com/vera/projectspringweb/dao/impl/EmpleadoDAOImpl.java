/**
 * 
 */
package com.vera.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.vera.projectspringweb.dao.EmpleadoDAO;

/**
 * @author usuario
 *
 */
@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		// TODO Auto-generated method stub
		return "Pepito Grillo";
	}

}
