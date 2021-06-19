/**
 * 
 */
package com.vera.projectspringweb.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.vera.projectspringweb.services.SpringService;

/**
 * @author vera
 * 
 * Clase de prueba unitaria con Spring y JUNIT 4
 * NOTA: no tiene sopoerte Srping Test para JUnit5
 *
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-test.xml"})
public class SpringJUnit4Test {
	
	@Autowired
	private SpringService springServiceImpl;

	@Test
	public void test() {
		assertNotNull(springServiceImpl);
		this.springServiceImpl.mostrarNombreEmleado();
	}

}
